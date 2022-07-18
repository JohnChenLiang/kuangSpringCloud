package com.kuang.springcloud.controller.controller;

import com.kuang.springcloud.controller.pojo.Dept;
import com.kuang.springcloud.controller.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//提供Restful服务
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;
    @Autowired
    private DiscoveryClient client;     //获取一些配置的信息，得到具体的微服务

    //光从网址框触发这个好像不行 因为默认是get，这里是post
    @PostMapping("dept/add")
    public boolean addDept(@RequestBody Dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return deptService.queryById(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> queryAll(){
        List<Dept> list = deptService.queryAll();
        System.out.println("1111111111111111111111111");
        System.out.println(list);
        return list;
    }

    //注册进来的微服务，获取一些信息
    @GetMapping("/dept/discovery")
    public Object discovery(){
        //获取微服务列表的清单
        List<String> services = client.getServices();
        System.out.println("discovery=>services" + services);

        //得到一个具体的微服务信息，通过具体的微服务id，applicaionName;
        List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-PROVIDER-DEPT");

        for (ServiceInstance instance : instances) {
            System.out.println(
                    instance.getHost() + "\t" +
                    instance.getPort() + "\t" +
                    instance.getUri() + "\t" +
                    instance.getServiceId()
            );
        }

        return this.client;
    }

}

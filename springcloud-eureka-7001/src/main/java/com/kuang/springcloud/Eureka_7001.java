package com.kuang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//启动之后，访问http://localhost:7001/
@SpringBootApplication
@EnableEurekaServer //EnableEurekaServer 服务端的启动类，可以接受别人注册进来
public class Eureka_7001 {
    public static void main(String[] args) {
        SpringApplication.run(Eureka_7001.class, args);
    }
}

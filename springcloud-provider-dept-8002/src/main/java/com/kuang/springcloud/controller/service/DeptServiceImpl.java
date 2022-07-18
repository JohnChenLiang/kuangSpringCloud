package com.kuang.springcloud.controller.service;

import com.kuang.springcloud.controller.dao.DeptDao;
import com.kuang.springcloud.controller.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;



    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept queryById(Long id) {
        return deptDao.queryById(id);
    }

    @Override
    public List<Dept> queryAll() {
        List<Dept> list = deptDao.queryAll();
        System.out.println("22222222222");
        System.out.println(list);
        return list;
//        return deptDao.queryAll();
    }
}

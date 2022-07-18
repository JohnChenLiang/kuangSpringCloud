package com.kuang.springcloud.controller.service;

import com.kuang.springcloud.controller.pojo.Dept;

import java.util.List;

public interface DeptService {
    boolean addDept(Dept dept);

    Dept queryById(Long id);

    List<Dept> queryAll();
}

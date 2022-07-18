package com.kuang.springcloud.controller.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data //lombok的
@NoArgsConstructor //无参构造器
@Accessors(chain = true) //链式写法
public class Dept implements Serializable {
    private Long deptno; //主键
    private String dname;

    //这个数据存在那个数据库的字段。微服务 一个服务对应一个数据库，同一个信息可能存在不同的数据库
    private String dbSource;

    public Dept(String dname) {
        this.dname = dname;
    }


    /*
      正常写法： Dept dept = new Dept(); //后面再一行行set
      链式写法: dept.setDeptNo(11).setDname('sss').setDbSource('001');
    * */
}

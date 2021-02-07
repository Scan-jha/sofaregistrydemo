package com.example.sofabootservice.service;

import com.example.sofabootservice.entity.Dept;
import com.example.sofabootservice.entity.Emp;

import java.util.List;

public interface IDeptService {
    List<Dept> selectDeptAll();

    void InsertDept(int deptno,String dname,String loc);

    List<Emp> selectEmp();
}

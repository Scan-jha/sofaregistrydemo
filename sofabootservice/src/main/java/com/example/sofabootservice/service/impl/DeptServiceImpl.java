package com.example.sofabootservice.service.impl;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import com.example.sofabootservice.entity.Dept;
import com.example.sofabootservice.entity.Emp;
import com.example.sofabootservice.mapper.IDeptMapper;
import com.example.sofabootservice.service.IDeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@SofaService(interfaceType = IDeptService.class, bindings = { @SofaServiceBinding(bindingType = "bolt") } )
public class DeptServiceImpl implements IDeptService {

    @Resource
    private IDeptMapper iDeptMapper;

    @Override
    public List<Dept> selectDeptAll() {
        return iDeptMapper.selectDept();
    }

    @Override
    public void InsertDept(int deptno, String dname, String loc) {
       iDeptMapper.InsertDept(deptno,dname,loc);
    }

    @Override
    public List<Emp> selectEmp() {
        return iDeptMapper.selectEmp();
    }
}

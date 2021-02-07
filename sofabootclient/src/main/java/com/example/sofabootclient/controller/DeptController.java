package com.example.sofabootclient.controller;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;
import com.example.sofabootservice.entity.Dept;
import com.example.sofabootservice.entity.Emp;
import com.example.sofabootservice.service.IDeptService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @SofaReference(interfaceType = IDeptService.class, binding = @SofaReferenceBinding(bindingType = "bolt"))
    private IDeptService iDeptService;

    @GetMapping(value = "/alldept")
    @ResponseBody
    public ResponseEntity<List<Dept>> selectDept(){
        try{
            return ResponseEntity.ok(iDeptService.selectDeptAll());
        }catch (Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }

    @PostMapping(value = "/insertdept")
    public ResponseEntity<Void> inserDept(int deptno,String dname,String loc){
        try{
            iDeptService.InsertDept(deptno,dname,loc);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }catch (Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    @GetMapping(value = "/allemp")
    @ResponseBody
    public  ResponseEntity<List<Emp>> selectEmp(){
        try {
            return ResponseEntity.ok(iDeptService.selectEmp());
        }catch (Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }
}

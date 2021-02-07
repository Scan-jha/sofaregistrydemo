package com.example.sofabootclient.controller;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;
import com.example.sofabootservice.service.ITestSofaRegistryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: sofaregistrydemo
 * @description: 测试
 * @author: JH
 * @create: 2021-02-07 14:20
 */
@RestController
public class TestController {

    @SofaReference(interfaceType = ITestSofaRegistryService.class, binding = @SofaReferenceBinding(bindingType = "bolt"))
    private ITestSofaRegistryService iTestSofaRegistryService;

    @GetMapping(value = "/test")
    @ResponseBody
    public String getTest(){
        return iTestSofaRegistryService.getService();
    }
}
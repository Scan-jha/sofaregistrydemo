package com.example.sofabootservice.service.impl;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import com.example.sofabootservice.service.ITestSofaRegistryService;
import org.springframework.stereotype.Service;

/**
 * @program: sofaregistrydemo
 * @description: 实现类
 * @author: JH
 * @create: 2021-02-07 14:18
 */
@Service
@SofaService(interfaceType = ITestSofaRegistryService.class, bindings = { @SofaServiceBinding(bindingType = "bolt") } )
public class TestSofaRegionServiceImpl implements ITestSofaRegistryService {

    @Override
    public String  getService() {
        String str="测试成功";
        return str;
   }
}
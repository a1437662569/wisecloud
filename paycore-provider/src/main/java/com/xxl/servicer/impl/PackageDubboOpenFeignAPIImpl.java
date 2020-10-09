package com.xxl.servicer.impl;

import com.xxl.service.PackageDubboOpenFeignAPI;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.web.bind.annotation.RestController;

@Service(interfaceClass = PackageDubboOpenFeignAPI.class)
@RestController
public class PackageDubboOpenFeignAPIImpl implements PackageDubboOpenFeignAPI {
    @Override
    public String dubboAndOpenFeign() {
        return "666666666666";
    }
}

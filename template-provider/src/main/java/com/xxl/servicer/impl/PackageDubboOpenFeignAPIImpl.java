package com.xxl.servicer.impl;

import com.xxl.common.enums.R;
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

    @Override
    public R<String> enumRes() {
        return new R<String>().ok("1111111");
    }
}

package com.xxl.controller;

import com.xxl.service.PackageDubboOpenFeignAPI;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    //@Reference(protocol = "dubbo")


    @Reference
    PackageDubboOpenFeignAPI dubboOpenFeignAPI;


    @Autowired
    PackageDubboOpenFeignAPI openFeignAPI;




    @GetMapping("/dubbo")
    public Object test2() throws Exception {
        String echo = dubboOpenFeignAPI.dubboAndOpenFeign();
        return "dubbo:" +  echo ;
    }
    @GetMapping("/openFeign")
    public Object openFeignAPI()  {
        String echo = openFeignAPI.dubboAndOpenFeign();
        return "openFeignAPI:" +  echo ;
    }
}

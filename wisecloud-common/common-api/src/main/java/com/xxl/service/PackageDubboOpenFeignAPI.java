package com.xxl.service;

import com.xxl.common.enums.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "template-provider")
public interface PackageDubboOpenFeignAPI {
    @GetMapping(value = "/dubbo/get",consumes = MediaType.APPLICATION_JSON_VALUE)
    String dubboAndOpenFeign();

    @GetMapping(value = "/dubbo/get1",consumes = MediaType.APPLICATION_JSON_VALUE)
    R<String> enumRes();
}

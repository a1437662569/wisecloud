package com.xxl.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "paycore")
public interface PackageAPI {
    @GetMapping(value = "/payment/get",consumes = MediaType.APPLICATION_JSON_VALUE)
    String getPaymentById();
}

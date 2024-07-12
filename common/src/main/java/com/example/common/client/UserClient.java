package com.example.common.client;


import com.example.common.config.FeignConfig;
import com.example.common.domain.UserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// @FeignClient注解定义服务名称或URL
@FeignClient(name = "common", configuration = FeignConfig.class, url = "http://localhost:8081")
public interface UserClient {


    // 使用@GetMapping注解定义请求路径
    @GetMapping("/api/users/{userId}")
    UserInfo getOne(@PathVariable("userId") Long userId);
}
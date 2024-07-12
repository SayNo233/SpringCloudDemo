package com.example.workdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableDiscoveryClient  // 启用服务发现，注册到Nacos
@EnableFeignClients(basePackages = "com.example.common.client")
@ComponentScan(basePackages = {"com.example.common.producer", "com.example.workdemo.*"})
@EnableAsync
public class WorkDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkDemoApplication.class, args);
    }

}

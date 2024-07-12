package com.example.workdemo.controller;

import com.example.common.client.UserClient;
import com.example.common.domain.UserInfo;
import com.example.common.service.impl.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/workDemo")
public class workDemoController {
    @Autowired
    private UserClient userClient;

    @Autowired
    private MessageProducer messageProducer;
    @Transactional
    @GetMapping("/users/{id}")
    public UserInfo getAById(@PathVariable Long id) {
        String emil = "729421463@qq.com";
        messageProducer.sendMessage(emil);
        return userClient.getOne(id);
    }




}

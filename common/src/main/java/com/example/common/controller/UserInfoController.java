package com.example.common.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.common.domain.UserInfo;
import com.example.common.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@Controller
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    // GET请求：获取所有用户信息
    @GetMapping("/{userId}")
    public UserInfo getOne(@PathVariable("userId") Long userId) {
        return userInfoService.getById(userId);
    }

    @GetMapping("/name/{userName}")
    public List<UserInfo> listUsersByUsername(@PathVariable("userName") String userName){
        return userInfoService.listUsersByUsername(userName);
    }

    @GetMapping("/getAll")
    public IPage<UserInfo> getUsers(@RequestParam(defaultValue = "1") int page,
                                    @RequestParam(defaultValue = "10") int size) {
        return userInfoService.getAllUsers(page, size);
    }
}

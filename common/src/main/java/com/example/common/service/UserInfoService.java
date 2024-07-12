package com.example.common.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.domain.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author heliting
* @description 针对表【user_info(用户信息表，存储用户详细信息)】的数据库操作Service
* @createDate 2024-06-18 18:12:13
*/
@Service
public interface UserInfoService extends IService<UserInfo> {

    public List<UserInfo> listUsersByUsername(String username);

    public IPage<UserInfo> getAllUsers(int page, int size);
}

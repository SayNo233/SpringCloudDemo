package com.example.common.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.common.domain.UserInfo;
import com.example.common.service.UserInfoService;
import com.example.common.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author heliting
* @description 针对表【user_info(用户信息表，存储用户详细信息)】的数据库操作Service实现
* @createDate 2024-06-18 18:12:13
*/
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo>
    implements UserInfoService{
    @Autowired
    private UserInfoMapper userInfoMapper;
    public List<UserInfo> listUsersByUsername(String username) {
        // 使用 MyBatis-Plus 的 QueryWrapper 进行条件查询
        QueryWrapper<UserInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username); // 根据 username 字段查询

        return baseMapper.selectList(queryWrapper);
    }

    public IPage<UserInfo> getAllUsers(int page, int size) {
        Page<UserInfo> userPage = new Page<>(page, size);
        return userInfoMapper.selectPage(userPage, null);
    }
}





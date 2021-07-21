package com.winemall.mall.service;

import com.winemall.mall.pojo.UserProfile;
import com.winemall.mall.pojo.Users;

public interface UserService {

    //根据手机号码查询用户信息: 服务层一个module, mapper层一个module 各自实现分模块单元测试
    //也可以整合服务 + mapper两个module综合运行,通过dubbo-admin进行服务功能测试
    Users findById(String phone);

    //用户注册: 插入一个用户数据的同时,生成一条基本信息插入到数据库
    boolean register(Users user);

    //用户登录
    boolean login(Users user);

    //根据手机号码查询基本信息
    UserProfile findByPhone(String phone);

    //修改密码
    boolean updatePassword(Users user);

    //修改基本信息
    boolean updateUserProfile(UserProfile userProfile);
}

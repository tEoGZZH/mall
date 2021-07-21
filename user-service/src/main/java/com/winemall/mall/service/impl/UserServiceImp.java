package com.winemall.mall.service.impl;

import com.winemall.mall.mapper.UserProfileMapper;
import com.winemall.mall.mapper.UsersMapper;
import com.winemall.mall.pojo.UserProfile;
import com.winemall.mall.pojo.Users;
import com.winemall.mall.pojo.UsersExample;
import com.winemall.mall.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImp implements UserService {
    //添加mapper接口方法数据库
    @Autowired
    private UsersMapper userMapper;
    //自动装配一个操作基本信息数据的mapper
    @Autowired
    private UserProfileMapper basicMapper;

//    @Override
//    public Users findUserById(int id) {
//        return new Users();
//    }

    @Override
    public Users findById(String phone) {
        return userMapper.selectByPrimaryKey(phone);
    }

    @Override
    //添加事务注解
    @Transactional
    public boolean register(Users user) {
        //增加用户
        int insert_user = userMapper.insert(user);
        //增加基本信息
        UserProfile userProfile = new UserProfile();
        userProfile.setPhone(user.getPhone());
        userProfile.setRegDate(new Date());
        int insert_basic = basicMapper.insert(userProfile);
        if (insert_user == 1 && insert_basic == 1){
            return true;
        }
        return false;
    }

    @Override
    public boolean login(Users user) {
        //创建一个查询条件
        UsersExample userExample = new UsersExample();
        //通过传递过来的user对象中的数据设置查询条件
        userExample.createCriteria().
                andPhoneEqualTo(user.getPhone()).
                andPasswordEqualTo(user.getPassword());
        //通过查询条件查询数据
        List<Users> tbUsers = userMapper.selectByExample(userExample);
        if (tbUsers.size() == 1){
             //增加基本信息
            UserProfile userProfile = new UserProfile();
            userProfile.setPhone(user.getPhone());
            userProfile.setLastLoginDate(new Date());
            int insert_basic = basicMapper.insert(userProfile);
            if(insert_basic==1){
                return true;
            }
        }
        return false;
    }

    @Override
    public UserProfile findByPhone(String phone) {
        //调用操作基本信息的mapper接口进行数据操作: 根据手机号码查询基本信息
        UserProfile tbBasic = basicMapper.selectByPrimaryKey(phone);
        return tbBasic;
    }

    @Override
    @Transactional
    public boolean updatePassword(Users user) {
        int i = userMapper.updateByPrimaryKeySelective(user);
        if (i > 0) {
            return  true;
        }
        return false;
    }

    @Override
    public boolean updateUserProfile(UserProfile userProfile) {
        int i = basicMapper.updateByPrimaryKeySelective(userProfile);
        if (i > 0) {
            return  true;
        }
        return false;
    }
}

package com.winemall.mall.controller;

import com.winemall.mall.dto.Result;
import com.winemall.mall.pojo.UserProfile;
import com.winemall.mall.pojo.Users;
import com.winemall.mall.service.UserService;
import com.winemall.mall.service.PictureService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    //使用dubbo注解远程调用user-service
    @Reference
    private UserService userService;
    @Reference
    private PictureService pictureService;

    //使用dubbo远程调度order-service
    @RequestMapping("/id")
    public Users getUserById(){
        return  userService.findById("12345678910");
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public boolean login(@RequestBody Users user, HttpServletResponse response){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~" + user.getPhone() + "------" + user.getPassword());
        //调用服务模块中的方法进行登录验证
        boolean login = userService.login(user);
        return login;
    }

    @RequestMapping("/register")
    public  boolean register(@RequestBody Users user){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~" + user);
        return userService.register(user);
    }

    @RequestMapping("/findByPhone")
    public UserProfile findBasicByPhone(String phone){
        UserProfile basic = userService.findByPhone(phone);
        return  basic;
    }

    @RequestMapping("/updatePassword")
    public boolean updatePassword(@RequestBody Users user, String newpwd){
        System.out.println("================" + user);
        //验证用户输入的当前密码是否正确
        boolean login = userService.login(user);
        if (login) {
            //如果账户密码正确,则将将用户的新密码设置给password属性
            user.setPassword(newpwd);
            //调用maper接口修改
            boolean update = userService.updatePassword(user);
            if (update) {
                return  true;
            }
        }
        return false;
    }

    @RequestMapping("/uploadheadimg")
    public boolean uploadHeadImg(){

        return false;
    }

}

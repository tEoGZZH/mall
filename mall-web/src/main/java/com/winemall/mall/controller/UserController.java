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
import java.util.Base64;
import java.util.List;
import java.util.Map;

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

    @RequestMapping("/profile")
    public UserProfile findBasicByPhone(String phone){
        UserProfile basic = userService.findByPhone(phone);
        return basic;
    }

    @RequestMapping("/updatePassword")
    public boolean updatePassword(@RequestBody Map info){
        System.out.println("================" + info);
        //验证用户输入的当前密码是否正确
        String phone = (String) info.get("phone");
        String oldpswd = (String) info.get("password");
        String newpswd = (String) info.get("newPassword");
        Users user = new Users();
        user.setPhone(phone);
        user.setPassword(oldpswd);
        boolean login = userService.login(user);
        if (login) {
            //如果账户密码正确,则将将用户的新密码设置给password属性
            user.setPassword(newpswd);
            //调用maper接口修改
            boolean update = userService.updatePassword(user);
            if (update) {
                return  true;
            }
        }
        return false;
    }

    @RequestMapping("/updateProfile")
    public boolean updateProfile(@RequestBody UserProfile userProfile){
        UserProfile user = userService.findByPhone(userProfile.getPhone());
        if(user != null){
            return userService.updateUserProfile(userProfile);
        }
        return false;
    }

    @RequestMapping("/uploadheadimg")
    public boolean uploadHeadImg(@RequestBody Map info){
        String img = (String) info.get("img");
        String phone = (String) info.get("phone");
        UserProfile user = userService.findByPhone(phone);
        if(user != null){
            // 图片格式转换
            byte[] imgByte = Base64.getDecoder().decode(img);

            UserProfile basic = userService.findByPhone(phone);
            String img_url = basic.getHeadImages();
            if(img_url != null){
                // 删除图片
                pictureService.delete(img_url);
            }
            // 上传图片
            img_url = pictureService.upload(imgByte, , );
            // 存 url
            basic.setHeadImages(img_url);
            return userService.updateUserProfile(basic);
        }
        return false;
    }

}

package com.kl.ssm.admin.user.controller;

import com.kl.ssm.admin.user.model.UserLogin;
import com.kl.ssm.admin.user.model.UserLoginExample;
import com.kl.ssm.admin.user.service.UserLoginService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserLoginController {


    //注入Service
    //方法一：@Autowired自动注入
    @Autowired
    private UserLoginService userLoginService;
    //方法二：通过构造函数注入
//    private final UserLoginService userLoginService;
//    public UserLoginController(UserLoginService userLoginService){
//      this.userLoginService=userLoginService;
//    }

    @GetMapping("/user")
    @ResponseBody
    public List<UserLogin> selectUser(){
        //创建条件查询类
        UserLoginExample example = new UserLoginExample();
        //创建条件构造器
        UserLoginExample.Criteria criteria = example.createCriteria();
        //通过criteria构造条件
//        criteria.andUserIdEqualTo("0");
        //可以增加多个条件
//        criteria.andAccountTypeEqualTo("0");

        List<UserLogin> list = userLoginService.selectByExample(example);
        return list;
    }
}

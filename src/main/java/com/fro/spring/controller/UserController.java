package com.fro.spring.controller;

import com.fro.spring.entity.User;
import com.fro.spring.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @Auther: Nino
 * @Date: 2024/8/19 - 08 - 19 - 下午11:19
 * @Description: com.fro.spring.controller
 * @version: 1.0
 */
@Controller
public class UserController {
    @Autowired
    private IUserService userService;
    public void query(){
        List<User> list= userService.queryUsers();
        for(User user:list){
            System.out.println(user);
        }
    }
}

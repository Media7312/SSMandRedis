package com.hp.controller;


import com.hp.entity.User;
import com.hp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * usedfor：
 * Created by javahao on 2017/7/13.
 * auth：JavaHao
 */
@org.springframework.stereotype.Controller
@RequestMapping("/user")

public class UserController{
    @Autowired
    private UserService userService;




    @RequestMapping(value = {"/list",""})
    public String list(Model model) throws Exception {
        model.addAttribute("users",userService.list(new User()));
        return "user/list";
    }
}

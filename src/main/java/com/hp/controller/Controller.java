package com.hp.controller;

import com.hp.annotation.UserDefined;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by root on 2016/8/19.
 */
@UserDefined(name = "aopc",value = "aopclz")
@RequestMapping(value = "/controller")
@org.springframework.stereotype.Controller
class Controller {
    @RequestMapping("/list")
    public String list(){
        return "list";
    }
    @UserDefined(name = "aop",value = "aopmethod")
    @RequestMapping("/aop")
    public String aop(String uname,Integer age){
        return "list";
    }
}

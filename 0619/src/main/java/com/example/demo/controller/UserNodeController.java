package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserNodeController {
    @RequestMapping(value = "/index")
    public String index(){
        return "/index";
    }

    @RequestMapping(value = "/teacherLoginRegister")
    public String teacherLoginRegister(){
        return "/teacherLoginRegister";
    }

    @RequestMapping(value = "/studentLoginRegister")
    public String studentLoginRegister(){
        return "/studentLoginRegister";
    }

    @RequestMapping(value = "/success")
    public String success(){
        return "/success";
    }

    @RequestMapping(value = "/fail")
    public String fail(){
        return "/fail";
    }

    @RequestMapping(value = "/indexSetHomework")
    public String indexSetHomework(){
        return "/indexSetHomework";
    }

    @RequestMapping(value = "/indexSubmitHomework")
    public String indexSubmitHomework(){
        return "/indexSubmitHomework";
    }

    @RequestMapping(value = "/indexSetGrade")
    public String indexSetGrade(){
        return "/indexSetGrade";
    }

    @RequestMapping(value = "/indexUpdateHomework")
    public String indexUpdateHomework(){
        return "/indexUpdateHomework";
    }

}
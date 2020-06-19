package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentServiceImp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class StudentController {

    //注册
    @RequestMapping(value = "/studentRegister",method = RequestMethod.POST)
    public ModelAndView userRegister(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Student student =new Student(username,password);
        studentServiceImp.addStudent(student);
        ModelAndView model = new ModelAndView("/success");
        return model;
    }

    @Resource
    private StudentServiceImp studentServiceImp;
    //登录
    @RequestMapping(value = "/studentLogin",method = RequestMethod.POST)
    public ModelAndView studentLogin(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username);
        if (studentServiceImp.findUserByUsernameAndPassowrd(username,password)==null){
            ModelAndView model = new ModelAndView("/fail");
            return model;
        }
        ModelAndView model = new ModelAndView("/success");
        return model;
    }






}
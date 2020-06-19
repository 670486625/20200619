package com.example.demo.controller;

import com.example.demo.entity.Teacher;
import com.example.demo.service.TeacherServiceImp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class TeacherController {

    @Resource
    private TeacherServiceImp teacherServiceImp;


    //注册
    @RequestMapping("/teacherRegister")
    public ModelAndView teacherRegister(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Teacher teacher =new Teacher(username,password);
        teacherServiceImp.addTeacher(teacher);
        ModelAndView model = new ModelAndView("/success");
        return model;
    }


    //登录
    @RequestMapping("/teacherLogin")
    public ModelAndView userLogin(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (teacherServiceImp.findUserByUsernameAndPassowrd(username,password)==null){
            ModelAndView model = new ModelAndView("/fail");
            return model;
        }
        ModelAndView model = new ModelAndView("/success");
        return model;
    }



}
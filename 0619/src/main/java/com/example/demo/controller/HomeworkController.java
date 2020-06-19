package com.example.demo.controller;

import com.example.demo.entity.Homework;
import com.example.demo.entity.Student;
import com.example.demo.service.HomeworkServiceImp;
import com.example.demo.service.StudentServiceImp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class HomeworkController {

    @Resource
    private HomeworkServiceImp homeworkServiceImp;

    //布置作业
    @RequestMapping(value = "/setHomework",method = RequestMethod.POST)
    public ModelAndView setHomework(HttpServletRequest request){
        String homeworkTitle= request.getParameter("homeworkTitle");
        String homeworkRequire = request.getParameter("homeworkRequire");
        Homework homework =new Homework(homeworkTitle,homeworkRequire);
        homeworkServiceImp.addHomework(homework);

        ModelAndView model = new ModelAndView("/success");
        return model;
    }




}
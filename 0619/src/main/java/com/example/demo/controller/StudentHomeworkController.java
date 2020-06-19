package com.example.demo.controller;

import com.example.demo.entity.Studenthomework;
import com.example.demo.service.StudentHomeworkServiceImp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class StudentHomeworkController {

    @Resource
    private StudentHomeworkServiceImp studentHomeworkServiceImp;

    //提交作业
    @RequestMapping(value = "/submitHomework",method = RequestMethod.POST)
    public ModelAndView submitHomework(HttpServletRequest request){
        String homeworkTitle= request.getParameter("homeworkTitle");
        String studentName = request.getParameter("studentName");
        String homeworkContent = request.getParameter("homeworkContent");
        Studenthomework studentHomework =new Studenthomework(homeworkTitle,studentName,homeworkContent,-99);
        studentHomeworkServiceImp.addStudentHomework(studentHomework);

        ModelAndView model = new ModelAndView("/success");
        return model;
    }

    //打分
    @RequestMapping(value = "/setGrade",method = RequestMethod.POST)
    public ModelAndView setGrade(HttpServletRequest request){
        String homeworkTitle = request.getParameter("homeworkTitle");
        String studentName = request.getParameter("studentName");
        String homeworkGrade = request.getParameter("homeworkGrade");
        double grade=Double.valueOf(homeworkGrade.toString());

        studentHomeworkServiceImp.setGrade(homeworkTitle,studentName,grade);

        ModelAndView model = new ModelAndView("/success");
        return model;
    }

    //修改作业
    @RequestMapping(value = "/updateHomework",method = RequestMethod.POST)
    public ModelAndView updateHomework(HttpServletRequest request){
        String homeworkTitle= request.getParameter("homeworkTitle");
        String studentName = request.getParameter("studentName");
        String homeworkContent = request.getParameter("homeworkContent");

        studentHomeworkServiceImp.updateHomework(homeworkTitle,studentName,homeworkContent);

        ModelAndView model = new ModelAndView("/success");
        return model;
    }


}
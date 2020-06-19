package com.example.demo.service;

import com.example.demo.dao.StudentHomeworkDao;
import com.example.demo.dao.UpdateHomeworkDao;
import com.example.demo.entity.Student;
import com.example.demo.entity.Studenthomework;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentHomeworkServiceImp {
    @Resource
    private StudentHomeworkDao studentHomeworkDao;

    @Resource
    private UpdateHomeworkDao updateHomeworkDao;

    //打分
    public void setGrade(String homeworkTitle,String studentName,double homeworkGrade) {
        studentHomeworkDao.setGrade(homeworkTitle,studentName,homeworkGrade);
    }

    //修改作业
    public void updateHomework(String homeworkTitle,String studentName,String homeworkContent) {
        updateHomeworkDao.updateHomework(homeworkTitle,studentName,homeworkContent);
    }

    public boolean addStudentHomework(Studenthomework studentHomework) {
        return studentHomeworkDao.save(studentHomework)!=null;
    }

}

package com.example.demo.service;

import com.example.demo.dao.HomeworkDao;
import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Homework;
import com.example.demo.entity.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class HomeworkServiceImp {
    @Resource
    private HomeworkDao homeworkDao;

    public boolean addHomework(Homework homework) {
        return homeworkDao.save(homework)!=null;
    }

}

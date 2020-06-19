package com.example.demo.service;

import com.example.demo.dao.TeacherDao;
import com.example.demo.entity.Teacher;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TeacherServiceImp{
    @Resource
    private TeacherDao teacherDao;

    //增加
    public boolean addTeacher(Teacher teacher) {
        return teacherDao.save(teacher)!=null;
    }

    //判断
    public Teacher findUserByUsernameAndPassowrd(String username, String password) {
        return teacherDao.findUserByUsernameAndPassword(username,password);
    }

}


package com.example.demo.service;

import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImp {
    @Resource
    private StudentDao studentDao;

    public Student findUserByUsernameAndPassowrd(String username, String password) {
        return studentDao.findUserByUsernameAndPassword(username,password);
    }

    public boolean addStudent(Student u) {
       return studentDao.save(u)!=null;
    }

}

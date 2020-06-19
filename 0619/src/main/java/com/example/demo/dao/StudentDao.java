package com.example.demo.dao;

import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends JpaRepository<Student,Integer> {

    @Query(value = "select * from  student where username=:username and password=:password",nativeQuery = true)
    Student findUserByUsernameAndPassword(String username, String password);
}
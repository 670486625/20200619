package com.example.demo.dao;

import com.example.demo.entity.Homework;
import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeworkDao extends JpaRepository<Homework,Integer> {

    @Query(value = "select * from  homework where homeworTitle=:homeworTitle and homeworContent=:homeworContent",nativeQuery = true)
    Student findUserByUsernameAndPassword(String homeworTitle, String homeworContent);
}
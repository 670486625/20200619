package com.example.demo.dao;

import com.example.demo.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherDao extends JpaRepository<Teacher,Integer> {

    @Query(value = "select * from  teacher where username=:username and password=:password",nativeQuery = true)
    Teacher findUserByUsernameAndPassword(String username,String password);
}
package com.example.demo.dao;

import com.example.demo.entity.Studenthomework;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface StudentHomeworkDao extends JpaRepository<Studenthomework,Integer>  {

    @Transactional
    @Modifying
    @Query(value="update Studenthomework set homeworkgrade=:homeworkGrade where homeworktitle=:homeworkTitle and studentname=:studentName",nativeQuery = true)
    void setGrade(String homeworkTitle,String studentName,double homeworkGrade);

}
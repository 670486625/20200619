package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Studenthomework {
    @Id
    @GeneratedValue
    private int id;

    private String homeworktitle;
    private String studentname;
    private String homeworkcontent;
    private double homeworkgrade;

    public Studenthomework(String homeworktitle, String studentname,String homeworkcontent,double homeworkgrade) {
        this.homeworktitle = homeworktitle;
        this.studentname = studentname;
        this.homeworkcontent = homeworkcontent;
        this.homeworkgrade = homeworkgrade;
    }
    public Studenthomework(){

    }


    public String getHomeworktitle() {
        return homeworktitle;
    }

    public void setHomeworktitle(String homeworktitle) {
        this.homeworktitle = homeworktitle;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getHomeworkcontent() {
        return homeworkcontent;
    }

    public void setHomeworkcontent(String homeworkcontent) {
        this.homeworkcontent = homeworkcontent;
    }

    public double getHomeworkgrade() {
        return homeworkgrade;
    }

    public void setHomeworkgrade(double homeworkgrade) {
        this.homeworkgrade = homeworkgrade;
    }
}
package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Homework {
    @Id
    @GeneratedValue
    private int id;

    private String Homeworktitle;
    private String Homeworkrequire;

    public Homework(String Homeworktitle, String Homeworkrequire) {
        this.Homeworktitle = Homeworktitle;
        this.Homeworkrequire = Homeworkrequire;
    }
    public Homework(){

    }

    public String getHomeworktitle() {
        return Homeworktitle;
    }

    public void setHomeworktitle(String homeworktitle) {
        Homeworktitle = homeworktitle;
    }

    public String getHomeworkrequire() {
        return Homeworkrequire;
    }

    public void setHomeworkrequire(String homeworkrequire) {
        Homeworkrequire = homeworkrequire;
    }
}
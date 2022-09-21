package com.sherlock.hibernatedemo.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Fresher> freshers;

    public Course(String name) {
        this.name = name;
    }

    public Course(String name, List<Fresher> freshers) {
        this.name = name;
        this.freshers = freshers;
    }

    public Course() {
    }

    public List<Fresher> getFreshers() {
        return freshers;
    }

    public void setFreshers(List<Fresher> freshers) {
        this.freshers = freshers;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

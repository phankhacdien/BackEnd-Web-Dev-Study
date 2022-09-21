package com.sherlock.hibernatedemo.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Fresher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fresherId;
    private String name;

    @OneToOne(mappedBy = "fresher", fetch = FetchType.LAZY)
    private Address address;

//    @OneToMany
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Course> courses;

    public Fresher(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Fresher(String name, List<Course> courses) {
        this.name = name;
        this.courses = courses;
    }

    public Fresher(String name) {
        this.name = name;
    }

    public Fresher() {
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getId() {
        return fresherId;
    }

    public void setId(int id) {
        this.fresherId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

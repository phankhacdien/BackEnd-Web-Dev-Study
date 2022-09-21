package com.sherlock.spring.data.jpa.tutorial.repository;

import com.sherlock.spring.data.jpa.tutorial.Entity.Guardian;
import com.sherlock.spring.data.jpa.tutorial.Entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
//@DataJpaTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent() {
        Student student = Student.builder()
                .emailID("phankhacdien1110@gmail.com")
                .firstName("Dien")
                .lastName("Phan")
                //.guardianName("Phan Quan")
                //.guardianEmail("pahnquan@gmail.com")
                //.guardianMobile("0987654321")
                .build();

        studentRepository.save(student);
    }

    @Test
    public void saveStudentWithGuardian() {
        Guardian guardian = Guardian.builder()
                .guardianName("Phan Quan")
                .guardianEmail("pahnquan@gmail.com")
                .guardianMobile("0987654321")
                .build();

        Student student = Student.builder()
                .firstName("Chau")
                .lastName("Phan")
                .emailID("phanquynhchau@gmail.com")
                .guardian(guardian)
                .build();

        studentRepository.save(student);
    }

    @Test
    public void printAllStudent() {
        List<Student> studentList = studentRepository.findAll();
        System.out.println("List Student: " + studentList);
    }

    @Test
    public void printStudentByFirstName() {
        List<Student> studentList = studentRepository.findByFirstName("Dien");
        System.out.println("List Student: " + studentList);
    }

    @Test
    public void printStudentByFirstNameContaining() {
        List<Student> studentList = studentRepository.findByFirstNameContaining("i");
        System.out.println("List Student: " + studentList);
    }

    @Test
    public void printStudentBasedOnGuardianName() {
        List<Student> studentList = studentRepository.findByGuardianGuardianName("Phan Quan");
        System.out.println("List Student: " + studentList);
    }
}
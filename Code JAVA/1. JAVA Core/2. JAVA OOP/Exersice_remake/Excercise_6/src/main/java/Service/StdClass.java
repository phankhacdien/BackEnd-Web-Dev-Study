package Service;

import Entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StdClass {
    private List<Student> studentList;

    public StdClass() {
        this.studentList = new ArrayList<Student>();
    }

    public void insertStudent(Student newStd) {
        this.studentList.add(newStd);
        System.out.println("Added new Student: " + newStd.toString());
    }

    public void showU20StudentInfo() {
        this.studentList.stream()
                .filter(student -> student.getStdAge() <= 20)
                .forEach(System.out::println);
    }

    public long countU23StudentFromDN() {
        return this.studentList.stream()
                .filter(student -> student.getStdAge() <= 23)
                .filter(student -> student.getStdHomeTown().equals("DN"))
                .count();
    }
}

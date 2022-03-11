package Stream;

import java.util.List;

public class Student {
    public String name;
    public int age;
    public List<String> subject;

    public Student(String name, int age, List<String> subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    public int getAge() {
        return age;
    }

    public List<String> getSubject(){
        return this.subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", subject=" + subject +
                '}';
    }
}

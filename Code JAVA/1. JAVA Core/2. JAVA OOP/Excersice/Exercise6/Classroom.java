package Exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Classroom {
    List<Student> studentsList = new ArrayList<>();

    public void insert(Student student){
        this.studentsList.add(student);
    }

    public void showStudent20ys(){
        this.studentsList.stream()
                .filter(student -> student.getAge() == 20)
                .forEach(student -> System.out.println(student.toString()));
    }

    public void showStudent23ysLiveInDN(){
        this.studentsList.stream()
                .filter(student -> ((student.getCountry().equals("DN")) &&
                                    (student.getAge() == 23)))
                .forEach(student -> System.out.println(student.toString()));
    }
}

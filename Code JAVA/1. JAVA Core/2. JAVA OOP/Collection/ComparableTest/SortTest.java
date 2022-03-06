package ComparableTest;

import java.util.*;

public class SortTest {
    public static void main(String[] args) {
        List<Student> lists = new ArrayList<>();
        lists.add(new Student(101, "Dien", 23));
        lists.add(new Student(106, "Bac", 27));
        lists.add(new Student(105, "Dung", 21));

        Collections.sort(lists, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });

//        Collections.sort(lists);
        for (Student student : lists) {
            System.out.println(student.roll+" "+student.name+" "+student.age);
        }
    }
}

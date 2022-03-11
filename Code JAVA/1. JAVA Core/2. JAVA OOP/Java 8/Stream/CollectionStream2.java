package Stream;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionStream2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("A", 18, Arrays.asList("Math", "Physics", "Chemistry")));
        students.add(new Student("B", 20, Arrays.asList("Literature", "History", "Chemistry")));
        students.add(new Student("C", 17, Arrays.asList("Math", "Literature", "English", "History")));
        students.add(new Student("D", 21, Arrays.asList("Math", "Physics", "Chemistry")));
        students.add(new Student("E", 22, Arrays.asList("Art", "Music")));
        students.add(new Student("F", 18, Arrays.asList()));

        {
            System.out.println("Intermediate stream");
            // Stream filter dùng để lọc các phần tử theo điều kiện xác định
            System.out.println("Stream filter");
            students.stream()
                    .filter(student -> student.age > 20)
                    .forEach(System.out::println);

            // Skip(long n) trả về một Stream lược bỏ n ptu từ vị trí đầu tiên
            System.out.println("Stream skip");
            students.stream()
                    .skip(2)
                    .forEach(System.out::println);

            // limit(long n) trả về một stream với số lượng phần tử tối đa là n
            System.out.println("Stream limit");
            students.stream()
                    .limit(3)
                    .forEach(System.out::println);

            // Dùng để ánh xạ một Stream object này sang một stream object khác tương ứng
            System.out.println("Stream map");
            List<Integer> age = students.stream()
                    .map(student -> student.getAge())
                    .collect(Collectors.toList());
            System.out.println(age);

            students.forEach(System.out::println);
        }


    }
}

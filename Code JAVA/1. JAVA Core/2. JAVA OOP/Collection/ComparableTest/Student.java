package ComparableTest;

import org.jetbrains.annotations.NotNull;

public class Student /*implements Comparable<Student>*/{
    int roll;
    String name;
    int age;

    public Student(int roll, String name, int age) {
        this.roll = roll;
        this.name = name;
        this.age = age;
    }

    /*@Override
    public int compareTo(@NotNull Student st) {
        if (age == st.age) return 0;
        else if (age > st.age) return 1;
        else return -1;
    }*/


    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

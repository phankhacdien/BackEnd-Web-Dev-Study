package Exercise6;

public class Student {
    private String name;
    private int age;
    private String country;

    public Student(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                ", country='" + this.country + '\'' +
                '}';
    }
}

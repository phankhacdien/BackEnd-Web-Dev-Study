package Exercise7;

public class Teacher {
    private String name;
    private int age;
    private String country;
    private String teacherID;
    private int basic_salary;

    public Teacher(String name, int age, String country, String teacherID, int basic_salary) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.teacherID = teacherID;
        this.basic_salary = basic_salary;
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

    public String getTeacherID() {
        return teacherID;
    }

    public int getBasic_salary() {
        return basic_salary;
    }
}

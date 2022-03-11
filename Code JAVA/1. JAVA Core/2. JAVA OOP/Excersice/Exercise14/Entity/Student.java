package Exercise14.Entity;

import java.time.LocalDate;

public class Student implements ShowInfo{
    private String fullName;
    private LocalDate doB;
    private String sex;
    private int phone;
    private String university;
    private String gradeLevel;

    public Student(String fullName, LocalDate doB, String sex, int phone, String university, String gradeLevel) {
        this.fullName = fullName;
        this.doB = doB;
        this.sex = sex;
        this.phone = phone;
        this.university = university;
        this.gradeLevel = gradeLevel;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + this.fullName + '\'' +
                ", doB=" + this.doB +
                ", sex='" + this.sex + '\'' +
                ", phone=" + this.phone +
                ", university='" + this.university + '\'' +
                ", gradeLevel='" + this.gradeLevel + '\'' +
                '}';
    }

    @Override
    public void ShowMyInfo() {
        System.out.println(this.toString());
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDoB(LocalDate doB) {
        this.doB = doB;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String getFullName() {
        return fullName;
    }

    public LocalDate getDoB() {
        return doB;
    }

    public String getSex() {
        return sex;
    }

    public int getPhone() {
        return phone;
    }

    public String getUniversity() {
        return university;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }
}

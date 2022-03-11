package Exercise13.Entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class InternEmployee extends Employee{
    private String major;
    private int semester;
    private String university;

    public InternEmployee(String id, String fullName, LocalDate birthday, int phone, String email, List<Certificate> certificateList, String major, int semester, String university) {
        super(id, fullName, birthday, phone, email, certificateList);
        this.major = major;
        this.semester = semester;
        this.university = university;
    }

    @Override
    public String toString() {
        return "InternEmployee{" +
                "major='" + major + '\'' +
                ", semester=" + semester +
                ", university='" + university + '\'' +
                "} " + super.toString();
    }

    public String getMajor() {
        return major;
    }

    public int getSemester() {
        return semester;
    }

    public String getUniversity() {
        return university;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}

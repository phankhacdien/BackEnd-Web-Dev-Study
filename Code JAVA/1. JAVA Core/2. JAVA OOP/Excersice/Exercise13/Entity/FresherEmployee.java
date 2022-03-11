package Exercise13.Entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class FresherEmployee extends Employee{
    private LocalDate graduationDate;
    private String graduationRank;

    public FresherEmployee(String id, String fullName, LocalDate birthday, int phone, String email, List<Certificate> certificateList, LocalDate graduationDate, String graduationRank) {
        super(id, fullName, birthday, phone, email, certificateList);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
    }

    @Override
    public String toString() {
        return "FresherEmployee{" +
                "graduationDate=" + graduationDate +
                ", graduationRank='" + graduationRank + '\'' +
                "} " + super.toString();
    }

    public LocalDate getGraduationDate() {
        return graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationDate(LocalDate graduationDate) {
        this.graduationDate = graduationDate;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }
}

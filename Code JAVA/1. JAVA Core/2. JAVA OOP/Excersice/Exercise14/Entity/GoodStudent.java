package Exercise14.Entity;

import java.time.LocalDate;

public class GoodStudent extends Student{
    private int gpa;
    private String bestRewardName;

    public GoodStudent(String fullName, LocalDate doB, String sex, int phone, String university, String gradeLevel, int gpa, String bestRewardName) {
        super(fullName, doB, sex, phone, university, gradeLevel);
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
    }

    @Override
    public String toString() {
        return "GoodStudent{" +
                "gpa=" + this.gpa +
                ", bestRewardName='" + this.bestRewardName + '\'' +
                "} " + super.toString();
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public void setBestRewardName(String bestRewardName) {
        this.bestRewardName = bestRewardName;
    }

    public int getGpa() {
        return gpa;
    }

    public String getBestRewardName() {
        return bestRewardName;
    }
}

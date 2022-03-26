package Exercise14.Entity;

import java.time.LocalDate;

public class GoodStudent extends Student{
    private float gpa;
    private String bestRewardName;

    public GoodStudent(String fullName, LocalDate doB, String sex, String phone, String university, String gradeLevel, float gpa, String bestRewardName) {
        super(fullName, doB, sex, phone, university, gradeLevel);
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
    }

    public GoodStudent() {
    }

    @Override
    public String toString() {
        return "GoodStudent{" +
                "gpa=" + this.gpa +
                ", bestRewardName='" + this.bestRewardName + '\'' +
                "} " + super.toString();
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void setBestRewardName(String bestRewardName) {
        this.bestRewardName = bestRewardName;
    }

    public float getGpa() {
        return gpa;
    }

    public String getBestRewardName() {
        return bestRewardName;
    }
}

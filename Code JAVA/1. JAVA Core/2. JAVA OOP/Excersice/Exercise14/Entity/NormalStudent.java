package Exercise14.Entity;

import java.time.LocalDate;

public class NormalStudent extends Student{
    private int englishScore;
    private float entryTestScore;

    public NormalStudent(String fullName, LocalDate doB, String sex, String phone, String university, String gradeLevel, int englishScore, float entryTestScore) {
        super(fullName, doB, sex, phone, university, gradeLevel);
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
    }

    public NormalStudent() {
    }

    @Override
    public String toString() {
        return "NormalStudent{" +
                "englishScore=" + this.englishScore +
                ", entryTestScore=" + this.entryTestScore +
                "} " + super.toString();
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public void setEntryTestScore(float entryTestScore) {
        this.entryTestScore = entryTestScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public float getEntryTestScore() {
        return entryTestScore;
    }
}

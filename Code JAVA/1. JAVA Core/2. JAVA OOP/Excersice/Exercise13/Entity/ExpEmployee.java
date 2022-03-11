package Exercise13.Entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class ExpEmployee extends Employee{
    private int expInYear;
    private String proSkill;

    public ExpEmployee(String id, String fullName, LocalDate birthday, int phone, String email, List<Certificate> certificateList, int expInYear, String proSkill) {
        super(id, fullName, birthday, phone, email, certificateList);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "ExpEmployee{" +
                "expInYear=" + expInYear +
                ", proSkill='" + proSkill + '\'' +
                "} " + super.toString();
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }
}

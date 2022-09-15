package Entity;

public class Student {
    private String sdtName;
    private int stdAge;
    private String stdHomeTown;

    public Student(String sdtName, int stdAge, String stdHomeTown) {
        this.sdtName = sdtName;
        this.stdAge = stdAge;
        this.stdHomeTown = stdHomeTown;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sdtName='" + sdtName + '\'' +
                ", stdAge=" + stdAge +
                ", stdHomeTown='" + stdHomeTown + '\'' +
                '}';
    }

    public String getSdtName() {
        return sdtName;
    }

    public void setSdtName(String sdtName) {
        this.sdtName = sdtName;
    }

    public int getStdAge() {
        return stdAge;
    }

    public void setStdAge(int stdAge) {
        this.stdAge = stdAge;
    }

    public String getStdHomeTown() {
        return stdHomeTown;
    }

    public void setStdHomeTown(String stdHomeTown) {
        this.stdHomeTown = stdHomeTown;
    }
}

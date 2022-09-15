package Entity;

public class Engineer extends Officer {
    private String major;

    public Engineer(String name, int age, String genre, String addr, String major) {
        super(name, age, genre, addr);
        this.major = major;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Major: " + this.major);
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}

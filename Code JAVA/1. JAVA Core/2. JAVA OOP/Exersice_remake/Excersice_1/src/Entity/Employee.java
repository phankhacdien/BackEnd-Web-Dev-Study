package Entity;

public class Employee extends Officer {
    private String job;

    public Employee(String name, int age, String genre, String addr, String job) {
        super(name, age, genre, addr);
        this.job = job;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Job: " + this.job);
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}

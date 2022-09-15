package Entity;

public class Human {
    private String humanID;
    private String name;
    private int age;
    private String job;

    public Human(String humanID, String name, int age, String job) {
        this.humanID = humanID;
        this.name = name;
        this.age = age;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Human{" +
                "humanID='" + humanID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }

    public String getHumanID() {
        return humanID;
    }

    public void setHumanID(String humanID) {
        this.humanID = humanID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}

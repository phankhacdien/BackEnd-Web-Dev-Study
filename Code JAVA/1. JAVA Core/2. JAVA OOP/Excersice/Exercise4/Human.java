package Exercise4;

public class Human {
    private String name;
    private int age;
    private String job;
    private int id;

    public Human(String name, int age, String job, int id) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", id=" + id +
                '}';
    }
}

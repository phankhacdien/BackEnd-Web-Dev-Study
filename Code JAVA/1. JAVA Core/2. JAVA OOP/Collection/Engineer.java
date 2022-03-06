public class Engineer {
    private String name;
    private int age;
    private String job;
    private String company;

    public Engineer() {
    }

    public Engineer(String name, int age, String job, String company) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "name= '" + name + '\'' +
                ", age= " + age +
                ", job= '" + job + '\'' +
                ", company= '" + company + '\'' +
                '}' + "\n";
    }
}

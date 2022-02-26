public class Employee extends Officer {
    private String job;

    public Employee(String name, int age, String gender, String addr, String job) {
        super(name, age, gender, addr);
        this.job = job;
    }

    public String getJob(){
        return this.job;
    }

    @Override
    public void showInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
        System.out.println("Address: " + this.addr);
        System.out.println("Job: " + this.job);
        System.out.println("=========================================");
    }
}

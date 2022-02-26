public class Engineer extends Officer {
    private String major;

    public Engineer(String name, int age, String gender, String addr, String major) {
        super(name, age, gender, addr);
        this.major = major;
    }

    public String getMajor() {
        return this.major;
    }

    @Override
    public void showInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
        System.out.println("Address: " + this.addr);
        System.out.println("Major: " + this.major);
        System.out.println("=========================================");
    }
}

public class Worker extends Officer {
    private int level;

    public Worker(String name, int age, String gender, String addr, int level) {
        super(name, age, gender, addr);
        this.level = level;
    }

    public int getLevel() {
        return this.level;
    }

    @Override
    public void showInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
        System.out.println("Address: " + this.addr);
        System.out.println("Level: " + this.level);
        System.out.println("=========================================");
    }
}

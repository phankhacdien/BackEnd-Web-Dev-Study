package Entity;

public class Worker extends Officer{
    private int level;

    public Worker(String name, int age, String genre, String addr, int level) {
        super(name, age, genre, addr);
        this.level = level;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Level: " + this.level);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "level=" + level +
                '}';
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

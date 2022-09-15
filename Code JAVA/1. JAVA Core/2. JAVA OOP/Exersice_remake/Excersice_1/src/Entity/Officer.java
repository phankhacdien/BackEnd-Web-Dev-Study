package Entity;

public class Officer {
    private String name;
    private int age;
    private String gender;
    private String addr;

    public Officer(String name, int age, String gender, String addr) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Officer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }

    public void showInformation() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Genre: " + this.gender);
        System.out.println("Address:" + this.addr);
    };

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddr() {
        return addr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}

package Excersice1;

public class Officer {
    protected String name;
    protected int age;
    protected String gender;
    protected String addr;

    public Officer(String name, int age, String gender, String addr) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.addr = addr;
    }

    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }

    public String getGender()
    {
        return this.gender;
    }

    public String getAddr()
    {
        return this.addr;
    }

    public void showInfo(){}
}
class Idol
{
    String name;
    int age;
    double height, weight;

    public void Intro()
    {
        System.out.println("Hello mt name is " + name);
    }

    public String Status()
    {
        int min = 18;
        int max = 30;
        String rs;
        if (age < min)
        {
            rs = "Not illegal to work";
        }
        else if (age > max)
        {
            rs = "Over age!";
        }
        else
        {
            rs = "Working available";
        }
        return rs;
    }
}
package Exercise5;

public class Customer {
    private String name;
    private int age;
    private String id;
    private Room room;
    private int rent_period;

    public Customer(String name, int age, String id, Room room, int rent_period) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.room = room;
        this.rent_period = rent_period;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public Room getRoom() {
        return room;
    }

    public int getRent_period() {
        return rent_period;
    }
}

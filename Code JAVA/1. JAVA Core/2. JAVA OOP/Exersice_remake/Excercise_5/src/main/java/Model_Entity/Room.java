package Model_Entity;

public class Room {
    protected String roomType;
    protected int price;

    public Room(String roomType, int price) {
        this.roomType = roomType;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomType='" + roomType + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

package Service;

import Model_Entity.Room;

public class GuessManagement {
    private String humanID;
    private String guessName;
    private int rentDays;
    private Room roomType;

    public GuessManagement(String humanID, String guessName, int rentDays, Room roomType) {
        this.humanID = humanID;
        this.guessName = guessName;
        this.rentDays = rentDays;
        this.roomType = roomType;
    }

    @Override
    public String toString() {
        return "GuessManagement{" +
                "humanID='" + humanID + '\'' +
                ", guessName='" + guessName + '\'' +
                ", rentDays=" + rentDays +
                ", roomType=" + roomType +
                '}';
    }

    public String getHumanID() {
        return humanID;
    }

    public void setHumanID(String humanID) {
        this.humanID = humanID;
    }

    public String getGuessName() {
        return guessName;
    }

    public void setGuessName(String guessName) {
        this.guessName = guessName;
    }

    public int getRentDays() {
        return rentDays;
    }

    public void setRentDays(int rentDays) {
        this.rentDays = rentDays;
    }

    public Room getRoomType() {
        return roomType;
    }

    public void setRoomType(Room roomType) {
        this.roomType = roomType;
    }
}

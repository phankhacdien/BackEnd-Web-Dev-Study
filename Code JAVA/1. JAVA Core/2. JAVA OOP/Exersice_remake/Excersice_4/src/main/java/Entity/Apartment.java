package Entity;

import java.util.List;

public class Apartment {
    private String address;
    private List<Human> humanList;
    private int numberOfHuman;

    public Apartment(String address, List<Human> humanList, int numberOfHuman) {
        this.address = address;
        this.humanList = humanList;
        this.numberOfHuman = numberOfHuman;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "address='" + address + '\'' +
                ", humanList=" + humanList +
                ", numberOfHuman=" + numberOfHuman +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Human> getHumanList() {
        return humanList;
    }

    public void setHumanList(List<Human> humanList) {
        this.humanList = humanList;
    }

    public int getNumberOfHuman() {
        return numberOfHuman;
    }

    public void setNumberOfHuman(int numberOfHuman) {
        this.numberOfHuman = numberOfHuman;
    }
}

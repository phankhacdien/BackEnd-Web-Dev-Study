package Exercise9;

public class HouseHold {
    private String name;
    private int house_number;
    private String electrical_meterID;

    public HouseHold(String name, int house_number, String electrical_meterID) {
        this.name = name;
        this.house_number = house_number;
        this.electrical_meterID = electrical_meterID;
    }

    @Override
    public String toString() {
        return "HouseHold{" +
                "name='" + name + '\'' +
                ", house_number=" + house_number +
                ", electrical_meterID=" + electrical_meterID +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHouse_number(int house_number) {
        this.house_number = house_number;
    }

    public void setElectrical_meterID(String electrical_meterID) {
        this.electrical_meterID = electrical_meterID;
    }

    public String getName() {
        return name;
    }

    public int getHouse_number() {
        return house_number;
    }

    public String getElectrical_meterID() {
        return electrical_meterID;
    }
}

package Manager;

import Entity.Officer;

import java.util.ArrayList;
import java.util.List;

public class OfficeManager {
    private List<Officer> officerList;

    public OfficeManager() {
        this.officerList = new ArrayList<Officer>();
    }

    public void addOfficer(Officer officer) {
        this.officerList.add(officer);
    }

    public void searchOfficerByName(String name) {
        this.officerList.stream()
                .filter(officer -> officer.getName().equals(name))
                .forEach(System.out::println);
    }

    public void showOfficerList(){
        this.officerList.forEach(System.out::println);
    }
}

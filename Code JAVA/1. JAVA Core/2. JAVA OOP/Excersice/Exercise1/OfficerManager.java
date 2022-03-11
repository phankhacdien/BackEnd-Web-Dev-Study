package Exercise1;

import java.util.ArrayList;
import java.util.List;

public class OfficerManager {
    private List<Officer> officers;

    public OfficerManager() {
        this.officers = new ArrayList<>();
    }

    public void addOfficer(Officer officer) {
        this.officers.add(officer);
    }

    public void searchOfficerByName(String name) {
        for (Officer officer : this.officers) {
            if (officer.name.contains(name)) {
                officer.showInfo();
            }
            else{
                System.out.println("There is no officer named:" + name);
                break;
            }
        }
    }

    public void showOfficerList() {
        for (Officer officer : this.officers) {
            officer.showInfo();
        }
    }
}

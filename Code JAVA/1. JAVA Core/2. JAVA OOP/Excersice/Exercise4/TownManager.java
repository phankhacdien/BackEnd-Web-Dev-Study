package Exercise4;

import java.util.*;

public class TownManager {
    List<Family> families = new ArrayList<Family>();

    public void insertFamily(int house_number, int member_qty, List family_members) {
        Family new_fam = new Family(house_number, member_qty, family_members);
        families.add(new_fam);
    }

    public void showAllFamily(){
        families.stream()
                .forEach(family -> System.out.println(family.toString()));
    }
}

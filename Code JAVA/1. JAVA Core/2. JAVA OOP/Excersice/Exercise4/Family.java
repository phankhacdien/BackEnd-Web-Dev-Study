package Exercise4;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private int member_qty;
    private int house_number;
    private List<Human> family_members;

    public Family(int member_qty, int house_number, List family_members) {
        this.member_qty = member_qty;
        this.house_number = house_number;
        this.family_members = family_members;
    }

    @Override
    public String toString() {
        return "Family{" +
                "member_qty=" + member_qty +
                ", house_number=" + house_number +
                ", family_members=" + family_members +
                '}';
    }
}

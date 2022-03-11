package Exercise3;

import java.util.List;

public class Candidate {
    protected String ID, name, address;
    protected int priority_level;
    protected List<String> subject;

    public Candidate(String ID, String name, String address, int priority_level) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.priority_level = priority_level;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPriority_level() {
        return priority_level;
    }

    public List<String> getSubject() {
        return subject;
    }
}

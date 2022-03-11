package Exercise3;

import java.util.Arrays;
import java.util.List;

public class CandidateGroupA extends Candidate{
    private List<String> subject = Arrays.asList("Math", "Physics", "Chemistry");

    public CandidateGroupA(String ID, String name, String address, int priority_level) {
        super(ID, name, address, priority_level);
    }

    public List getSubject() {
        return this.subject;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "ID= '" + ID + '\'' +
                ", name= '" + name + '\'' +
                ", address= '" + address + '\'' +
                ", priority_level= " + priority_level +
                ", subject= " + subject +
                '}';
    }
}

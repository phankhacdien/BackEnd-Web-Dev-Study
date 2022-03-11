package Exercise3;

import java.util.Arrays;
import java.util.List;

public class CandidateGroupB extends Candidate{
    private List<String> subject = Arrays.asList("Math", "Chemistry", "Biology");

    public CandidateGroupB(String ID, String name, String address, int priority_level) {
        super(ID, name, address, priority_level);
    }

    public List<String> getSubject() {
        return subject;
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

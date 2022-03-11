package Exercise3;

import java.util.Arrays;
import java.util.List;

public class CandidateGroupC extends Candidate{
    private List<String> subject = Arrays.asList("Literature", "History", "Geography");

    public CandidateGroupC(String ID, String name, String address, int priority_level) {
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

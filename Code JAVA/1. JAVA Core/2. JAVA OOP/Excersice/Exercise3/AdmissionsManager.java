package Exercise3;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class AdmissionsManager {
    List<Candidate> candidates = new ArrayList<Candidate>();

    public void insertCandidate(String id, String name, String address, int priority, @NotNull String group) {
        switch (group.toUpperCase()) {
            case "A": {
                Candidate new_can = new CandidateGroupA(id, name, address, priority);
                candidates.add(new_can);
                break;
            }
            case "B": {
                Candidate new_can = new CandidateGroupB(id, name, address, priority);
                candidates.add(new_can);
                break;
            }
            case "C": {
                Candidate new_can = new CandidateGroupC(id, name, address, priority);
                candidates.add(new_can);
                break;
            }
        }
    }

    public void showCandidateInfo() {
        candidates.stream()
                .forEach(System.out::println);
    }

    public void searchCandidate(String findID) {
        candidates.stream()
                .filter(candidate -> candidate.ID.equals(findID))
                .forEach(System.out::println);
    }
}

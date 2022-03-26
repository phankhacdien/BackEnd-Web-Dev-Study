package Exercise14.Service;

import Exercise14.Entity.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecruitService {
    public void run(){
        Scanner scanner = new Scanner(System.in);
        List<Student> goodStudents = JDBCConnection.getStudents("Good");
        List<Student> normalStudents = JDBCConnection.getStudents("Normal");
        List<Student> ChosenCandidate = new ArrayList<>();

        System.out.print("Enter the number of Student you wanna hire: ");
        int candidateQty = Integer.valueOf(scanner.nextLine());
        int goodCandidateQty = goodStudents.size();
        int normalCandidateQty = normalStudents.size();

        if (goodCandidateQty > candidateQty) {
            for (int i = candidateQty; i>0;i--) {
                ChosenCandidate.add(goodStudents.get(i));
            }
        }

        int a=1;
    }
}

package Exercise3;

import java.util.Scanner;

public class UI {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        AdmissionsManager app = new AdmissionsManager();

        while (true) {
            System.out.println("Enter 1: Insert Candidate");
            System.out.println("Enter 2: Show Candidate Information");
            System.out.println("Enter 3: Find Candidate by ID");
            System.out.println("Enter 4: Exit");

            int type = Integer.valueOf(scanner.nextLine());

            switch (type) {
                case 1: {
                    System.out.print("Enter Candidate ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Candidate name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Candidate address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter Candidate priority level: ");
                    int priority = Integer.valueOf(scanner.nextLine());
                    System.out.print("Enter Candidate group: ");
                    String group = scanner.nextLine();
                    app.insertCandidate(id, name, address, priority, group);
                    break;
                }
                case 2: {
                    app.showCandidateInfo();
                    break;
                }
                case 3: {
                    System.out.println("Enter Candidate ID: ");
                    String findID = scanner.nextLine();
                    app.searchCandidate(findID);
                    break;
                }
                case 4:{
                    return;
                }
                default:
                    System.out.println("Invalid");
            }
        }
    }
}

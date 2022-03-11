package Exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UI {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        TownManager manager = new TownManager();

        while (true){
            System.out.println("Enter 1: Insert a new family");
            System.out.println("Enter 2: Show all family");
            System.out.println("Enter 3: Exit");

            int type = Integer.valueOf(scanner.nextLine());

            switch (type) {
                case 1: {
                    System.out.print("Enter House number: ");
                    int house_number = Integer.valueOf(scanner.nextLine());
                    System.out.print("Enter number of family member: ");
                    int member_qty = Integer.valueOf(scanner.nextLine());
                    List family_members = new ArrayList<>();
                    for (int i = 1; i <= member_qty; i++) {
                        System.out.print("Enter name of member number " + i + ": ");
                        String name = scanner.nextLine();
                        System.out.print("Enter age of member number " + i + ": ");
                        int age = Integer.valueOf(scanner.nextLine());
                        System.out.print("Enter job title of member number " + i + ": ");
                        String job = scanner.nextLine();
                        System.out.print("Enter ID of member number " + i + ": ");
                        int ID = Integer.valueOf(scanner.nextLine());

                        family_members.add(new Human(name, age, job, ID));
                    }
                    manager.insertFamily(house_number, member_qty, family_members);
                    break;
                }
                case 2:{
                    manager.showAllFamily();
                    break;
                }
                case 3:{
                    System.out.println("END!");
                    return;
                }
                default:
                    System.out.println("Invalid");
            }
        }

    }
}

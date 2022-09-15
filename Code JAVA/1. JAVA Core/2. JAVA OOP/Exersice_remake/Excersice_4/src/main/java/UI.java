import Entity.Apartment;
import Entity.Human;
import Manager.Town;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UI {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        Town townManager = new Town();

        while(true) {
            System.out.println("=========================================================");
            System.out.println("Enter 1: Insert Family ");
            System.out.println("Enter 2: Show all the family");
            System.out.println("Enter 3: Exit");

            int type = Integer.valueOf(scanner.nextLine());

            switch(type) {
                case 1: {
                    System.out.print("Enter the number of apartment you wanna insert: "); int numberOfApartment = Integer.valueOf(scanner.nextLine());
                    System.out.println("=========================================================");

                    for (int i = 1; i<= numberOfApartment; i++) {
                        System.out.print("Enter the Address of apartment number " + i + ": "); String new_Address = scanner.nextLine();
                        System.out.print("Enter the number of human in apartment number " + i + ": "); int numberOfHuman = Integer.valueOf(scanner.nextLine());

                        List<Human> humanList = new ArrayList<Human>();

                        for (int j = 1; j <= numberOfHuman; j++) {
                            System.out.println("---------------------------------------------------------");
                            System.out.print("Enter ID of human number " + j + ": "); String new_ID = scanner.nextLine();
                            System.out.print("Enter name of human number " + j + ": "); String new_name = scanner.nextLine();
                            System.out.print("Enter age of human number " + j + ": "); int new_age = Integer.valueOf(scanner.nextLine());
                            System.out.print("Enter job of human number" + j + ": "); String new_job = scanner.nextLine();

                            humanList.add(new Human(new_ID, new_name, new_age, new_job));
                        }
                        townManager.addApartment(new Apartment(new_Address, humanList, numberOfHuman));
                    }
                    break;
                }
                case 2: {
                    townManager.showTownInformation();
                    break;
                }
                case 3: {
                    System.out.println("End program!");
                    return;
                }
                default: {
                    System.out.println("Invalid!");
                    break;
                }
            }
        }
    }
}

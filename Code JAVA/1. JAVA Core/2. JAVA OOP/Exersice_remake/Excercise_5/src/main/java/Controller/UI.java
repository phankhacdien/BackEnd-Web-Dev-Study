package Controller;

import Model_Entity.RoomA;
import Model_Entity.RoomB;
import Model_Entity.RoomC;
import Service.GuessManagement;
import Service.HotelManagement;

import java.util.Scanner;

public class UI {
    public void run() {
        HotelManagement hotelManager = new HotelManagement();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("===================================================");
            System.out.println("Enter 1: Insert new Guess");
            System.out.println("Enter 2: Release Guess by ID");
            System.out.println("Enter 3: Payment for Guess by ID");
            System.out.println("Enter 4: Exit");

            int type = Integer.valueOf(scanner.nextLine());

            switch(type) {
                case 1:{
                    System.out.println("---------------------------------------------------");
                    System.out.print("Enter Human ID of Guess: "); String new_guessID = scanner.nextLine();
                    System.out.print("Enter Guess's Name: "); String new_guessName = scanner.nextLine();
                    System.out.print("Enter number of rent day: "); int rentPeriod = Integer.valueOf(scanner.nextLine());
                    System.out.println("Enter A: To choose room type A");
                    System.out.println("Enter B: To choose room type B");
                    System.out.println("Enter C: To choose room type C");
                    String roomType = scanner.nextLine();

                    switch(roomType) {
                        case "A": {
                            hotelManager.insert(new GuessManagement(new_guessID, new_guessName, rentPeriod, new RoomA()));
                            break;
                        }
                        case "B": {
                            hotelManager.insert(new GuessManagement(new_guessID, new_guessName, rentPeriod, new RoomB()));
                            break;
                        }
                        case "C": {
                            hotelManager.insert(new GuessManagement(new_guessID, new_guessName, rentPeriod, new RoomC()));
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("---------------------------------------------------");
                    System.out.print("Enter the ID of guess: "); String release_ID = scanner.nextLine();
                    hotelManager.deleteByID(release_ID);
                    break;
                }
                case 3: {
                    System.out.println("---------------------------------------------------");
                    System.out.print("Enter the ID of guess: "); String payment_ID = scanner.nextLine();
                    System.out.println("Total payment: " + hotelManager.payment(payment_ID));
                    break;
                }
                case 4: {
                    System.out.println("Exit!");
                    return;
                }
                default: {
                    System.out.println("Invalid!");
                }
            }
        }
    }

}

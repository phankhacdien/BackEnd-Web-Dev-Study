package Exercise9;

import Exercise8.Student;
import Exercise8.Ticket;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BillManager manager = new BillManager();

        while(true){
            System.out.println("Enter 1: Insert bill");
            System.out.println("Enter 2: Delete bill");
            System.out.println("Enter 3: Revise bill");
            System.out.println("Enter 4: Show bill");

            int choose = Integer.valueOf(scanner.nextLine());
            switch(choose){
                case 1:{
                    System.out.print("Name: "); String name = scanner.nextLine();
                    System.out.print("House number: "); int house_number = Integer.valueOf(scanner.nextLine());
                    System.out.print("Electrical meter ID: "); String electrical_meterID = scanner.nextLine();
                    System.out.print("Old Electrical index "); int old_electricalIndex = Integer.valueOf(scanner.nextLine());
                    System.out.print("New Electrical index "); int new_electricalIndex = Integer.valueOf(scanner.nextLine());
                    HouseHold new_customer = new HouseHold(name, house_number, electrical_meterID);
                    Bill new_bill = new Bill(new_customer, old_electricalIndex, new_electricalIndex);
                    manager.insert(new_bill);
                    break;
                }
                case 2:{
                    System.out.print("House number: "); int del_house = Integer.valueOf(scanner.nextLine());
                    manager.delete(del_house);
                    break;
                }
                case 3:{
                    System.out.print("House number: "); int revise_house = Integer.valueOf(scanner.nextLine());
                    System.out.print("New Name: "); String new_name = scanner.nextLine();
                    System.out.print("New House number: "); int new_house_number = Integer.valueOf(scanner.nextLine());
                    System.out.print("New Electrical meter ID: "); String new_electrical_meterID = scanner.nextLine();
                    manager.revise(revise_house, new_name, new_house_number, new_electrical_meterID);
                    break;
                }
                case 4:{
                    System.out.print("House number: "); int show_house = Integer.valueOf(scanner.nextLine());
                    manager.show(show_house);
                    break;
                }
            }
        }
    }
}

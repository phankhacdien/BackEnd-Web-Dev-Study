package Exercise5;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel app = new Hotel();

        while (true){
            System.out.println("Enter 1: Insert a new Customer");
            System.out.println("Enter 2: Delete a Customer by ID");
            System.out.println("Enter 3: Payment");

            int choose = Integer.valueOf(scanner.nextLine());

            switch (choose){
                case 1:{
                     System.out.print("Enter name: "); String name = scanner.nextLine();
                     System.out.print("Enter age: "); int age = Integer.valueOf(scanner.nextLine());
                     System.out.print("Enter ID: "); String id = scanner.nextLine();
                     System.out.print("Enter type of Room: "); String room_type = scanner.nextLine();
                     System.out.print("Enter rent period: "); int rent_period = Integer.valueOf(scanner.nextLine());
                     Room room = null;
                     if (room_type.toUpperCase().equals("A")){
                         room = new RoomA();
                     } else if (room_type.toUpperCase().equals("B")){
                         room = new RoomB();
                     } else if (room_type.toUpperCase().equals("C")){
                         room = new RoomC();
                     } else {
                         System.out.println("We do not have such of room.");
                     }
                     Customer new_customer = new Customer(name, age, id, room, rent_period);
                     app.insert(new_customer);
                     break;
                }
                case 2:{
                    System.out.print("Enter ID: "); String del_id = scanner.nextLine();
                    app.delete(del_id);
                    break;
                }
                case 3:{
                    System.out.print("Enter ID: "); String pay_id = scanner.nextLine();
                    app.payment(pay_id);
                    break;
                }
            }
        }
    }
}

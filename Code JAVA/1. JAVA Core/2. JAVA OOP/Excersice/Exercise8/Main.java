package Exercise8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        Library manager = new Library();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        while(true){
            System.out.println("Enter 1: Insert borrow ticket");
            System.out.println("Enter 2: Delete borrow ticket");
            System.out.println("Enter 3: Show borrow ticket");

            int choose = Integer.valueOf(scanner.nextLine());
            switch(choose){
                case 1:{
                    System.out.print("Ticket ID: "); String ticketID = scanner.nextLine();
                    System.out.print("Borrow Day (dd/MM/yyyy HH:mm): "); Date borrow_date = df.parse(scanner.nextLine());
                    System.out.print("Book ID: "); String bookID = scanner.nextLine();
                    System.out.print("Borrow period: "); int period = Integer.valueOf(scanner.nextLine());
                    System.out.print("Enter Student name: "); String name = scanner.nextLine();
                    System.out.print("Enter Student age: "); int age = Integer.valueOf(scanner.nextLine());
                    System.out.print("Enter Student grade: "); String grade = scanner.nextLine();
                    Student new_student = new Student(name, age,grade);
                    Ticket new_ticket = new Ticket(ticketID, borrow_date, bookID, new_student);
                    manager.insert(new_ticket);
                    break;
                }
                case 2:{
                    System.out.print("Ticket ID: "); String del_ticketID = scanner.nextLine();
                    manager.delete(del_ticketID);
                    break;
                }
                case 3:{
                    System.out.print("Ticket ID: "); String show_ticketID = scanner.nextLine();
                    manager.show(show_ticketID);
                    break;
                }
            }
        }
    }
}

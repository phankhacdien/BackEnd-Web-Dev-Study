package Controller;

import Entity.Student;
import Service.StdClass;

import java.util.Scanner;

public class UI {
    public void run() {
        StdClass classRoom = new StdClass();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1: Insert new Student.");
            System.out.println("Enter 2: Show U20 Student information.");
            System.out.println("Enter 3: Show total Student U23 from DN.");
            System.out.println("Enter 4: Exit!!!");

            int option = Integer.valueOf(scanner.nextLine());

            switch(option) {
                case 1: {
                    System.out.print("Enter student name: "); String newStdName = scanner.nextLine();
                    System.out.print("Enter student age: "); int newStdAge = Integer.valueOf(scanner.nextLine());
                    System.out.print("Enter student home town: "); String newStdHomeTown = scanner.nextLine();

                    classRoom.insertStudent(new Student(newStdName, newStdAge, newStdHomeTown));
                    break;
                }
                case 2: {
                    System.out.println("Show U20 Student information");
                    classRoom.showU20StudentInfo();
                    break;
                }
                case 3: {
                    System.out.println("Total Student U23 from DN: " + classRoom.countU23StudentFromDN());
                    break;
                }
                case 4: {
                    System.out.println("Exit!!!");
                    return;
                }
                default: {
                    System.out.println("Invalid!!!");
                    break;
                }
            }
        }
    }
}

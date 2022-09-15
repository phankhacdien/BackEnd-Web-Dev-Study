import Entity.Employee;
import Entity.Engineer;
import Entity.Worker;
import Manager.OfficeManager;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OfficeManager officeManager = new OfficeManager();

        while(true) {
            System.out.println("Application manager officer");
            System.out.println("Enter 1: To Insert a officer");
            System.out.println("Enter 2: To find officer by name");
            System.out.println("Enter 3: To show officer list");
            System.out.println("Enter 4: To exit app");

            int line = Integer.valueOf(scanner.nextLine());

            switch (line) {
                case 1: {
                    System.out.println("Enter a: To insert Engineer");
                    System.out.println("Enter b: To insert Worker");
                    System.out.println("Enter c: To insert Employee");

                    String type = scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = Integer.valueOf(scanner.nextLine());
                    System.out.print("Enter Gender: ");
                    String genre = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String addr = scanner.nextLine();

                    switch (type) {
                        case "a": {
                            System.out.print("Enter Major: ");
                            String major = scanner.nextLine();
                            officeManager.addOfficer(new Engineer(name, age, genre, addr, major));
                            break;
                        }
                        case "b": {
                            System.out.print("Enter Level: ");
                            int level = Integer.valueOf(scanner.nextLine());
                            officeManager.addOfficer(new Worker(name, age, genre, addr, level));
                            break;
                        }
                        case "c": {
                            System.out.print("Enter Job: ");
                            String job = scanner.nextLine();
                            officeManager.addOfficer(new Employee(name, age, genre, addr, job));
                            break;
                        }
                        default: {
                            System.out.println("Invalid");
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.print("Enter name of officer you wanna find: ");
                    String name = scanner.nextLine();
                    officeManager.searchOfficerByName(name);
                    break;
                }
                case 3: {
                    officeManager.showOfficerList();
                    break;
                }
                case 4: {
                    return;
                }
                default: {
                    System.out.println("Invalid");
                    break;
                }
            }
        }
    }
}

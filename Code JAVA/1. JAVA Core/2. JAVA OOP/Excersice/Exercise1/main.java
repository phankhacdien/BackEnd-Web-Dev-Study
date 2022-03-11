package Exercise1;

import java.util.Scanner;

public class main {
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OfficerManager manage = new OfficerManager();
        while (true) {
            System.out.println("Application Manage Officer");
            System.out.println("Enter 1: To Insert officer");
            System.out.println("Enter 2: To search officer by name");
            System.out.println("Enter 3: To show officer's list");
            System.out.println("Enter 4: To Exit");

            int line = Integer.valueOf(scanner.nextLine());

            switch (line) {
                case 1: {
                    System.out.println("Enter a: To Insert Engineer");
                    System.out.println("Enter b: To Insert Worker");
                    System.out.println("Enter c: To Insert Staff");
                    String type = scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = Integer.valueOf(scanner.nextLine());
                    System.out.print("Enter Gender: ");
                    String gender = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String addr = scanner.nextLine();

                    switch (type) {
                        case "a": {
                            System.out.print("Enter Major: ");
                            String major = scanner.nextLine();
                            Officer engineer = new Engineer(name, age, gender, addr, major);
                            manage.addOfficer(engineer);
                            break;
                        }
                        case "b": {
                            System.out.print("Enter Level: ");
                            int level = Integer.valueOf(scanner.nextLine());
                            Officer worker = new Worker(name, age, gender, addr, level);
                            manage.addOfficer(worker);
                            break;
                        }
                        case "c": {
                            System.out.print("Enter Job: ");
                            String job = scanner.nextLine();
                            Officer employee = new Employee(name, age, gender, addr, job);
                            manage.addOfficer(employee);
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case 2: {
                    System.out.print("Enter name of officer you wanna search: ");
                    String search = scanner.nextLine();
                    manage.searchOfficerByName(search);
                    break;
                }
                case 3: {
                    manage.showOfficerList();
                    break;
                }
                case 4: {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
    }
}

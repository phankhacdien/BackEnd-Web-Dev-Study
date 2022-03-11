package Exercise7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TeacherManager manager = new TeacherManager();

        while(true){
            System.out.println("Enter 1: Insert Teacher");
            System.out.println("Enter 2: Delete Teacher");
            System.out.println("Enter 3: Calculate teacher salary");

            int choose = Integer.valueOf(scanner.nextLine());
            switch (choose){
                case 1:{
                    System.out.print("Enter name: "); String name = scanner.nextLine();
                    System.out.print("Enter age: "); int age = Integer.valueOf(scanner.nextLine());
                    System.out.print("Enter country: "); String country = scanner.nextLine();
                    System.out.print("Enter Teacher ID: "); String teacherID = scanner.nextLine();
                    System.out.print("Basic Salary: "); int basic_salary = Integer.valueOf(scanner.nextLine());
                    Teacher new_teacher = new Teacher(name, age, country, teacherID, basic_salary);
                    manager.insert(new_teacher);
                    break;
                }
                case 2:{
                    System.out.print("Enter teacher ID: ");
                    String del_ID = scanner.nextLine();
                    manager.delete(del_ID);
                    break;
                }
                case 3: {
                    System.out.print("Enter teacher ID: "); String calculateID = scanner.nextLine();
                    System.out.print("Enter bonus salary: "); int bonus = Integer.valueOf(scanner.nextLine());
                    System.out.print("Enter penalty: "); int penalty = Integer.valueOf(scanner.nextLine());
                    manager.calculateSalary(calculateID, bonus, penalty);
                    break;
                }
            }
        }
    }
}

package Exercise6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Classroom manager = new Classroom();

        while(true){
            System.out.println("Enter 1: Insert a new Student");
            System.out.println("Enter 2: Show students who 20 years old");
            System.out.println("Enter 3: Show students who 23 years old and born in DN");

            int choose = Integer.valueOf(scanner.nextLine());
            switch(choose){
                case 1:{
                    System.out.print("Enter name: "); String name = scanner.nextLine();
                    System.out.print("Enter age: "); int age = Integer.valueOf(scanner.nextLine());
                    System.out.print("Enter country: "); String country = scanner.nextLine();
                    Student new_student = new Student(name, age, country);
                    manager.insert(new_student);
                    break;
                }
                case 2:{
                    manager.showStudent20ys();
                    break;
                }
                case 3:{
                    manager.showStudent23ysLiveInDN();
                    break;
                }
            }
        }
    }
}

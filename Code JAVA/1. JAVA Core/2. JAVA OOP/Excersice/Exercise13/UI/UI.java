package Exercise13.UI;

import Exercise13.Entity.*;
import Exercise13.Exception.BirthDayException;
import Exercise13.Service.EmployeeManager;
import Exercise13.Service.ValidatorService;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UI {
    Scanner scanner = new Scanner(System.in);
    EmployeeManager manager = new EmployeeManager();
    DateTimeFormatter date_formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void run() throws BirthDayException {
        while(true) {
            System.out.println("Enter 1: Insert new Employee");
            System.out.println("Enter 2: Revise Employee Information");
            System.out.println("Enter 3: Delete Employee");

            int choose = Integer.valueOf(scanner.nextLine());
            switch (choose) {
                case 1: {
                    System.out.print("Enter ID: "); String id = scanner.nextLine();
                    System.out.print("Enter Full Name: "); String fullName = scanner.nextLine();
                    System.out.print("Enter Birthday (dd/MM/yyyy): "); LocalDate birthday = LocalDate.parse(scanner.nextLine(), date_formatter);
                    System.out.print("Enter phone number: "); int phone = Integer.valueOf(scanner.nextLine());
                    System.out.print("Enter Email: "); String email = scanner.nextLine();
                    System.out.print("Enter number of Certificate: "); int certificateQty = Integer.valueOf(scanner.nextLine());
                    ValidatorService.checkBirthDay(birthday);
                    List<Certificate> new_certificateList = new ArrayList<Certificate>();
                    for (int i = 1; i <= certificateQty; i++) {
                        System.out.print("Certificate Name No." + i + ": "); String certificateName = scanner.nextLine();
                        System.out.print("Certificate ID No." + i + ": "); String certificateID = scanner.nextLine();
                        System.out.print("Certificate Rank No." + i + ": "); int certificateRank = Integer.valueOf(scanner.nextLine());
                        System.out.print("Certificate Date (dd/MM/yyyy) No." + i + ": "); LocalDate certificateDate = LocalDate.parse(scanner.nextLine(), date_formatter);
                        Certificate new_certificate = new Certificate(certificateName, certificateID, certificateRank, certificateDate);
                        new_certificateList.add(new_certificate);
                    }
                    Employee new_employee = null;
                    System.out.println("Enter 1: Insert Experience Employee");
                    System.out.println("Enter 2: Insert Fresher Information");
                    System.out.println("Enter 3: Insert Intern Employee");
                    int type = Integer.valueOf(scanner.nextLine());
                    switch (type) {
                        case 1: {
                            System.out.print("Experience year: "); int expInYear = Integer.valueOf(scanner.nextLine());
                            System.out.print("Enter Skill: "); String proSkill = scanner.nextLine();
                            new_employee = new ExpEmployee(id, fullName, birthday, phone, email, new_certificateList, expInYear, proSkill);
                            break;
                        }
                        case 2: {
                            System.out.print("Enter Graduation Date (dd/MM/yyyy): "); LocalDate graduationDate = LocalDate.parse(scanner.nextLine(), date_formatter);
                            System.out.print("Enter Graduation Rank: "); String graduationRank = scanner.nextLine();
                            new_employee = new FresherEmployee(id,fullName, birthday, phone, email, new_certificateList, graduationDate, graduationRank);
                            break;
                        }
                        case 3: {
                            System.out.print("Enter major: "); String major = scanner.nextLine();
                            System.out.print("Enter Semester: "); int semester = Integer.valueOf(scanner.nextLine());
                            System.out.print("Enter University: "); String university = scanner.nextLine();
                            new_employee = new InternEmployee(id,fullName, birthday, phone, email, new_certificateList, major, semester, university);
                            break;
                        }
                    }
                    manager.insert(new_employee);
                    break;
                }
                case 2: {
                    System.out.print("Enter ID: "); String revise_id = scanner.nextLine();
                    manager.revise(revise_id);
                    break;
                }
                case 3: {
                    System.out.print("Enter ID: "); String remove_id = scanner.nextLine();
                    manager.remove(remove_id);
                    break;
                }
            }
        }
    }
}

package Exercise13.Entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Employee {
    private String id;
    private String fullName;
    private LocalDate birthday;
    private int phone;
    private String email;
    private List<Certificate> certificateList;

    DateTimeFormatter date_formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Employee(String id, String fullName, LocalDate birthday, int phone, String email, List<Certificate> certificateList) {
        this.id = id;
        this.fullName = fullName;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
        this.certificateList = certificateList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", birthday=" + birthday +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", certificateList=" + certificateList +
                '}';
    }

    public void revise(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1: Revise Name");
        System.out.println("Enter 2: Revise BirthDay");
        System.out.println("Enter 3: Revise Phone");
        System.out.println("Enter 4: Revise Email");
        System.out.println("Enter 5: Remove Certification");
        int choose = Integer.valueOf(scanner.nextLine());
        switch (choose){
            case 1:{
                System.out.print("Enter Full Name: "); String new_fullName = scanner.nextLine();
                this.setFullName(new_fullName);
                break;
            }
            case 2:{
                System.out.print("Enter Birthday (dd/MM/yyyy): "); LocalDate new_birthday = LocalDate.parse(scanner.nextLine(), date_formatter);
                this.setBirthday(new_birthday);
                break;
            }
            case 3:{
                System.out.print("Enter phone number: "); int new_phone = Integer.valueOf(scanner.nextLine());
                this.setPhone(new_phone);
                break;
            }
            case 4:{
                System.out.print("Enter Email: "); String new_email = scanner.nextLine();
                this.setEmail(new_email);
                break;
            }
            case 5: {
                System.out.print("Certificate ID: "); String revise_certificateID = scanner.nextLine();
                List remove_certificate = this.certificateList.stream()
                        .filter(certificate -> certificate.getCertificateID().equals(revise_certificateID))
                        .collect(Collectors.toList());
                this.certificateList.removeAll(remove_certificate);
            }
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCertificateList(List<Certificate> certificateList) {
        this.certificateList = certificateList;
    }

    public String getId() {
        return id;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public List<Certificate> getCertificateList() {
        return certificateList;
    }
}

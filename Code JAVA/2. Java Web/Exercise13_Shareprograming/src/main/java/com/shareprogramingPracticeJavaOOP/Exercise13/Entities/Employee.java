package com.shareprogramingPracticeJavaOOP.Exercise13.Entities;

import com.shareprogramingPracticeJavaOOP.Exercise13.Utils.EmployeeType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter
@Setter
public abstract class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeID;
    private String employeeName;
    private LocalDate employeeBirthday;
    private String employeePhone;
    private EmployeeType employeeType;
    private int employeeCount;

    public Employee() {
    }

    public Employee(String employeeName, LocalDate employeeBirthday, String employeePhone, EmployeeType employeeType, int employeeCount) {
        this.employeeName = employeeName;
        this.employeeBirthday = employeeBirthday;
        this.employeePhone = employeePhone;
        this.employeeType = employeeType;
        this.employeeCount = employeeCount;
    }
}

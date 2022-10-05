package com.shareprogramingPracticeJavaOOP.Exercise13.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Intern_Employee_TBL")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class InternEmployee extends Employee{

    @Column(nullable = false)
    private String major;
    private String semester;
    private String university;
}

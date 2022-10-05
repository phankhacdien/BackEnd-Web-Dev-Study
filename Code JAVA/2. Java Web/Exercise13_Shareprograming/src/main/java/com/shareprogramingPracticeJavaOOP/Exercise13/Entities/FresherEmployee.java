package com.shareprogramingPracticeJavaOOP.Exercise13.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Fresher_Employee_TBL")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class FresherEmployee extends Employee{
    @Column(nullable = false)
    private LocalDate graduationDate;
    private String graduationRank;
    private String educationUniversity;
}

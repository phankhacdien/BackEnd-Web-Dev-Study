package com.example.security_viblo_nguyenhoangnam.Entities;

import javax.persistence.*;

@Entity
@Table(name = "user_Tbl")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String userName;
    private String userPassword;
}

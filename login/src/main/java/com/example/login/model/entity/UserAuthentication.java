package com.example.login.model.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name="USER_AUTHENTICATION")
public class UserAuthentication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "jwt")
    private String jwt;


}

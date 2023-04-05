package com.gnlsystems.vcs.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Table(name="auth_user")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="user_inst_id")
    private Long id;

    @Column(name= "first_name")
    private String firstname;

    @Column(name = "last_name")
    private String lastname;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "role_id")
    private String role;

}

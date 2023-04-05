package com.gnlsystems.vcs.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "auth_role")
@Getter
@Setter
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_inst_id")
    private Long id;

    @Column(name = "role_name")
    private String role;

    @Column(name = "role_desc")
    private String desc;
}

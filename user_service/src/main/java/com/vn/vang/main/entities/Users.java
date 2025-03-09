package com.vn.vang.main.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * CreatedDate: 09/03/2025
 * UpdatedDate:
 * Version: 1.0
 * Author: Quang
 * Name: Users
 */
@Entity
@Table(name = Users.TABLE_NAME)
@Getter
@Setter
@NoArgsConstructor
public class Users {

    public static final String TABLE_NAME = "USERS";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_USER_J")
    @SequenceGenerator(name = "SEQ_USER_J", sequenceName = "SEQ_USERS", allocationSize = 1)
    @Column(name = "ID")
    private Long userId;

    @Column(name = "FIRST_DATE")
    private String firstName;

    @Column(name = "LAST_DATE")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "ACTIVATED", columnDefinition = "NUMERIC(1)")
    private Boolean isActive;

    @Column(name = "ROLES")
    private String roles;

    @Column(name = "VERIFIED", columnDefinition = "NUMERIC(1)")
    private Boolean isVerify;

    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Column(name = "UPDATED_DATE")
    private Date updatedDate;

    @Column(name = "DELETED_DATE")
    private Date deletedDate;
}
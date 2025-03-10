package com.vn.vang.main.query.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * CreatedDate: 09/03/2025
 * UpdatedDate:
 * Version: 1.0
 * Author: Quang
 * Name: UserRequestModel
 */
@Getter
@Setter
@NoArgsConstructor
public class UserResponseModel {

    private Long userId;

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    private Boolean isActive;

    private String roles;

    private Boolean isVerify;

    private Date createdDate;

    private Date updatedDate;

    private Date deletedDate;
}
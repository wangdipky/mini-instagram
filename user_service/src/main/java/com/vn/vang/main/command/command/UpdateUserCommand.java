package com.vn.vang.main.command.command;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * CreatedDate: 09/03/2025
 * UpdatedDate:
 * Version: 1.0
 * Author: Quang
 * Name: UpdateUserCommand
 */
@Getter
@Setter
@NoArgsConstructor
public class UpdateUserCommand {

    private String aggId = System.currentTimeMillis() + "";

    private Long userId;

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    private Integer isActive;

    private String roles;

    private Integer isVerify;

    private Date createdDate;

    private Date updatedDate;

    private Date deletedDate;
}
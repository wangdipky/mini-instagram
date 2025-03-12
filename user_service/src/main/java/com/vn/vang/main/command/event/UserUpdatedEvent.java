package com.vn.vang.main.command.event;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * CreatedDate: 09/03/2025
 * UpdatedDate:
 * Version: 1.0
 * Author: Quang
 * Name: UserUpdatedEvent
 */
@Getter
@Setter
@NoArgsConstructor
public class UserUpdatedEvent {

    private String aggId;

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
package com.vn.vang.main.command.command;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * CreatedDate: 09/03/2025
 * UpdatedDate:
 * Version: 1.0
 * Author: Quang
 * Name: DeleteUserCommand
 */
@Getter
@Setter
@NoArgsConstructor
public class DeleteUserCommand {

    private String aggId = System.currentTimeMillis() + "";

    private Long userId;
}
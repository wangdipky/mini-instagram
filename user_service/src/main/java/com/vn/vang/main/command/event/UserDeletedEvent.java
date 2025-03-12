package com.vn.vang.main.command.event;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * CreatedDate: 09/03/2025
 * UpdatedDate:
 * Version: 1.0
 * Author: Quang
 * Name: UserDeletedEvent
 */
@Getter
@Setter
@NoArgsConstructor
public class UserDeletedEvent {

    private String aggId;

    private Long userId;
}
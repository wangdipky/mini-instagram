package com.vn.vang.main.command.handler;

import com.vn.vang.main.command.event.UserCreatedEvent;
import com.vn.vang.main.entities.Users;
import com.vn.vang.main.repository.UserRepository;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * CreatedDate: 09/03/2025
 * UpdatedDate:
 * Version: 1.0
 * Author: Quang
 * Name: UserEventsHandler
 */
@Component
@Transactional(rollbackFor = Exception.class)
public class UserEventsHandler {

    private final UserRepository userRepository;

    @Autowired
    public UserEventsHandler(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @EventHandler
    public void handle(UserCreatedEvent event) {

        Users users = new Users();
        BeanUtils.copyProperties(event, users);
        userRepository.save(users);
    }
}

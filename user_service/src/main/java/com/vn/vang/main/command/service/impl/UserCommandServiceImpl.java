package com.vn.vang.main.command.service.impl;

import com.vn.vang.main.command.command.CreateUserCommand;
import com.vn.vang.main.command.model.UserRequestModel;
import com.vn.vang.main.command.service.IUserCommandService;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * CreatedDate: 09/03/2025
 * UpdatedDate:
 * Version: 1.0
 * Author: Quang
 * Name: CreateUserCommand
 */
@Service
public class UserCommandServiceImpl implements IUserCommandService {

    private final CommandGateway commandGateway;

    @Autowired
    public UserCommandServiceImpl(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    @Override
    public UserRequestModel addUser(UserRequestModel requestModel) {

        CreateUserCommand createUserCommand = new CreateUserCommand();
        BeanUtils.copyProperties(requestModel, createUserCommand);
        createUserCommand.setCreatedDate(new Date());
        commandGateway.sendAndWait(createUserCommand);
        return requestModel;
    }
}

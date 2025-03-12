package com.vn.vang.main.command.service;

import com.vn.vang.main.command.model.UserRequestModel;

/**
 * CreatedDate: 09/03/2025
 * UpdatedDate:
 * Version: 1.0
 * Author: Quang
 * Name: IUserCommandService
 */
public interface IUserCommandService {

    public UserRequestModel addUser(UserRequestModel user);

    public UserRequestModel updateUser(UserRequestModel user);

    public Long deleteUser(Long id);
}
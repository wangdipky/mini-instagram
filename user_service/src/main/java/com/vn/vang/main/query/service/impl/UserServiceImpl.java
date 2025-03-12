package com.vn.vang.main.query.service.impl;

import com.vn.vang.main.query.model.UserResponseModel;
import com.vn.vang.main.query.queries.GetAllUsers;
import com.vn.vang.main.query.queries.GetById;
import com.vn.vang.main.query.service.IUserService;
import lombok.SneakyThrows;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * CreatedDate: 09/03/2025
 * UpdatedDate:
 * Version: 1.0
 * Author: Quang
 * Name: UserServiceImpl
 */
@Service
public class UserServiceImpl implements IUserService {

    private final QueryGateway queryGateway;

    @Autowired
    public UserServiceImpl(QueryGateway queryGateway) {
        this.queryGateway = queryGateway;
    }

    @SneakyThrows
    @Override
    public List<UserResponseModel> getAllUsers() {

        GetAllUsers allUsers = new GetAllUsers();
        return queryGateway.query(allUsers, ResponseTypes.multipleInstancesOf(UserResponseModel.class)).get();
    }

    @SneakyThrows
    @Override
    public UserResponseModel getUserById(Long id) {

        GetById byId = new GetById(id);
        return queryGateway.query(byId, ResponseTypes.instanceOf(UserResponseModel.class)).get();
    }

}
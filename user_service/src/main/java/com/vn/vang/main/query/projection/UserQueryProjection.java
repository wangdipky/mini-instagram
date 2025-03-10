package com.vn.vang.main.query.projection;


import com.vn.vang.main.entities.Users;
import com.vn.vang.main.query.model.UserResponseModel;
import com.vn.vang.main.query.queries.GetAllUsers;
import com.vn.vang.main.query.queries.GetById;
import com.vn.vang.main.repository.UserRepository;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * CreatedDate: 09/03/2025
 * UpdatedDate:
 * Version: 1.0
 * Author: Quang
 * Name: UserQueryProjection
 */
@Component
public class UserQueryProjection {

    private final UserRepository userRepository;

    @Autowired
    public UserQueryProjection(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @QueryHandler
    public List<UserResponseModel> getAllUsers(GetAllUsers allUsers) {

        List<UserResponseModel> responseModels = new ArrayList<>();
        List<Users> users = userRepository.findAll();
        for (Users user : users) {

            UserResponseModel responseModel = new UserResponseModel();
            BeanUtils.copyProperties(user, responseModel);
            responseModels.add(responseModel);
        }
        return responseModels;
    }

    @QueryHandler
    public UserResponseModel getUserById(GetById byId) {

        UserResponseModel responseModel = new UserResponseModel();
        Users user = userRepository.findById(byId.getId()).orElse(null);
        BeanUtils.copyProperties(user, responseModel);
        return responseModel;
    }

}
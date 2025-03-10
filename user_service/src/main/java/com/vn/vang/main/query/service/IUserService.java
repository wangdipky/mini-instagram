package com.vn.vang.main.query.service;

import com.vn.vang.main.query.model.UserResponseModel;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * CreatedDate: 09/03/2025
 * UpdatedDate:
 * Version: 1.0
 * Author: Quang
 * Name: IUserService
 */
public interface IUserService {

    /**
     * This function uses get all users
     * @return {@link List<UserResponseModel>}
     */
    public List<UserResponseModel> getAllUsers();

    /**
     * This function uses get user by id
     * @param {{@link Long}}
     * id
     * @return {@link UserResponseModel}
     */
    public UserResponseModel getUserById(Long id);
}
package com.vn.vang.main.query.controller;

import com.vn.vang.basecommon.constant.CommonConstant;
import com.vn.vang.main.query.model.UserResponseModel;
import com.vn.vang.main.query.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * CreatedDate: 09/03/2025
 * UpdatedDate:
 * Version: 1.0
 * Author: Quang
 * Name: UserController
 */
@RequestMapping(CommonConstant.API_V1 + CommonConstant.URI_USER)
@RestController
public class UserController {

    private final IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping(CommonConstant.URI_LIST)
    public CompletableFuture<List<UserResponseModel>> getAll() {
        return CompletableFuture.completedFuture(userService.getAllUsers());
    }

    @GetMapping(CommonConstant.URI_DETAIL)
    public CompletableFuture<UserResponseModel> getById(@PathVariable("id") Long id) {
        return CompletableFuture.completedFuture(userService.getUserById(id));
    }
}
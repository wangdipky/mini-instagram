package com.vn.vang.main.command.controller;

import com.vn.vang.basecommon.constant.CommonConstant;
import com.vn.vang.main.command.model.UserRequestModel;
import com.vn.vang.main.command.service.IUserCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(CommonConstant.API_V1 + CommonConstant.URI_USER)
public class UserCommandController {

    private final IUserCommandService userCommandService;

    @Autowired
    public UserCommandController(IUserCommandService userCommandService) {
        this.userCommandService = userCommandService;
    }

    @PostMapping(CommonConstant.URI_ADD)
    public UserRequestModel addUser(@RequestBody UserRequestModel user) {
        return userCommandService.addUser(user);
    }

}
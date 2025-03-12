package com.vn.vang.main.command.controller;

import com.vn.vang.basecommon.constant.CommonConstant;
import com.vn.vang.main.command.model.UserRequestModel;
import com.vn.vang.main.command.service.IUserCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping(CommonConstant.URI_EDIT)
    public UserRequestModel updateUser(@RequestBody UserRequestModel user) {
        return userCommandService.updateUser(user);
    }

    @DeleteMapping(CommonConstant.URI_DELETE)
    public Long deleteUser(@PathVariable("id") Long userId) {
        return userCommandService.deleteUser(userId);
    }
}
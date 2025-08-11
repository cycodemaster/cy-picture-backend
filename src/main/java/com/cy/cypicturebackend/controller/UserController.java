package com.cy.cypicturebackend.controller;

import com.cy.cypicturebackend.common.BaseResponse;
import com.cy.cypicturebackend.common.ResultUtils;
import com.cy.cypicturebackend.exception.ErrorCode;
import com.cy.cypicturebackend.exception.ThrowUtils;
import com.cy.cypicturebackend.model.dto.user.UserRegisterRequest;
import com.cy.cypicturebackend.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 用户注册
     * @param userRegisterRequest 用户注册请求类
     * @return 新用户主键
     */
    @PostMapping("/userRegister")
    public BaseResponse<Long> userRegister(@RequestBody UserRegisterRequest userRegisterRequest) {
        ThrowUtils.throwIf(userRegisterRequest == null, ErrorCode.PARAMS_ERROR);
        String userAccount = userRegisterRequest.getUserAccount();
        String userPassword = userRegisterRequest.getUserPassword();
        String checkPassword = userRegisterRequest.getCheckPassword();
        long result = userService.userRegister(userAccount, userPassword, checkPassword);
        return ResultUtils.success(result);
    }

}

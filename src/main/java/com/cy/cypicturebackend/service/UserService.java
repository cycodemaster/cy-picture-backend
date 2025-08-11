package com.cy.cypicturebackend.service;

import com.cy.cypicturebackend.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author 陈阳
 * @description 针对表【user(用户)】的数据库操作Service
 * @createDate 2025-08-08 13:18:26
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userAccount   账号
     * @param userPassword  密码
     * @param checkPassword 确认密码
     * @return 新用户主键
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 获取加密密码
     *
     * @param userPassword 密码
     * @return 加密后的密码
     */
    String getEncryptPassword(String userPassword);
}

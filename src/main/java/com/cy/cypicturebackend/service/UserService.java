package com.cy.cypicturebackend.service;

import com.cy.cypicturebackend.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cy.cypicturebackend.model.vo.LoginUserVO;

import javax.servlet.http.HttpServletRequest;

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
     * 用户登录
     *
     * @param userAccount  账号
     * @param userPassword 密码
     * @param request      请求
     * @return 脱敏后的用户信息
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 获取加密密码
     *
     * @param userPassword 密码
     * @return 加密后的密码
     */
    String getEncryptPassword(String userPassword);

    /**
     * 获取脱敏用户信息
     *
     * @param user 用户
     * @return 脱敏后用户
     */
    LoginUserVO getLoginUserVO(User user);

    /**
     * 获取当前登录用户
     * @param request 请求
     * @return 用户
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * 用户注销
     * @param request 请求
     * @return 注销结果
     */
    boolean userLogout(HttpServletRequest request);

}

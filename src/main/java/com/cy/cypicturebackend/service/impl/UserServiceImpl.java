package com.cy.cypicturebackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cy.cypicturebackend.model.entity.User;
import com.cy.cypicturebackend.service.UserService;
import com.cy.cypicturebackend.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 陈阳
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2025-08-08 13:18:26
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}





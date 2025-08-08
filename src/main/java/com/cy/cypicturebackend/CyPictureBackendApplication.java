package com.cy.cypicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.cy.cypicturebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class CyPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CyPictureBackendApplication.class, args);
    }

}

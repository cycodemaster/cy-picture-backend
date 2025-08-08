package com.cy.cypicturebackend.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 删除请求包装类
 */
@Data
public class DeleteRequest implements Serializable {

    private static final long serialVersionUID = -8301134736409081463L;

    /**
     * 主键
     */
    private Long id;

}

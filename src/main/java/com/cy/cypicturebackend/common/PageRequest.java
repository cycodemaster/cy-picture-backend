package com.cy.cypicturebackend.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 分页请求包装类
 */
@Data
public class PageRequest implements Serializable {

    private static final long serialVersionUID = 7058308444252244569L;

    /**
     * 当前页号
     */
    private int current = 1;

    /**
     * 页面大小
     */
    private int pageSize = 10;

    /**
     * 排序字段
     */
    private String sortFiled;

    /**
     * 排序顺序（默认降序）
     */
    private String sortOrder = "descend";

}

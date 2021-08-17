package com.favorites.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * @author JiMeiling
 * @Description 基本实体类
 * @create 2021-08-17 13:08
 */
public class Entitys implements Serializable {
    private static final long serialVersionUID = 1L;

    @Override
    public String toString(){
        return ToStringBuilder.reflectionToString(this);
    }
}

package com.imooc.product.enums;

import lombok.Getter;

/**
 * @author ph
 * @create 2019--08-09
 */
@Getter
public enum  ProductStatusEnum {
          UP (0,"在架"),

         DOWN(1,"下架"),
          ;
          private Integer code;
          private String message;


    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }}

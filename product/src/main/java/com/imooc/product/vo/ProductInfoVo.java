package com.imooc.product.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author ph
 * @create 2019--08-09
 */
@Data
public class ProductInfoVo {

    @JsonProperty("id")
    private String productId;
    @JsonProperty("name")
    private  String productName;
    @JsonProperty("price")
    private  String productPrice;
    @JsonProperty("description")
    private  String productDescription;
    @JsonProperty("icon")
    private String productIcon;
}

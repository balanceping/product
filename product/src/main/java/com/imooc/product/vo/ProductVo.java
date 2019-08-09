package com.imooc.product.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @author ph
 * @create 2019--08-09
 */
@Data
public class ProductVo {

    @JsonProperty("name")
    private  String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    List<ProductInfoVo> productInfoVoList;
}

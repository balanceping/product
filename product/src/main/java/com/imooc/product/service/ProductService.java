package com.imooc.product.service;

import com.imooc.product.dataobject.ProductInfo;

import java.util.List;

/**
 * @author ph
 * @create 2019--08-09
 */
public interface ProductService {
    /**
     * 查询所有在架商品列表
     */
      List<ProductInfo> findUpAll();

}

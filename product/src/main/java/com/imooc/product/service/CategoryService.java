package com.imooc.product.service;

import com.imooc.product.dataobject.ProductCategory;

import java.util.List;

/**
 * @author ph
 * @create 2019--08-09
 */
public interface CategoryService {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}

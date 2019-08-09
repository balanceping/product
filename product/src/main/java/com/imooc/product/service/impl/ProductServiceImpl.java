package com.imooc.product.service.impl;

import com.imooc.product.dataobject.ProductInfo;
import com.imooc.product.enums.ProductStatusEnum;
import com.imooc.product.respository.ProductInfoRespository;
import com.imooc.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ph
 * @create 2019--08-09
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRespository respository;
    @Override
    public List<ProductInfo> findUpAll() {
        return respository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }
}

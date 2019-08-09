package com.imooc.product.respository;

import com.imooc.product.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author ph
 * @create 2019--08-09
 */
public interface ProductInfoRespository extends JpaRepository<ProductInfo,String> {

       List<ProductInfo> findByProductStatus(Integer productStatus);
}

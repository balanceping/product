package com.imooc.product.respository;

import com.imooc.product.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author ph
 * @create 2019--08-09
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRespositoryTest {

    @Autowired
    private ProductInfoRespository productInfoRespository;

    @Test
    public void findByProductStatus() throws  Exception{
        List<ProductInfo> list = productInfoRespository.findByProductStatus(0);
        System.out.println(list.size());

    }
}
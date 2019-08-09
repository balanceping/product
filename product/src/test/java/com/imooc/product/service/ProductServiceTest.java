package com.imooc.product.service;

import com.imooc.product.ProductApplicationTests;
import com.imooc.product.dataobject.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author ph
 * @create 2019--08-09
 */
@Component
public class ProductServiceTest extends ProductApplicationTests {

    @Autowired
    ProductService service;

    @Test
    public void findUpAll() throws Exception{
        List<ProductInfo> upAll = service.findUpAll();
        System.out.println(upAll.size());
    }

}
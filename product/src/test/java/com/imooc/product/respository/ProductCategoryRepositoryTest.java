package com.imooc.product.respository;

import com.imooc.product.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author ph
 * @create 2019--08-09
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;
    @Test
    public void findByCategoryTypeIn() throws  Exception{
        List<ProductCategory> list = repository.findByCategoryTypeIn(Arrays.asList(11, 12));
    }
}
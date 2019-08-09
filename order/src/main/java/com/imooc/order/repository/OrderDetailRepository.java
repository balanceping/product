package com.imooc.order.repository;

import com.imooc.order.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ph
 * @create 2019--08-09
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {
}

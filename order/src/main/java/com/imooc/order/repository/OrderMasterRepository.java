package com.imooc.order.repository;

import com.imooc.order.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ph
 * @create 2019--08-09
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {
}

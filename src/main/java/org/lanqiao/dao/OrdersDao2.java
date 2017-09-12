package org.lanqiao.dao;

import java.util.List;

import org.lanqiao.entity.Orders;

public interface OrdersDao2 {
    int deleteByPrimaryKey(Integer id);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
    
    List<Orders> queryAllOrders();
}
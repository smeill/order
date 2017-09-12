package org.lanqiao.dao;

import java.util.List;

import org.lanqiao.entity.OrderItem;

public interface OrderItemDao {
	int deleteByPrimaryKey(Integer id);

	int insert(OrderItem record);

	int insertSelective(OrderItem record);

	OrderItem selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(OrderItem record);

	int updateByPrimaryKey(OrderItem record);

	/**
	 * 
	 * @param orderId
	 * @return
	 */
	List<OrderItem> getOrderItemsByOrderId(int orderId);
}
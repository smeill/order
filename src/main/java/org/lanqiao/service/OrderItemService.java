package org.lanqiao.service;

import java.util.List;

import org.lanqiao.entity.OrderItem;

public interface OrderItemService {
	public List<OrderItem> getOrderItemsByOrderId(int orderId);

}

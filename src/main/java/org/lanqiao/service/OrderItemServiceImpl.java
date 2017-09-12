package org.lanqiao.service;

import java.util.List;

import org.lanqiao.dao.OrderItemDao;
import org.lanqiao.entity.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderItemServiceImpl implements OrderItemService {
	@Autowired
	OrderItemDao orderItemDao;

	@Override
	public List<OrderItem> getOrderItemsByOrderId(int orderId) {
		// TODO Auto-generated method stub
		return orderItemDao.getOrderItemsByOrderId(orderId);
	}

}

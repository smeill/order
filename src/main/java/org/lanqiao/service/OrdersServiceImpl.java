package org.lanqiao.service;

import java.util.List;

import org.lanqiao.dao.OrdersDao;
import org.lanqiao.entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersServiceImpl implements OrdersService {
	@Autowired
	OrdersDao ordersDao;

	@Override
	public List<Orders> queryAllOrders() {
		// TODO Auto-generated method stub
		return ordersDao.queryAllOrders();
	}

}

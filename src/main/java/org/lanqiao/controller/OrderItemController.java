package org.lanqiao.controller;


import java.util.List;

import org.lanqiao.entity.OrderItem;
import org.lanqiao.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderItemController {
	@Autowired
	OrderItemService orderItemService;
	
	@RequestMapping("showOrderItems")
	public @ResponseBody List<OrderItem> showOrderItems(@RequestParam("orderId")int orderId ){
		return orderItemService.getOrderItemsByOrderId(orderId);
	}
	@RequestMapping("srfjshdj")
	public void sn(){
		
	}
	
}

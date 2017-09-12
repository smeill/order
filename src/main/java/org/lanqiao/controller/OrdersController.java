package org.lanqiao.controller;

import org.lanqiao.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrdersController {
	@Autowired
	OrdersService ordersService;
	
	
	@RequestMapping("index")
	 public  String index(Model model){
		return "index";
	}
	@RequestMapping("showOrders")
	public String  showOrders(Model model) {
		// TODO Auto-generated method stub
		model.addAttribute("list", ordersService.queryAllOrders());
		return "forward:index";
	}

}

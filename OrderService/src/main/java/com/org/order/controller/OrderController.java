package com.org.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.order.model.Customer;
import com.org.order.model.CustomerDetail;
import com.org.order.model.Order;
import com.org.order.service.OrderService;


@RestController
public class OrderController {
	@Autowired
	OrderService orderService;

	@PostMapping("/api/createorder")
	public @ResponseBody String saveCustomer(@RequestBody Order order) {
		
		orderService.createOrder(order);
		return "Order created Successfully";
	}
	
	@GetMapping("/api/order/{customerid}")
	 public @ResponseBody CustomerDetail getCustomerInfo(@PathVariable(name="customerid")String customerid) {
	  return orderService.getCustomerOrderDetail(customerid);
	 }
	@GetMapping("/api/getAllCustomer")
	 public @ResponseBody List<Customer> getAllCustomer() {
	  return orderService.getAllCustomers();
	 }
	
	@GetMapping("/api/getAllorder")
	 public @ResponseBody List<Order> getAllOrder() {
	  return orderService.getAllOrder();
	 }
}

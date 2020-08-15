package com.org.orderitem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.orderitem.model.OrderItem;
import com.org.orderitem.service.OrderItemService;

@RestController
public class OrderItemController {
	@Autowired
	OrderItemService orderItemService;

	@PostMapping("/api/createorderitem")
	public @ResponseBody String saveEmployee(@RequestBody OrderItem orderItem) {
		
		orderItemService.createOrder(orderItem);
		return "OrderItem created Successfully";
	}
	
	@GetMapping("/api/product/{productcode}")
	 public OrderItem getSelectedProduct(@PathVariable(name="productcode")String productcode) {
	  return orderItemService.getProduct(productcode);
	 }
	@GetMapping("/api/getAllproducts")
	 public List<OrderItem> getAllProducts() {
	  return orderItemService.getAllProducts();
	 }
}

package com.org.orderitem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.orderitem.model.OrderItem;
import com.org.orderitem.repository.OrderItemRepository;
@Service
public class OrderItemService {
	@Autowired
	private OrderItemRepository orderItemRepository;

	public  void createOrder(OrderItem orderItem) {
		orderItemRepository.save(orderItem);

	}

	public OrderItem getProduct(String productcode) {
		// TODO Auto-generated method stub
		return orderItemRepository.findAllByProductCode(productcode);
	}

	public List<OrderItem> getAllProducts() {
		// TODO Auto-generated method stub
		return orderItemRepository.findAll();
	}

}

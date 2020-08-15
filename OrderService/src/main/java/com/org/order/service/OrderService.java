package com.org.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.order.client.OrderItemClient;
import com.org.order.model.Customer;
import com.org.order.model.CustomerDetail;
import com.org.order.model.Order;
import com.org.order.repository.CustomerRepository;
import com.org.order.repository.OrderRepository;
import com.org.order.util.CustomerUtil;

@Service
public class OrderService {
	@Autowired
	private OrderItemClient orderItemClient;
	@Autowired
	private CustomerRepository cuatomerRepository;
	@Autowired
	private OrderRepository orderRepository;

	public void createOrder(Order orderItem) {
		orderRepository.save(orderItem);

	}

	public Customer getCustomer(Long customerid) {
		// TODO Auto-generated method stub

		return cuatomerRepository.findById(customerid).get();
	}

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return cuatomerRepository.findAll();
	}

	public CustomerDetail getCustomerOrderDetail(String customerid) {
		// TODO Auto-generated method stub
		Customer customer = getCustomer(Long.parseLong(customerid));

		CustomerUtil customerUtil = new CustomerUtil();

		return customerUtil.getCustomerDetail(customer, orderItemClient);

	}

	public List<Order> getAllOrder() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

}

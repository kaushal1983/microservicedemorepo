package com.org.order.util;

import java.util.ArrayList;
import java.util.List;

import com.org.order.client.OrderItemClient;
import com.org.order.model.Customer;
import com.org.order.model.CustomerDetail;
import com.org.order.model.Order;
import com.org.order.model.OrderItem;

public class CustomerUtil {

	public CustomerDetail getCustomerDetail(Customer customer, OrderItemClient orderItemClient) {
		CustomerDetail customerDetail=new CustomerDetail();
		List<OrderItem> listitem=new ArrayList<OrderItem>();
		List<Order> list=customer.getOrderItems();
		
		for (Order order : list) {
			
			listitem.add(orderItemClient.getOrderItem("123"));
		}
		customerDetail.setCustomeName(customer.getCustomeName());
		customerDetail.setShippingAddress(customer.getShippingAddress());
		customerDetail.setOrderdate(customer.getOrderdate());
		customerDetail.setOrdetItem(listitem);
		return customerDetail;
		
	}

}

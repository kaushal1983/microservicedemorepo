package com.org.order.model;

import java.util.List;



public class CustomerDetail {
	private String customeName;

	
	private String orderdate;

	private String shippingAddress;
	
	private List<OrderItem> ordetItem;

	public String getCustomeName() {
		return customeName;
	}

	public void setCustomeName(String customeName) {
		this.customeName = customeName;
	}

	public String getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public List<OrderItem> getOrdetItem() {
		return ordetItem;
	}

	public void setOrdetItem(List<OrderItem> ordetItem) {
		this.ordetItem = ordetItem;
	}
	
	
}

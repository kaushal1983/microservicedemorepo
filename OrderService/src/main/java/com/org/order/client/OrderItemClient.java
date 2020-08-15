package com.org.order.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.org.order.model.OrderItem;

@FeignClient(name = "Order", url = "http://localhost:8080")
public interface OrderItemClient {
	@RequestMapping(method = RequestMethod.GET, value = "/api/product/{productcodes}")
	OrderItem getOrderItem(@PathVariable(name= "productcodes") String productcodes);
	
}

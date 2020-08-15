package com.org.order.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.org.order.model.Customer;
import com.org.order.model.Order;


public interface  OrderRepository extends JpaRepository<Order,Long>{

	//Customer findAllByOrderItem(String customerid);

}

package com.org.order.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.org.order.model.Customer;


public interface  CustomerRepository extends JpaRepository<Customer,Long>{

	//Customer findAllByOrderItem(String customerid);

}

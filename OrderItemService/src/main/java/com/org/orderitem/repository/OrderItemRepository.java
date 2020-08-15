package com.org.orderitem.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.org.orderitem.model.OrderItem;
public interface  OrderItemRepository extends JpaRepository<OrderItem,Long>{

	OrderItem findAllByProductCode(String productcode);

}

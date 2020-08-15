package com.org.order.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "customer")
public class Customer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3301188615251615613L;


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;

	
	private String customeName;

	
	private String orderdate;

	private String shippingAddress;
	
	 @OneToMany(mappedBy = "customer", cascade = {
		        CascadeType.ALL
		    })
	 @JsonIgnore
	private List<Order> orderItems;

	private int totalItems;

	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	

	public Long getId() {
		return id;
	}





	public void setId(Long id) {
		this.id = id;
	}





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

	public List<Order> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<Order> orderItems) {
		this.orderItems = orderItems;
	}

	public int getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}

}

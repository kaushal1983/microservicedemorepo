package com.org.order.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT_ORDER")
public class Order implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long Id;
	String prodcutCode;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "customer_id")
   	private Customer customer;

	

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	public Long getId() {
		return Id;
	}




	public void setId(Long id) {
		Id = id;
	}




	public String getProdcutCode() {
		return prodcutCode;
	}

	public void setProdcutCode(String prodcutCode) {
		this.prodcutCode = prodcutCode;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}

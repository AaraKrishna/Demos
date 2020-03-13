package com.example.createOrder.models;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class CustomerOrder {
	
	 // @Id
	 // @GeneratedValue(strategy = GenerationType.AUTO)
	  //private Long id;
	
	  @Id
	  private Long orderId;
	  
	  private String customerId;
	  private BigDecimal orderTotal;
	  
	  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy")
	  private Date orderDate;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public BigDecimal getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(BigDecimal orderTotal) {
		this.orderTotal = orderTotal;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

   
	  
	  

}

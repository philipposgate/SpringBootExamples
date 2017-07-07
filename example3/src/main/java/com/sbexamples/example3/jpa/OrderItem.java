package com.sbexamples.example3.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="ORDER_ITEM")
public class OrderItem {

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Integer id;

	@OneToOne
	@JoinColumn(name = "ORDER_ID")
	private PurchaseOrder purchaseOrder;
	
	private String productName;
	private Integer quantity;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public PurchaseOrder getPurchaseOrder() {
		return purchaseOrder;
	}
	public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}

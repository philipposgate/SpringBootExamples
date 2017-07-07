package com.sbexamples.example3.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "SHIPMENT")
public class Shipment {

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Integer id;

	@OneToOne
	@JoinColumn(name = "ORDER_ID")
	private PurchaseOrder purchaseOrder;
	
	@OneToOne
	@JoinColumn(name = "SHIPPINGADDRESS_ID")
	private Address shippingAddress;
	
}

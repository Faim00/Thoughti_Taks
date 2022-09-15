package com.rest.RESTapithoughti.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@JsonFormat(shape = JsonFormat.Shape.ARRAY)
@Entity
public class Orders {

	@Id
	@GeneratedValue
	private int orderId;
	private String orderDate;
	private String orderStatus;
	
	@OneToMany(targetEntity =Items.class,cascade = CascadeType.ALL )
	@JoinColumn(name="cp_fk", referencedColumnName = "orderId")
	private List<Items> items;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orders(int orderId, String orderDate, String orderStatus, List<Items> items) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.items = items;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderDate=" + orderDate + ", orderStatus=" + orderStatus + ", items="
				+ items + "]";
	}
	
	
	
	
	
}

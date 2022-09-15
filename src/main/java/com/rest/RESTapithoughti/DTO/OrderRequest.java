package com.rest.RESTapithoughti.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.rest.RESTapithoughti.entity.Orders;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonFormat(shape = JsonFormat.Shape.ARRAY)
public class OrderRequest {

	private Orders orders;

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public OrderRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderRequest(Orders orders) {
		super();
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "OrderRequest [orders=" + orders + "]";
	}

	
	
}

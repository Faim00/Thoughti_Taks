package com.rest.RESTapithoughti.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.rest.RESTapithoughti.DTO.OrderRequest;
import com.rest.RESTapithoughti.Repository.IOrders;
import com.rest.RESTapithoughti.Repository.ItemsInter;
import com.rest.RESTapithoughti.entity.Orders;

@RestController
@JsonFormat(shape = JsonFormat.Shape.ARRAY)
public class OrderController {
	
	@Autowired
	private IOrders orderRepo;
	
	@Autowired
	private ItemsInter itemsRepo;
	
	@PostMapping("/PlaceOrder")
	public Orders PlaceOrder(@RequestBody OrderRequest request)
	{
		return orderRepo.save(request.getOrders());
	}
	
	@GetMapping("/GetAllOrders")
	public List<Orders> findALlOrders(){
		
		return orderRepo.findAll();
	}
	
	@GetMapping("/GetOrders/{id}")
	public Optional<Orders> findById(@PathVariable(name = "id")int OrderId){
		
		return orderRepo.findById(OrderId);
	}
	
	

}

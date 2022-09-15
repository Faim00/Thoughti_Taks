package com.rest.RESTapithoughti.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.RESTapithoughti.entity.Orders;

public interface IOrders extends JpaRepository<Orders,Integer>{

}

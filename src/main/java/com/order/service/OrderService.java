package com.order.service;

import org.springframework.stereotype.Service;

import com.order.entity.OrderVO;
@Service
public class OrderService implements IOrderService {

	@Override
	public Integer save(OrderVO order) {
		if(order.getItem() ==null) {
			throw new IllegalArgumentException("Item name is required");
		}
		return 1;
	}

}

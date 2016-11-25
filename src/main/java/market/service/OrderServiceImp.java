package market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import market.model.Order;
import market.repository.OrderRepository;
@Service
public class OrderServiceImp implements OrderService{
	@Autowired
	OrderRepository orderrepository;
	@Override
	public Order create(Order order) {
		// TODO Auto-generated method stub
		return orderrepository.save(order);
	}

}

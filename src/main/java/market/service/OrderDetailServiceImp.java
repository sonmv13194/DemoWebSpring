package market.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import market.model.OrderDetail;
import market.repository.OrderDetailRepository;

@Service
public class OrderDetailServiceImp implements OrderdetailService {
	@Autowired
	OrderDetailRepository detailrepo;
	@Override
	@Transactional
	public OrderDetail create(OrderDetail orderdetail) {
		// TODO Auto-generated method stub
		return detailrepo.save(orderdetail);
	}
	@Override
	public List<OrderDetail> getAll() {
		// TODO Auto-generated method stub
		return detailrepo.findAll(new Sort(Direction.DESC, "idorderdetail"));
	}
	@Override
	public OrderDetail findId(int idorderdetail) {
		// TODO Auto-generated method stub
		return detailrepo.findOne(idorderdetail);
	}
	@Override
	public void delete(int idorderdetail) {
		// TODO Auto-generated method stub
		detailrepo.deleteByIdorderdetail(idorderdetail);
	}
	@Override
	public OrderDetail update(OrderDetail orderdetail) {
		// TODO Auto-generated method stub
		return detailrepo.save(orderdetail);
	}
	@Override
	public void update(String status) {
		// TODO Auto-generated method stub
		
	}


}

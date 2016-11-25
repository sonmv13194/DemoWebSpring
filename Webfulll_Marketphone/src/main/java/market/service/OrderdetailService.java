package market.service;

import java.util.List;

import market.model.OrderDetail;

public interface OrderdetailService {
OrderDetail create(OrderDetail orderdetail);
List<OrderDetail> getAll();
OrderDetail findId(int idorderdetail);
public void delete(int idorderdetail);
public OrderDetail update(OrderDetail orderdetail);
public void update(String status);
}

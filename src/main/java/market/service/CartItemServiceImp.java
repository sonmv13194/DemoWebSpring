package market.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import market.model.CartItem;
import market.repository.CartItemRepository;
@Service
public class CartItemServiceImp implements CartItemService {
	@Autowired
	CartItemRepository cartitemrepo;
	
	public CartItem add(CartItem cartItem) {
		// TODO Auto-generated method stub
		return cartitemrepo.save(cartItem);
	}
	
	public List<CartItem> getAll() {
		// TODO Auto-generated method stub
		return cartitemrepo.findAll();
	}
	
	public CartItem findId(int idcartitem) {
		// TODO Auto-generated method stub
		return cartitemrepo.findOne(idcartitem);
	}
	
	public void delete(CartItem cartitem) {
		// TODO Auto-generated method stub
		cartitemrepo.delete(cartitem);;
	}
	
	public void deleteByIdproduct(int idproduct) {
		// TODO Auto-generated method stub
		cartitemrepo.deleteByIdproduct(idproduct);
	}
	
	public void updateQuantity(int id) {
		cartitemrepo.updateQuantity(id);
	}


}

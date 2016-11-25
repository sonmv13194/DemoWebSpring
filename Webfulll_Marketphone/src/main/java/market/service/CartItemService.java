package market.service;

import java.util.List;


import market.model.CartItem;

public interface CartItemService {
public CartItem add(CartItem cartItem);
public List<CartItem> getAll();
public CartItem findId(int idproduct);
public void delete(CartItem cartitem);
public void  deleteByIdproduct(int idproduct);
public void updateQuantity( int id);
}

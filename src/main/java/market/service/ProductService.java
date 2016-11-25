package market.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import market.model.Product;

public interface ProductService  {
List<Product> getAll();
public Product findId(int idproduct);
public List<Product> findByName(String name);
public List<Product> findByNameLike(String name);
public Product addToCart(Product product);
public Product addnew(Product product);
public Product update(Product product);
public void delete(int idproduct);
Page<Product> findAll(Pageable page);
List<Product> getAllASC();
List<Product> getAllDESC();
List<Product> getAllNewest();
List<Product> getAllProduct();
public void updateView(int idproduct);
}

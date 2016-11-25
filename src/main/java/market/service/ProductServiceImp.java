package market.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import market.model.Product;
import market.repository.ProductRepository;

@Service
public class ProductServiceImp implements ProductService {
	@Autowired
	ProductRepository productrepo;
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return productrepo.findAll(new PageRequest(0, 12,Direction.ASC,"price")).getContent();
	}
	
	public Product findId(int idproduct) {
		// TODO Auto-generated method stub
		return productrepo.findOne(idproduct);
	}
	
	public List<Product> findByName(String name) {
		// TODO Auto-generated method stub
		return productrepo.findByName(name);
	}
	
	public List<Product> findByNameLike(String name) {
		// TODO Auto-generated method stub
		return productrepo.findByNameLike("%"+name+"%");
	}
	@Transactional
	public Product addToCart(Product product) {
		// TODO Auto-generated method stub
		return productrepo.save(product);
	}
	@Transactional
	public Product addnew(Product product) {
		// TODO Auto-generated method stub
		return productrepo.save(product);
	}
	
	public void delete(int idproduct) {
		// TODO Auto-generated method stub
			productrepo.deleteByIdproduct(idproduct);
		
	}
	
	public List<Product> getAllASC() {
		// TODO Auto-generated method stub
		return productrepo.findAll(new Sort(Direction.ASC, "price"));
	}
	
	public List<Product> getAllDESC() {
		// TODO Auto-generated method stub
		return productrepo.findAll(new Sort(Direction.DESC,"price"));
	}
	
	public List<Product> getAllNewest() {
		// TODO Auto-generated method stub
		return productrepo.findAll(new PageRequest(0, 4,Direction.DESC,"idproduct")).getContent();
	}
	

	@Override
	public Product update(Product product) {
		if(product.getIdproduct()==null){
			return null;
		}
		productrepo.save(product);
		return product;
	}

	@Override
	public Page<Product> findAll(Pageable page) {
		// TODO Auto-generated method stub
		return productrepo.findAll(page);
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productrepo.findAll();
	}

	@Override
	public void updateView(int idproduct) {
		// TODO Auto-generated method stub
		productrepo.updateView(idproduct);
	}
}

package market.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import market.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
public List<Product> findByName(String name);
public List<Product> findByNameLike(String name);
@Modifying
@Transactional
@Query("delete from Product c where c.idproduct = :idproduct")
public void deleteByIdproduct(@Param("idproduct") int idproduct);
public Page<Product> findAll(Pageable pageabel);
@Modifying
@Transactional
@Query("update Product c set c.view = c.view + 1 where c.idproduct = :idproduct")
public void updateView(@Param("idproduct") int idproduct);


}

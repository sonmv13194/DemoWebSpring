package market.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import market.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Integer> {
	public CartItem findByProduct(int idproduct);

	@Modifying
	@Transactional
	@Query("delete from CartItem c where c.product.idproduct = :id")
	public void deleteByIdproduct(@Param("id") int id);

	@Modifying
	@Transactional
	@Query("update CartItem c set c.quantity = c.quantity + 1 where c.product.idproduct = :id")
	public void updateQuantity(@Param("id") int id);
}
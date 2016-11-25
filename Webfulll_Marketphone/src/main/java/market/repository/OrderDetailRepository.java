package market.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import market.model.OrderDetail;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer> {
	@Modifying
	@Transactional
	@Query("delete from OrderDetail c where c.idorderdetail = :idorderdetail")
	public void deleteByIdorderdetail(@Param("idorderdetail") int idorderdetail);
	@Modifying
	@Transactional
	@Query("update from OrderDetail d set d.status = :status where d.idorderdetail = :idorderdetail")
	public void updateStatus(@Param("idorderdetail") int idorderdetail);
	
}

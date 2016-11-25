package market.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import market.model.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}

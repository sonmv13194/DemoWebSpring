package market.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import market.model.AddressShipping;

public interface AddressRepository extends JpaRepository<AddressShipping, Integer> {

}

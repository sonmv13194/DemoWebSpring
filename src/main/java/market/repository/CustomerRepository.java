package market.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import market.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	public Customer findByName(String name);
	public Customer findByNameAndEmail(String name,String email);
}

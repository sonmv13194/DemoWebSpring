package market.service;

import java.util.List;

import market.model.Customer;

public interface CustomerService {
Customer create(Customer customer);
List<Customer> getAll();
public void delete(int idcustomer);
public Customer findId(int idcustomer);
Customer findByName(String name);
Customer update(Customer customer);
Customer findByNameAndEmail(String name,String email);
}

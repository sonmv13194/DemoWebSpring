package market.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import market.model.Customer;
import market.repository.CustomerRepository;
@Service
public class CustomerServiceImp implements CustomerService {
	@Autowired
	CustomerRepository customerrepo;
	@Transactional
	public Customer create(Customer customer) {
		// TODO Auto-generated method stub
		return customerrepo.save(customer);
	}
	
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return customerrepo.findAll();
	}
	
	public void delete(int idcustomer) {
		// TODO Auto-generated method stub
		customerrepo.delete(idcustomer);;
	}
	
	public Customer findId(int idcustomer) {
		// TODO Auto-generated method stub
		return customerrepo.findOne(idcustomer);
	}

	@Override
	public Customer findByName(String name) {
		// TODO Auto-generated method stub
		return customerrepo.findByName(name);
	}

	@Override
	public Customer update(Customer customer) {
		// TODO Auto-generated method stub
		return customerrepo.save(customer);
	}

	@Override
	public Customer findByNameAndEmail(String name, String email) {
		// TODO Auto-generated method stub
		return customerrepo.findByNameAndEmail(name, email);
	}


}

package market.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import market.model.Supplier;
import market.repository.SupplierRepository;
@Service
public class SupplierServiceImp implements SupplierService {
	@Autowired
	SupplierRepository supplierrepository;
	
	public List<Supplier> getAll() {
		// TODO Auto-generated method stub
		return supplierrepository.findAll();
	}
	
	public Supplier findId(int idsupplier) {
		// TODO Auto-generated method stub
		return supplierrepository.findOne(idsupplier);
	}

	@Override
	public Supplier creat(Supplier supplier) {
		// TODO Auto-generated method stub
		return supplierrepository.save(supplier);
	}

	@Override
	public Supplier update(Supplier supplier) {
		// TODO Auto-generated method stub
		return supplierrepository.save(supplier);
	}

	@Override
	public void delete(int idsupply) {
		// TODO Auto-generated method stub
		supplierrepository.delete(idsupply);
	}

}

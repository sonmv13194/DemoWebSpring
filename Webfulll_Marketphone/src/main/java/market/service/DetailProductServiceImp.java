package market.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import market.model.Detailproduct;
import market.repository.DetailProductRepository;

@Service
public class DetailProductServiceImp implements DetailProductService {
	@Autowired
	DetailProductRepository detailrepo;
	@Override
	@Transactional
	public Detailproduct create(Detailproduct detailproduct) {
		// TODO Auto-generated method stub
		return detailrepo.save(detailproduct);
	}

}

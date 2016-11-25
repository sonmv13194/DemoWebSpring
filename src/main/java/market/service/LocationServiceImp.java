package market.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import market.model.Location;
import market.repository.LocationRepostiory;

@Service
public class LocationServiceImp implements LocationService {
	@Autowired
	LocationRepostiory locationrepo;
	
	public List<Location> getAll() {
		// TODO Auto-generated method stub
		return locationrepo.findAll();
	}
	
	public Location findId(int idlocation) {
		// TODO Auto-generated method stub
		return locationrepo.findOne(idlocation);
	}

}

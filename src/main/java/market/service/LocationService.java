package market.service;

import java.util.List;

import market.model.Location;

public interface LocationService {
public List<Location> getAll();
public Location findId(int idlocation);
}

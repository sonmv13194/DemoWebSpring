package market.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import market.model.Event;
import market.repository.EventRepository;

@Service
public class EventServiceImp implements EventService {
	@Autowired
	EventRepository eventrepository;
	
	public List<Event> getAllEvent() {
		// TODO Auto-generated method stub
		return eventrepository.findAll();
	}

}

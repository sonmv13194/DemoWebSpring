package market.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import market.model.Event;

public interface EventRepository extends JpaRepository<Event, Integer> {

}

package market.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import market.model.Location;

public interface LocationRepostiory extends JpaRepository<Location, Integer> {

}

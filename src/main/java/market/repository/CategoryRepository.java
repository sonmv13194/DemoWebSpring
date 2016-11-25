package market.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import market.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
	public List<Category> findByName(String name);
	public List<Category> findByNameLike(String name);
}

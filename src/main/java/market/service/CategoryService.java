package market.service;

import java.util.List;

import market.model.Category;

public interface CategoryService {
public List<Category> getAll();
public Category create(Category category);
public List<Category> findByName(String name);
public Category findId(int idcategory);
public void delete(int idcategory);
public Category update(Category category);
}

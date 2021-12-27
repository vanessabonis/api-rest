package apirest.completo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import apirest.completo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	
}

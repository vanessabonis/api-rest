package apirest.completo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import apirest.completo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
}

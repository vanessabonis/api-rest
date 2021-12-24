package apirest.completo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import apirest.completo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
}

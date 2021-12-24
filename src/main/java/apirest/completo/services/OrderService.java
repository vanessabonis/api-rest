package apirest.completo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apirest.completo.entities.Order;
import apirest.completo.repositories.OrderRepository;
import apirest.completo.services.exceptions.ResourceNotFoundException;

//registrar como componente do spring
@Service
public class OrderService {

	//injeção de dependencia de forma transparente ao programador
	@Autowired 
	private OrderRepository repository;
	
	//retorna tds users
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	//buscar usuario por id
	public Order findById(Long id) {
		
		Optional<Order> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
		
	}
	
}

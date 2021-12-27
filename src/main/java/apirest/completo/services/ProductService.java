package apirest.completo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apirest.completo.entities.Product;
import apirest.completo.repositories.ProductRepository;
import apirest.completo.services.exceptions.ResourceNotFoundException;

//registrar como componente do spring
@Service
public class ProductService {

	//injeção de dependencia de forma transparente ao programador
	@Autowired 
	private ProductRepository repository;
	
	//retorna tds users
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	//buscar usuario por id
	public Product findById(Long id) {
		
		Optional<Product> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
		
	}
	
}

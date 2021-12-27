package apirest.completo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apirest.completo.entities.Category;
import apirest.completo.repositories.CategoryRepository;
import apirest.completo.services.exceptions.ResourceNotFoundException;

//registrar como componente do spring
@Service
public class CategoryService {

	//injeção de dependencia de forma transparente ao programador
	@Autowired 
	private CategoryRepository repository;
	
	//retorna tds users
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	//buscar usuario por id
	public Category findById(Long id) {
		
		Optional<Category> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
		
	}
	
}

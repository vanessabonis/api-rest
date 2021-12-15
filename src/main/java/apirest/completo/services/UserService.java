package apirest.completo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apirest.completo.entities.User;
import apirest.completo.repositories.UserRepository;

//registrar como componente do spring
@Service
public class UserService {

	//injeção de dependencia de forma transparente ao programador
	@Autowired 
	private UserRepository repository;
	
	//retorna tds users
	public List<User> findAll(){
		return repository.findAll();
	}
	
	//buscar usuario por id
	public User findById(Long id) {
		
		Optional<User> obj = repository.findById(id);
		return obj.get();
		
	}
	
}

package apirest.completo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import apirest.completo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
}

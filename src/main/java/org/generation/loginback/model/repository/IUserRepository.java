package org.generation.loginback.model.repository;

import java.util.List;

import org.generation.loginback.model.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<User, Long>{

	List<User> findAllById(long id);
	boolean existsByEmail(String email);
	
}

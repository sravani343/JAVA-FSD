package com.example.SpringSecurityManager.repositories;
import org.springframework.data.repository.CrudRepository;
import com.example.SpringSecurityManager.entities.User;
public interface UserRepository extends CrudRepository<User, Integer> {
public User findByName(String name);
}

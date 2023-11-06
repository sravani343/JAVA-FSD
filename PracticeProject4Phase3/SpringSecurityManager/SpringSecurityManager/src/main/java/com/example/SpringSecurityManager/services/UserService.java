package com.example.SpringSecurityManager.services;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.SpringSecurityManager.entities.User;
import com.example.SpringSecurityManager.repositories.UserRepository;
@Service
public class UserService {
	@Autowired
	 private UserRepository userRepository;
public Iterable<User> GetAllUsers()
    {
        return userRepository.findAll();
    }
 public User GetUserByName(String name) {
        User foundUser = userRepository.findByName(name);
        return foundUser;
    }
    
    public User GetUserById(int id) throws Exception {
    	Optional<User> foundUser = userRepository.findById(id);
   if(!foundUser.isPresent())
    		return null;
    return(foundUser.get());
    }
    public void UpdateUser(User usertoUpdate) {
    	userRepository.save(usertoUpdate);
    }
     public void setUser(User u, String name, String email, String password) {
    	//u.setId(id);
    	u.setName(name);
    	u.setEmail(email);
    	u.setPassword(password);
    	UpdateUser(u);
    }

}
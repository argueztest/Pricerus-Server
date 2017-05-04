package com.pricerus.api.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pricerus.api.users.Users;


@RestController
public class UsersController {

	@Autowired
	private UsersService usersService;

@RequestMapping("/users")
public List<Users> getAllUsers(){
	
	return usersService.getAllUsers();

}

	@RequestMapping("/users/{id}")
	public Users getUser(@PathVariable Integer id) {
		return usersService.getUser(id);
	}

@RequestMapping(method=RequestMethod.POST, value="/users")
public void addUser(@RequestBody Users user){
	usersService.addUser(user);
}

@RequestMapping(method=RequestMethod.PUT, value="/users/{id}")
public void updateTopic(@RequestBody Users user,@PathVariable Integer id){
	user.setId(id);
	usersService.updateUser(id,user);
}
@RequestMapping(method=RequestMethod.DELETE, value="/users/{id}")
public void deleteTopic(@PathVariable Integer id){
	usersService.deleteUser(id);
}

}

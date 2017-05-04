package com.pricerus.api.users;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





@Service
public class UsersService {

	@Autowired
	private UsersRepository usersRepository;

	public void addUser(Users user) {
		usersRepository.save(user);
		
	}

	public void updateUser(Integer id, Users user) {
		//Users oldUser = usersRepository.findOne(id);
		
		usersRepository.save(user);
		
	}

	public void deleteUser(Integer id) {
		usersRepository.delete(id);
		
	}

	public List<Users> getAllUsers() {
		List<Users> topics = new ArrayList<>();
		usersRepository.findAll().forEach(topics::add);
		 return topics;
	}

	public Users getUser(Integer id) {
		return usersRepository.findOne(id);
	}



}

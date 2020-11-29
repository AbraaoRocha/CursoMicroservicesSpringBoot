package com.in28minutes.rest.webservice.restfullwebservice.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDAOService {

	private Integer userCount = 3;

	private static List<User> users = new ArrayList<>();

	static {
		users.add(new User(1, "Abraão", new Date()));
		users.add(new User(2, "Priscila", new Date()));
		users.add(new User(3, "João", new Date()));
	}

	public List<User> findAll() {
		return users;
	}

	public User saveUser(User user) {

		if (user.getId() == null) {

			user.setId(++userCount);

		}

		users.add(user);

		return user;
	}

	public User findOne(int id) {
		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}

}

package service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import pojo.User;

@Service
public class UserServiceImpl implements UserService{
	
	private static ArrayList<User> users = new ArrayList<>();
	
	@Override
	public boolean addUser(User user) {
		if (!"IT民工".equals(user.getCarrer())) {//不允许添加IT民工
			users.add(user);
			return true;
		}
		return false;
	}

	@Override
	public ArrayList<User> getUsers() {
		return users;
	}

}

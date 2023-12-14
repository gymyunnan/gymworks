package service;

import java.util.ArrayList;

import pojo.User;

public interface UserService {
	boolean addUser(User user);
	ArrayList<User> getUsers();
}
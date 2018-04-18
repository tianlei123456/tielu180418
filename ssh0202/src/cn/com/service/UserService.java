package cn.com.service;

import java.util.List;

import cn.com.pojo.User;

public interface UserService {
//Ìí¼Ó
	public void addUser(User user);
	public List<User> findUser();
	public User loginUser(User user);
}

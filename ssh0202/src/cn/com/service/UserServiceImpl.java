package cn.com.service;

import java.util.List;

import cn.com.dao.UserDao;
import cn.com.pojo.User;
import cn.com.utils.MD5;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void addUser(User user) {
		//md5���ܴ洢�����ݿ�
		String md5str = MD5.encrypty(user.getPassword());
		user.setPassword(md5str);
		this.userDao.save(user);//��������������ݷ��ʲ�
	}

	@Override
	public List<User> findUser() {
		return this.userDao.findall();
	}

	@Override
	public User loginUser(User user) {
		System.out.println(user);
		String md5str = MD5.encrypty(user.getPassword());
		System.out.println(md5str);
		user.setPassword(md5str);
		return this.userDao.findbyuser(user);
	}

}

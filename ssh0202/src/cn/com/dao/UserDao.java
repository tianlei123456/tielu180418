package cn.com.dao;

import java.io.Serializable;
import java.util.List;

import cn.com.pojo.User;

public interface UserDao {
public void save(User user);//增加方法
public void update(User user);//修改方法
public void dalete(Serializable id);//删除方法
public User findbyid(Serializable id);//根据id查询单条
public List<User> findall();//查询所有列表记录
public User findbyuser(User user);//
}

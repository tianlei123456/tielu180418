package cn.com.dao;

import java.io.Serializable;
import java.util.List;

import cn.com.pojo.User;

public interface UserDao {
public void save(User user);//���ӷ���
public void update(User user);//�޸ķ���
public void dalete(Serializable id);//ɾ������
public User findbyid(Serializable id);//����id��ѯ����
public List<User> findall();//��ѯ�����б��¼
public User findbyuser(User user);//
}

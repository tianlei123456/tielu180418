package cn.com.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.com.pojo.User;

//�ײ�ʹ��sessionFactory,�Զ�ע��HibernateTemplate
public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	@Override
	public void save(User user) {
		this.getHibernateTemplate().save(user);
	}

	@Override
	public void update(User user) {
		this.getHibernateTemplate().update(user);
	}

	@Override
	public void dalete(Serializable id) {
		this.getHibernateTemplate().delete(findbyid(id));
	}

	@Override
	public User findbyid(Serializable id) {
		return this.getHibernateTemplate().get(User.class, id);
	}

	@Override
	public List<User> findall() {
		return (List<User>) this.getHibernateTemplate().find("from User", null);
	}

	@Override
	public User findbyuser(User user) {
		// TODO Auto-generated method stub
		List<User> ls = (List<User>)this.getHibernateTemplate().find("from User where username=? and password=?", user.getUsername(),user.getPassword());
		return ls.size()>0?ls.get(0):null;
		
	}

}

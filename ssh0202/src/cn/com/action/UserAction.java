package cn.com.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.com.pojo.User;
import cn.com.service.UserService;

public class UserAction extends ActionSupport{
private User user;//��װ������
private UserService userService;//ע���service�����
private List<User> userList;
private String code;///��װ�û��������֤��
private String isLogin;


public String getIsLogin() {
	return isLogin;
}

public void setIsLogin(String isLogin) {
	this.isLogin = isLogin;
}

public String getCode() {
	return code;
}

public void setCode(String code) {
	this.code = code;
}

public List<User> getUserList() {
	return userList;
}

public void setUserList(List<User> userList) {
	this.userList = userList;
}

public void setUserService(UserService userService) {
	this.userService = userService;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}
public String loginUser(){
	String cd =(String)ActionContext.getContext().getSession().get(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
	if(cd.equals(code)){
		User u = userService.loginUser(user);
		System.out.println(u);
		//�ŵ��Ự��
		this.isLogin="ok";
		return SUCCESS; 
	}else{
		this.isLogin="error";
		return SUCCESS;
	}
}
//��ӷ���
public String saveUser(){
	this.userService.addUser(user);
	this.userList = this.userService.findUser();
	return SUCCESS;
}
}

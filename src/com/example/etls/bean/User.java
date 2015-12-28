package com.example.etls.bean;

public class User {
/*{"id":1001,
		 "name":"уе╥и",
		 "avatar":"avatar/zhangfei.jpg",
		 "password":"1234",
		 "phone":"68357788",
		 "email":"zhangfei@qq.com"
		 }*/
	private int id;
	private String avatar;
	private String password;
	private String phone;
	private String email;
	
 public User(){
	 
 }
 public User(int id,String avatar,String password,String phone,String email){
	 this.id = id;
	 this.avatar = avatar;
	 this.password = password;
	 this.phone = phone;
	 this.email = email;
 }
public void setId(int id) {
	this.id = id;
}
public void setAvatar(String avatar) {
	this.avatar = avatar;
}
public void setPassword(String password) {
	this.password = password;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "user [id=" + id + ", avatar=" + avatar + ", password=" + password
			+ ", phone=" + phone + ", email=" + email + "]";
}
 
}
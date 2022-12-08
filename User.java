package com.loginform.springboot.model;

public class User {
private String Username;
private String Password;
private String Login;

public User()
{
}


public User(String username, String password, String login) {
	super();
	Username = username;
	Password = password;
	Login = login;
}


public String getUsername() {
	return Username;
}
public void setUsername(String username) {
	this.Username = username;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	this.Password = password;
}
public String getLogin() {
	return Login;
} 
public void setLogin(String login) {
	this.Login = login;
}


}

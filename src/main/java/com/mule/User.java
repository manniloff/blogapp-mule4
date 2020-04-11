package com.mule;

public class User {
	
	public User(String login, String password, boolean active, Roles roles) {
        this.login = login;
        this.password = password;
        this.active = active;
        this.roles = roles;
    }
	
	public User(String login, String password, boolean active) {
        this.login = login;
        this.password = password;
        this.active = active;
    }

    private String login;

    private String password;

    private boolean active;

    private Roles roles;
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }
    
    public String getDetails() {
    	return getLogin() + " " + getPassword() + " " + getRoles();
    }
}

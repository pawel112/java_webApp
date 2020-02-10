package pl.pawel112.webapp;

public class User {

    private String login;
    private String email;
    private String password;
    private boolean account_blocked;
    private int group;
    
    public User()
    {
    	this.login = "";
    	this.email = "";
    	this.password = "";
    	this.group = 0;
    	this.account_blocked = true;
    }
    
    public User (String login, String email, String password, int group)
    {
    	this.login = login;
    	this.email = email;
    	this.password = password;
    	this.group = group;
    	this.account_blocked = false;
    }
    
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isAccount_blocked() {
		return account_blocked;
	}
	public void setAccount_blocked(boolean account_blocked) {
		this.account_blocked = account_blocked;
	}
	public int getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = group;
	}
}

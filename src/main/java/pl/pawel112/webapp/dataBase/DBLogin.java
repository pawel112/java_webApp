package pl.pawel112.webapp.dataBase;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.NotEmpty;

public class DBLogin {
	@NotEmpty @NotNull
	private String login;
	
	@NotEmpty @NotNull
	@Pattern(regexp="[a-z0-9.-]{1,}[@]{1}[a-z0-9-]{1,}[.]{1}[a-z0-9]{1,}")
	private String email;
	
	@NotEmpty @NotNull
	private String password;
	
	private boolean account_active;
	
	private int group;

	DBLogin()
	{
		this.login = "";
		this.email = "";
		this.password = "";
		this.account_active = false;
		this.group = 0;
	}
	
	DBLogin(String login, String email, String password, int account_active)
	{
		this.login = login;
		this.email = email;
		this.password = password;
		this.account_active = true;
		this.group = 0;
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

	public boolean isAccount_active() {
		return account_active;
	}

	public void setAccount_active(boolean account_active) {
		this.account_active = account_active;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}
}

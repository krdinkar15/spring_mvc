package mvc1.controller.entity;

public class User {
	// email userName Password should match with form data
	private String email;
	private String username;
	private String userpassword;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", username=" + username + ", userpassword=" + userpassword + "]";
	}
	
	
}

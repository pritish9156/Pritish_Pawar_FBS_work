package model;

public class Users {
	
	String username;
	String email;
	String password;
	String SecurityQuestion;
	String answer;
	Boolean isActive;
	
	public Users() {
		
	}
	
	
	public Users(String username, String email, String password, String securityQuestion, String answer,
			Boolean isActive) {
		
		this.username = username;
		this.email = email;
		this.password = password;
		SecurityQuestion = securityQuestion;
		this.answer = answer;
		this.isActive = isActive;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getSecurityQuestion() {
		return SecurityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		SecurityQuestion = securityQuestion;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	

	public Boolean getIsActive() {
		return isActive;
	}


	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}


	@Override
	public String toString() {
		return "users [username=" + username + ", email=" + email + ", password=" + password + ", SecurityQuestion="
				+ SecurityQuestion + ", answer=" + answer + "]";
	}
	
}

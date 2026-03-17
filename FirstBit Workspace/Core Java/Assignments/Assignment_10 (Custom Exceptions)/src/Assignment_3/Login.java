package Assignment_3;

import InvalidLoginExceptions.InvalidPasswordException;
import InvalidLoginExceptions.InvalidUsernameException;

public class Login {

	String username;
	String password;
	
	public Login() {
		this.username = "admin";
		this.password = "12345";
	}
	
	boolean validateUsername(String enteredUsername) throws InvalidUsernameException{
		if(!username.equals(enteredUsername)) {
			throw new InvalidUsernameException();
		}
		
		return true;
	}
	
	boolean validatePassword(String enteredPassword) throws InvalidPasswordException{
		if(!password.equals(enteredPassword)) {
			throw new InvalidPasswordException();
		}
		
		return true;
	}
}

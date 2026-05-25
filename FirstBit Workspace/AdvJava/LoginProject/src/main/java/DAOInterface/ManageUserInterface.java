package DAOInterface;

import model.Users;

public interface ManageUserInterface {
	
	boolean loginUser(String username, String password);
	boolean registerUser(Users user);
	
}

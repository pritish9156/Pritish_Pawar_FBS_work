package Assignment_3;

import java.util.Scanner;

import InvalidLoginExceptions.*;

public class LoginApplication {

	public static void main(String[] args) {
		
		Login login = new Login();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Username: ");
		String username = sc.nextLine();
		
		try {
			if(login.validateUsername(username)) {
				int attempt = 3;
				
				do {
					System.out.println("\nEnter Password: ");
					String password = sc.nextLine();
					
					try {
						if(login.validatePassword(password)) {
							System.out.println("\nLogin Successful!");
							break;
						}
					}catch(InvalidPasswordException e) {
						System.err.println(e.getMessage());
					}
					
					attempt--;
					
					System.out.println("\nRemaining Attempts: " + attempt);
						
				}while(attempt > 0);
				
				if(attempt == 0) System.out.println("\nAccount Locked !");
			}
			
		}catch(InvalidUsernameException e) {
			System.err.println(e.getMessage());
		}
	
		sc.close();
	}

}

package Assignment_1;

import java.util.Scanner;

import InvalidateFormExceptions.*;

public class AdmissionFormApplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter Your Name: ");
			String name = sc.nextLine();
			
			System.out.println("Enter Your Age: ");
			int age = sc.nextInt();
			
			System.out.println("Enter Your Percentage: ");
			double percentage = sc.nextDouble();
			
			sc.nextLine();
			System.out.println("Select Your Cource: ");
			System.out.println("1.BBA\n2.BCA\n3.BBA");
			System.out.println("Enter Your Cource Name: ");
			String courseName = sc.nextLine();
			
			System.out.println("Enter amount to pay: ");
			double feesPaid = sc.nextDouble();
			
			AdmissionForm af = new AdmissionForm(name, age, percentage, courseName, feesPaid);
		
			if(af.validateForm()) {
				System.out.println("\nAdmission Successful !");
				System.out.println("\nStudents Details: \n");
			}
			
		} catch (EmptyNameException e) {
			System.err.printf("Please Provide Valid details: " + e.getMessage());	
			
		} catch (FeesNotPaidException e) {
			System.err.printf("Please Provide Valid details: " + e.getMessage());
			
		} catch (InsufficientFeesException e) {
			System.err.printf("Please Provide Valid details: " + e.getMessage());
			
		} catch (InvalidPercentageException e) {
			System.err.printf("Please Provide Valid details: " + e.getMessage());
			
		} catch (NotFitForAdmissionException e) {
			System.err.printf("Please Provide Valid details: " + e.getMessage());
			
		} catch (UnderageException e) {
			System.err.printf("Please Provide Valid details: " + e.getMessage());
			
		}
		
		AdmissionForm.display();
		

	}

}

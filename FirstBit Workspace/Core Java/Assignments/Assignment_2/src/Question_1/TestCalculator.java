package Question_1;

import java.util.Scanner;

class Calculator{
	
	//Addition
		int addition(int num1, int num2) {
			return num1+num2;
		}
		
		double addition(double num1, double num2) {
			return num1+num2;
		}
		
		double addition(int num1, double num2) {
			return num1+num2;
		}
		
		double addition(double num1, int num2) {
			return num1+num2;
		}
	
	
	//Subtraction
		int subtraction(int num1, int num2) {
			return num1-num2;
		}
		
		double subtraction(double num1, double num2) {
			return num1-num2;
		}
		
		double subtraction(int num1, double num2) {
			return num1-num2;
		}
		
		double subtraction(double num1, int num2) {
			return num1-num2;
		}
		
		
		//Multiplication
			int multiplication(int num1, int num2) {
				return num1*num2;
			}
			
			double multiplication(double num1, double num2) {
				return num1*num2;
			}
			
			double multiplication(int num1, double num2) {
				return num1*num2;
			}
			
			double multiplication(double num1, int num2) {
				return num1*num2;
			}
		
		
		//Division
			int division(int num1, int num2) {
				return num1/num2;
			}
			
			double division(double num1, double num2) {
				return num1/num2;
			}
			
			double division(int num1, double num2) {
				return num1/num2;
			}
			
			double division(double num1, int num2) {
				return num1/num2;
			}
	
}

public class TestCalculator {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
		System.out.println("Enter Your Choice: ");
		int choice = sc.nextInt();
		
		switch(choice) {
		
				case 1:
					System.out.println("\n" + c.addition(1.5, 2)); 
					break;
					
				case 2:
					System.out.println("\n" + c.subtraction(5.5, 5));
					break;
					
				case 3:
					System.out.println("\n" + c.multiplication(1.5, 5));
					break;
					
				case 4:
					System.out.println("\n" + c.division(1.0, 2.5)); 
					break;
					
				default:
					System.out.println("\n Wrong Choice");
		} 
		
		sc.close();

	}

}

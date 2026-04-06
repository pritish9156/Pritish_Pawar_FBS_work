import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		int n, factorial;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		n = sc.nextInt();
		
//		for(int i=1; i<=n; i++) {
//			factorial = factorial*i;
//		}
//		
		System.out.println();
		
		//using recursion
		
		factorial = factorialOfNumber(n);
		
		System.out.println("Factorial of " + n + " is: " + factorial);
		
		sc.close();
	}
	
	public static int factorialOfNumber(int num) {
		
		if(num<=1)
			return 1;
		
		return num*factorialOfNumber(num-1);
	}

}



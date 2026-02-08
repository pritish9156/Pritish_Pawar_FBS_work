//Write a C program to swap two numbers using a temporary third variable.

class Q4{
	public static void main(String[] args){
		
		//initialization
		int num1 = 10;
		int num2 = 50;
		
		//declaration of temp variable
		int temp;
		
		//displaying result before swapping on the output screen
		System.out.println();System.out.println("Before Swapping :");
		System.out.println("number 1 = " + num1);
		System.out.println("number 2 = " + num2);
		
		//performing swapping operation
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		//displaying result after swapping on the output screen
		System.out.printf("\n\nAfter Swapping :\n");
		System.out.printf("number 1 = %d\n", num1);
		System.out.printf("number 2 = %d", num2);
		
	}
}



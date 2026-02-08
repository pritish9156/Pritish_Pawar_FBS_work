//Write a C program to input five numbers and find their average.

public class Q5 {
	public static void main(String[] args){
		
		//declaration
		int num1, num2, num3, num4, num5;
		double average;
		
		//assigning five numbers
		num1 = 10;
		num2 = 15;
		num3 = 16;
		num4 = 20;
		num5 = 21;
		
		//Performing operation to find average of five numbers
		average = (num1 + num2 + num3 + num4 + num5) / 5.0;
		
		//printing a result on the output screen
		System.out.printf("Average of %d, %d, %d, %d and %d is %.1f",num1, num2, num3, num4, num5, average);
		
	}

	
}

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		//Find sum of all numbers.
		
		//array reference 
		int[] array;
		
		//initialization
		array = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter elements to store in array: ");
		
		//store elements
		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextInt(); 
		}
		
		System.out.println("\nElements stored in array: ");
		//display array
		for(int ele:array) {
			System.out.println(ele);
		}
		
		int sum = 0;
		
		for(int ele:array) {
			sum += ele;
		}
		
		System.out.println("\nSum of all elements: " + sum);
		
		sc.close();

	}

}

import java.util.Scanner;

public class Test3 {
	
	public static void main(String args[]) {
		
		int[] array = new int[5];
		
		System.out.println("Enter element to store in array: ");
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		//display elements from array
		System.out.println("\nElements stored in array: ");
		for(int ele:array) {
			System.out.println(ele);
		}
		
		//find the sum of all elements
		int sumOfArray = 0;
		
		for(int ele:array) {
			sumOfArray += ele;
		}
		
		System.out.println("\nSum of all elements: " + sumOfArray);
		
		sc.close();
	}
	
}
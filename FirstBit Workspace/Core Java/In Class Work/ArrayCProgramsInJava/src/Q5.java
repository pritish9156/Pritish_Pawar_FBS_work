import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		
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
		
		//print alternate elements in array
		System.out.println("\nAlternate numbers from array: ");
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i++]);
		}
		
		sc.close();

	}

}

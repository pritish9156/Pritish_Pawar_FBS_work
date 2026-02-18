import java.util.Scanner;

public class Q9 {
	
	public static void main(String[] args) {
		
		//reverse the given array
		
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
		
		int end = array.length-1;
		
		for(int i=0; i < end; i++) {
			int temp = array[i];
			array[i] = array[end];
			array[end] = temp;
			end--;
		}
		
		System.out.println("\nReversed array: ");
		for(int ele:array) {
			System.out.println(ele);
		}
		
		sc.close();
		
	}

}

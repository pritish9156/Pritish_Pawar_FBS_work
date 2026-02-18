import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		//find minimum and maximum number in array
		
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
		
		System.out.println("\n Elements stored in array: ");
		//display array
		for(int ele:array) {
			System.out.println(ele);
		}
		
		int max = array[0], min = array[0];
		
		for(int ele:array) {
			if(ele>max) max = ele;
			if(ele<min) min = ele;
		}
		
		System.out.println("\nMaximum : " + max + "\nMinimum: " + min);
		
		sc.close();

	}

}

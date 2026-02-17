import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
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
		
		//print alternate elements from array
		System.out.println("\nAlternate Elements from array: ");
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i++]);
		}
		
		sc.close();
	}

}

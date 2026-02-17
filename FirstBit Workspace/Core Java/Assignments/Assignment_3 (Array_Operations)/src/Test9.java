import java.util.Scanner;

public class Test9 {

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
		
		//Reverse array
		int end = array.length - 1;
		for(int i=0; i<end; i++) {
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

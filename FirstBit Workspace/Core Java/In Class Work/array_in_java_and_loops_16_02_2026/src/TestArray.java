

import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {
		
		int[] array;
		
		array = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter elements in array !!!");
		
		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("\nEntered elements in array");
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("\nEntered elements in array using foreach loop");
		
		for(int ele:array) {
			System.out.println(ele);
		}
		
		sc.close();

	}

}

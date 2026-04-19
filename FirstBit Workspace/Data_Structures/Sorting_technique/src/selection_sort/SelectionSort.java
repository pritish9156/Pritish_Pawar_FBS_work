package selection_sort;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many number you want to store: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter " + size + " elements:");
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("\nYour elements: ");
		System.out.print("[");
		for(int i=0; i<arr.length; i++) {
			if(i==arr.length-1)
				System.out.print(arr[i] + "]\n");
			else
			System.out.print(arr[i] + ",");
		}
		
		System.out.println();
		
		System.out.println("After Selection sort: ");
		
		selectionSort(arr);

		System.out.print("[");
		for(int i=0; i<arr.length; i++) {
			if(i==arr.length-1)
				System.out.print(arr[i] + "]\n");
			else
			System.out.print(arr[i] + ",");
		}
		
		
		sc.close();
	}
	
	static void selectionSort(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			int index=i;
			
			for(int j=i+1; j<arr.length; j++) {
				if(arr[index]>=arr[j])
					index=j;
			}
			
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
		
	}
}

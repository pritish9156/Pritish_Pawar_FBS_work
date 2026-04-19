package bubble_sort;

import java.util.Scanner;

public class BubbleSort {

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
		
		System.out.println("After Bubble sort: ");
		
		bubbleSort(arr);

		System.out.print("[");
		for(int i=0; i<arr.length; i++) {
			if(i==arr.length-1)
				System.out.print(arr[i] + "]\n");
			else
			System.out.print(arr[i] + ",");
		}
		
		
		sc.close();
	}
	
	static void bubbleSort(int[] arr) {
		
		boolean swap = false;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap=true;
				}
			}
			
			if(swap==false)
				return;
		}
		
	}
}

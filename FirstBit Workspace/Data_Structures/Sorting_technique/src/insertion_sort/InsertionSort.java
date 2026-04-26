package insertion_sort;

import java.util.Scanner;

public class InsertionSort {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many elements you want to store: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter " + size + " elements: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("\nElements stored: [");
		for(int i=0; i<arr.length; i++) {
			if(i==arr.length-1)
				System.out.print(arr[i] + "]\n");
			else
				System.out.print(arr[i] + ",");
		}
		
		insertionSort(arr);
		
		System.out.print("\nAfter Insertion sort: [");
		for(int i=0; i<arr.length; i++) {
			if(i==arr.length-1)
				System.out.print(arr[i] + "]\n");
			else
				System.out.print(arr[i] + ",");
		}
	}
	
	public static void insertionSort(int[] arr) {
		
		for(int i=1; i<arr.length; i++) {
			
			for(int j=i; j>0 ; j--) {
				
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1] = temp;
				}
				else
					break;
				
			}
		}
		
	}

}

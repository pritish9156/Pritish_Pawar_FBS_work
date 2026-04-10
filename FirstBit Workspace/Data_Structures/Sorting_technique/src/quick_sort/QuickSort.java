package quick_sort;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many Numbers you want to store: ");
		int arraySize = sc.nextInt();
		
		int[] array = new int[arraySize];
		
		System.out.print("\nEnter " + arraySize + " numbers to store: ");
		
		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.print("\nNumbers stored: [");
		
		for(int i=0; i<array.length; i++) {
			if(i==array.length-1)
				System.out.println(array[i] + "]");
			else
				System.out.print(array[i] + ", ");
		}
		
		System.out.println("\nImplementing Quick sort to sort the array...");
		
		quickSort(array, 0, array.length-1);
		
		System.out.print("\nAfter Sorting: [");
		
		for(int i=0; i<array.length; i++) {
			if(i==array.length-1)
				System.out.println(array[i] + "]");
			else
				System.out.print(array[i] + ", ");
		}

	}//main ends here
	
	static void quickSort(int array[], int beg, int end) {
		
		if(beg<end) {
		
			int d = divide(array, beg, end);
			quickSort(array, beg, d-1);
			quickSort(array, d+1, end);
		
		}	
	}//quick sort method ends here
	
	static int divide(int[] array, int beg, int end) {
		
		int pivot = array[beg];
		int i = beg+1, j = end;
		
		while(i<j) {
			
			while(i<=end && array[i] <= pivot) {
				i++;
			}
			
			while(j>=beg && array[j] > pivot) {
				j--;
			}
			
			if(i<j) {
				int temp = array[j];
				array[j] = array[i];
				array[i] = temp;
			}

		}
		
		int temp = array[beg];
		array[beg] = array[j];
		array[j] = temp;
		return j;
	}//divide method ends here

}//class ends here

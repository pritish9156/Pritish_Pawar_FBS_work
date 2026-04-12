package merge_sort;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort{
	
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
		
		System.out.println("\nImplementing Merge sort to sort the array...");
		
		mergeSort(array, 0, array.length-1);
		
		System.out.print("\nAfter Sorting: [");
		
		for(int i=0; i<array.length; i++) {
			if(i==array.length-1)
				System.out.println(array[i] + "]");
			else
				System.out.print(array[i] + ", ");
		}
		sc.close();
		
	}//main method ends here
	
	static void combine(int[] array, int beg, int mid, int end) {
		
		int l1 = mid-beg+1;
		int l2 = end-mid;
		
		int[] left = new int[l1];
		int[] right = new int[l2];
		
//		for(int i=0; i<left.length; i++) {
//			left[i] = array[beg + i];
//		}
		
//		for(int i=0; i<right.length; i++) {
//			right[i] = array[mid+1+i];
//		}
		
		left = Arrays.copyOfRange(array, beg, mid+1);
		right = Arrays.copyOfRange(array, mid+1, end+1);
	
		int k=0, j=0, i=beg;
		
		while(k<l1 && j<l2) {
			if(left[k]<right[j]) {
				array[i] = left[k];
				k++;
			}else {
				array[i] = right[j];
				j++;
			}
			i++;
		}
			
		while(k < l1) {
			array[i] = left[k];
			k++;
			i++;
		}
			
		while(j < l2) {
			array[i] = right[j];
			j++;
			i++;
		}
	}//combine ends here
	
	static void mergeSort(int[] array, int beg, int end) {
		
		if(beg<end) {
			
			int mid = (beg + end)/2;
			
			mergeSort(array, beg, mid);
			mergeSort(array, mid+1, end);
			combine(array, beg, mid, end);
			
		}	
	}//mergeSort ends here
	
} //mergeSort class ends here
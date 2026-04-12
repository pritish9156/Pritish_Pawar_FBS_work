package binary_search;

import java.util.Scanner;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int[] arr = {10,20,24,41,45};
		
		int start=0, end=arr.length-1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number to search: ");
		int numToSearch = sc.nextInt();
		
		while(start<=end) {
			
			int mid = (start+end)/2;
			
			if(numToSearch == arr[mid]) {
				System.out.println("Number["+numToSearch+"] found at index: "+mid);
				break;
			}
			else if(numToSearch<arr[mid])
				end=mid-1;
			else if(numToSearch>arr[mid])
				start=mid+1;
		}
		
		
	}
}

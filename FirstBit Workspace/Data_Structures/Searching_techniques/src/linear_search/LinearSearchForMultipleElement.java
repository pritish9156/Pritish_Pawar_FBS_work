package linear_search;

import java.util.Scanner;

public class LinearSearchForMultipleElement {

	public static void main(String[] args) {
		// search and print the number of times element occur in the array
		
		int[] arr = {22,31,22,45,66}, index = new int[arr.length];
		int count=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number to search: ");
		int eleToSearch = sc.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			if(eleToSearch == arr[i]) {
				index[count] = i;
				count++;
			}
		}
		
		if(count!=0) {
			System.out.print("Element found at index[ ");
			for(int i=0; i<count; i++) {
				System.out.print(index[i] + " ");
			}
			System.out.print("] occured " + count + " times in the array");
		}
		else {
			System.out.println("Not found");
		}

	}

}

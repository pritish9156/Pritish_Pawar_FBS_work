package linear_search;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] arr = {10,22,32,41,56};
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number to search: ");
		int eleToSearch = sc.nextInt();
		
		for(i=0; i<arr.length; i++) {
			if(arr[i]==eleToSearch) {
				System.out.println("Element found at index " + i);
				break;
			}
		}
		
		if(i==arr.length) {
			System.out.println("Element not found");
		}
		
		sc.close();

	}

}

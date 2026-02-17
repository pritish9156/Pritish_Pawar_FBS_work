import java.util.Scanner;

public class Test1{
	public static void main(String[] args) {
		
		int[] array; //reference
		
		array = new int[5]; //array initialization
		
		Scanner sc = new Scanner(System.in);
		
		//store elements into array
		System.out.println("Enter " + array.length + " elements into array: ");
		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		//print elements from array
		System.out.println("\nElements stored in array: ");
		for(int ele:array) {
			System.out.println(ele);
		}
		
		//search an element in array
		System.out.println("\nEnter element to search in array: ");
		int eleToSearch = sc.nextInt();
		
		boolean flag = true;
		for(int i=0; i<array.length; i++) {
			if(array[i] == eleToSearch) {
				System.out.println("\nElement(" + eleToSearch + ") found at Index: " + i); 
				flag = false;
			}
		}
		
		if(flag) System.out.println("\nElement(" + eleToSearch + ") Not Found in the Array");
		
		sc.close();
		
	}
}
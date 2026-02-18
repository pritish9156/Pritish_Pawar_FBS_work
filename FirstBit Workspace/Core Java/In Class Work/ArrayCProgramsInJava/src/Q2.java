import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		//Search the given number in array.
		
				//array reference 
				int[] array;
				
				//initialization
				array = new int[5];
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter elements to store in array: ");
				
				//store elements
				for(int i=0; i<array.length; i++) {
					array[i] = sc.nextInt(); 
				}
				
				System.out.println("\nElements stored in array: ");
				//display array
				for(int ele:array) {
					System.out.println(ele);
				}
				
				System.out.println("\nEnter Number to search in array: ");
				int numToSearch = sc.nextInt();
				
				boolean flag = true;
				
				for(int i=0; i<array.length; i++) {
					if(numToSearch == array[i]) {
						System.out.println("\nNumber found at index " + i);
						flag = false;
					}
				}
				
				if(flag) System.out.println("\nNumber not found in the array.");
				
				sc.close();

	}

}

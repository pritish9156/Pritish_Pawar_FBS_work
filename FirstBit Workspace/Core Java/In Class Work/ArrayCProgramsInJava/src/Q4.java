import java.util.Scanner;

public class Q4 {
	
	public static void main(String[] args) {
		//Find odd and even among the numbers.
		
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
				
				System.out.print("\nEven Numbers in array: ");
				
				for(int ele:array) {
					if(ele % 2 == 0) System.out.print(ele + " ");
				}
				
				System.out.print("\nOdd Numbers in array: ");
				
				for(int ele:array) {
					if(ele % 2 != 0) System.out.print(ele + " ");
				}
				
				sc.close();
	}

}

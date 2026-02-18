import java.util.Scanner;

public class Q6 {
	
	public static void main(String[] args) {
		
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
				
				System.out.println("\nPrime numbers from array: ");
				
				for(int ele:array) {
					boolean flag = true;
					
					for(int i=2; i<ele; i++) {
						if(ele % i == 0) {
							flag = false;
							break;
						}
					}
					
					if(flag && ele!=1) System.out.println(ele);
				}
				
				sc.close();
	}

}

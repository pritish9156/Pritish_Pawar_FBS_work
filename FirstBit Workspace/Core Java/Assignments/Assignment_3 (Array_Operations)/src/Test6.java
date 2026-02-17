import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		
		int[] array = new int[5];
		
		System.out.println("Enter element to store in array: ");
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		//display elements from array
		System.out.println("\nElements stored in array: ");
		for(int ele:array) {
			System.out.println(ele);
		}
		
		//print prime numbers from array
		System.out.println("\nPrime Numbers from array: ");
		for(int ele:array) {		
			boolean flag = true;
			for(int i = 2; i < ele; i++) {
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

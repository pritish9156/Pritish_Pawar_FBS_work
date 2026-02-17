import java.util.Scanner;

public class Test4 {

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
		
		//print all odd and even numbers from array
		System.out.print("\nEven Numbers from array: ");
		for(int ele:array) {
			if(ele % 2 == 0) System.out.print(ele + " ");
		}
		
		System.out.print("\nOdd Numbers from array: ");
		for(int ele:array) {
			if(ele % 2 != 0) System.out.print(ele + " ");
		}
		
		sc.close();

	}

}

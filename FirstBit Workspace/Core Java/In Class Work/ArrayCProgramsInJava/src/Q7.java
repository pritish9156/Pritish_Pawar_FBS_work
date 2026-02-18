import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		int[] brr = new int[5];
		int[] crr = new int[5];
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter element to store in array1: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("\nEnter element to store in array2: ");
		for(int i=0; i<brr.length; i++) {
			brr[i] = sc.nextInt();
		}
		
		//display elements from array
		System.out.print("\narr[5] = {");
		for(int i=0; i<arr.length; i++) {
			
			if(i == arr.length - 1)
				System.out.print(arr[i]);
			else 
				System.out.print(arr[i] + ", ");
			
		}
		System.out.println("}");
		
		System.out.print("brr[5] = {");
		for(int i=0; i<brr.length; i++) {
			
			if(i == brr.length - 1)
				System.out.print(brr[i]);
			else 
				System.out.print(brr[i] + ", ");
			
		}
		System.out.println("}");
		
		//Add Two Arrays and Store Result in Third Array
		System.out.print("crr[5] = {");
		for(int i=0; i<crr.length; i++) {
			crr[i] = arr[i] + brr[i];
			if(i == crr.length - 1)
				System.out.print(crr[i]);
			else 
				System.out.print(crr[i] + ", ");
		}
		System.out.println("}");
		
		System.out.println("\nResult array: ");
		for(int ele:crr) {
			System.out.println(ele);
		}
		
		sc.close();

	}

}

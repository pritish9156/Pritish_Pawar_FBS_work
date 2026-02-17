import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		
		int[] arr = new int[6];
		int[] brr = new int[7];
		int[] crr = new int[arr.length + brr.length];
		
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
		System.out.print("\nElements stored in array1: ");
		for(int ele:arr) {
			System.out.print(ele + " ");
		}
		
		System.out.print("\nElements stored in array2: ");
		for(int ele:brr) {
			System.out.print(ele + " ");
		}
		
		//merge 2 arrays
		int currIndex = arr.length;
		
		for(int i=0; i<arr.length; i++) {
			crr[i] = arr[i];
		}
		
		for(int i=0; i<brr.length; i++) {
			crr[currIndex] = brr[i];
			currIndex += 1;
		}

		System.out.print("\nMerged Array: ");
		for(int ele:crr) {
			System.out.print(ele + " ");
		}
		
		sc.close();

	}

}

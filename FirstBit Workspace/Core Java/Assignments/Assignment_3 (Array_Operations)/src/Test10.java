import java.util.Scanner;

class Test10{
	public static void main(String args[]) {
		
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
		
		//sort array
		//ascending order
		for(int i=0; i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		System.out.print("\nSorted Array(Ascending Order): ");
		for(int ele:array) {
			System.out.print(ele + " ");
		}
		
		//descending order
		for(int i=0; i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		System.out.print("\nSorted Array(Descending Order): ");
		for(int ele:array) {
			System.out.print(ele + " ");
		}
		
		sc.close();
	}
}
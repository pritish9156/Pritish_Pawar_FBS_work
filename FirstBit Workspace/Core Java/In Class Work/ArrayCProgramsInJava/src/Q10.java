import java.util.Scanner;

public class Q10 {

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
				
				for(int i=0; i<array.length; i++) {
					for(int j=i+1; j<array.length; j++) {
						if(array[i]>array[j]) {
							int temp = array[i];
							array[i] = array[j];
							array[j] = temp;
						}
					}
				}
				
				System.out.println("\nSorted array: ");
				//display array
				for(int ele:array) {
					System.out.println(ele);
				}
				
				
				sc.close();

	}

}

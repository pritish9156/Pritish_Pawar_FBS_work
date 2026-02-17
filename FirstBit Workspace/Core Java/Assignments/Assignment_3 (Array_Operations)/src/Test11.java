import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		
		int[] array;
		
		array = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter element in array: ");
		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("\nStored elements in array: ");
		for(int ele:array) {
			System.out.println(ele);
		}
		
		//find the second max element
		//descending order sort
				for(int i=0; i<array.length; i++) {
					for(int j=i+1; j<array.length; j++) {
						if(array[i] < array[j]) {
							int temp = array[i];
							array[i] = array[j];
							array[j] = temp;
						}
					}
				}
		
		
		//second Max
		System.out.println("\nSecond Max: " + array[1]);
		
		sc.close();

	}

}

import java.util.Scanner;

class Test2{
	
	public static void main(String[] args) {
		
		int[] array; //reference
		
		array = new int[5]; // array initialization
		
		//store element into array
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element to store in array: ");
		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		//display element from array
		System.out.println("\nElement stored in array: ");
		for(int ele:array) {
			System.out.println(ele);
		}
		
		//find max and min from array
		int max = array[0];
		int min = array[0];
		
		for(int ele:array) {
			if(ele >= max) max = ele;
			if(ele <= min) min = ele;
		}
		
		System.out.println("\nFirst Maximum Element: " + max);
		System.out.println("First Minimum Element: " + min);
		
		sc.close();
	}
}
//10,5,0,31,3,0,9,5,0,3,0
// output -> 10 5 31 3 9 5 3 0 0 0 0 

class LeetCode2 {

	public static void main(String[] args) {
		
		int[] array = {10,5,0,31,3,0,9,5,0,3,0};
		
		System.out.print(" Input array: ");
		for(int ele:array) {
			System.out.print(ele + " | ");
		}
	
		for(int j=0; j<array.length; j++) {
			for(int i=array.length-1; i>=0; i--) {
				if(i!=0) {
					if(array[i]!=0 && array[i-1] == 0) {	
						int temp = array[i-1];
						array[i-1] = array[i];
						array[i] = temp;	
					}
				}
			}
		}
		
		System.out.print("\n\nOutput array: ");
		for(int ele:array) {
			System.out.print(ele + " | ");
		}
	}
}




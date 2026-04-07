package merge_sort;

public class MergeTwoArray {

	public static void main(String[] args) {
		
		int[] a = {3,4,8,10};
		int[] b = {2,6,18,20};
		
//		int[] a = {23,40,51,60};
//		int[] b = {2,41,45,50};
		
		int[] merged_array = new int[a.length+b.length];
		
		int j=0, k=0;
		
		for(int i=0; i<merged_array.length; i++) {

				if(k < b.length && j < a.length) {
					if(b[k]<a[j]) {
						merged_array[i] = b[k];
						k++;
					}
					else {				
						merged_array[i] = a[j];
						j++;
					}
				}else if(k == b.length) {
					merged_array[i] = a[j];
					j++;
				}else if(j == a.length) {
					merged_array[i] = b[k];
					k++;
				}

		}
		
		for(int i=0; i<merged_array.length; i++) {
			System.out.println(merged_array[i]);
		}
		
	}

}

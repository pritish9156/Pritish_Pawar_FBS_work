public class LeetCode1 {

	public static void main(String[] args) {
		
		String str = "banana";
		String[] array = {"danana","apple", "banaba", "bonanzo", "basgna", "abcdef"};
		
		for(int i=0; i<array.length; i++) {
			if(str.length() == array[i].length()) {
				
				int diff = 0;
				
				for(int j=0; j<array[i].length(); j++) {
					if(array[i].charAt(j)!=str.charAt(j)) {
						diff += 1;	
					}
				}
				
				
				
				if(diff==1) {
					System.out.println(diff);
					System.out.println(array[i]);
				}
			}
		}

	}

}

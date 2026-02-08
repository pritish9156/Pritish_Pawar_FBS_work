//Write a C program to convert given minutes into hours and remaining minutes. (1hours = 60minutes)

class Q7{
	public static void main(String[] args){
		
		//initialization
		int minutes = 250;
		
		//declaration
		int hours, rmin;
		
		//performing operations
		hours = minutes / 60;
		rmin = minutes % 60;
		
		//printing output
		System.out.printf("After converting %d minutes into hours :\n",minutes);
		System.out.printf("%d hours and %d minutes",hours, rmin);
		
	}
}




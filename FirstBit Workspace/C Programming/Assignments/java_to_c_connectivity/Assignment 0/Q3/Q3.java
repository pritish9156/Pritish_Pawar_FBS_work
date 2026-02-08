//Write a C program to convert temperature from Celsius to Fahrenheit using the formula: F = (C *9/5) + 32

class Q3{
	public static void main(String[] args){
		
		//initialization
		float celsius = 3;
		
		//declaration
		double fahrenheit;
		
		//performing operation to obtain operational value
		fahrenheit = (celsius * 1.8) + 32;
		
		//displaying result on output screen
		System.out.printf("Temperature in celsius is %.1f degrees\n",celsius);
		System.out.printf("Temperature after conversion in fahrenheit is %.1f degrees",fahrenheit);
		
	}
}



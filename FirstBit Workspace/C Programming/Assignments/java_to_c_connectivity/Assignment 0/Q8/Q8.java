//Write a C program to input the length and width of a rectangle and find its perimeter. (p = 2 * (length + width))


class Q8{
	public static void main(String[] args){
		
		//initialization
		double length = 4, width = 5.6;
		
		//declaration
		double perimeterOfRectangle;
		
		//performing operation
		perimeterOfRectangle = 2 * (length + width);
		
		//printing output
		System.out.printf("perimeter of rectangle is %.2f",perimeterOfRectangle);
		
	}
}



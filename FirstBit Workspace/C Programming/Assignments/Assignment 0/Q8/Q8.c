//Write a C program to input the length and width of a rectangle and find its perimeter. (p = 2 * (length + width))

#include<stdio.h>

void main(){
	
	//initiallizaiton
	float length = 4, width = 5.6;
	
	//declaration
	float perimeterOfRectangle;
	
	//performing operation
	perimeterOfRectangle = 2 * (length + width);
	
	//printing output
	printf("perimeter of rectangle is %.2f",perimeterOfRectangle);
	
}

//Write a C program to input the length and width of a rectangle and find its perimeter. (p = 2 * (length + width))

#include<stdio.h>

float parimeterFinderRectangle();
void main(){
     
	printf("perimeter of rectangle is %.2f",parimeterFinderRectangle());
		
}

float parimeterFinderRectangle(){
	
	//initialization
	float length = 4, width = 5.6;
	
	//declaration
	float perimeterOfRectangle;
	
	//performing operation
	return 2 * (length + width);		
	
}


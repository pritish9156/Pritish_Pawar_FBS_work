//Write a C program to input the length and width of a rectangle and find its perimeter. (p = 2 * (length + width))

#include<stdio.h>

void rectanglePerimeter(float*, float*, float*);
void main(){
	
	//initialization
	float length = 4, width = 5.6;
	float perimeterOfRectangle;
	
	rectanglePerimeter(&length, &width, &perimeterOfRectangle);
	
	//printing output
	printf("perimeter of rectangle is %.2f",perimeterOfRectangle);
	
}

void rectanglePerimeter(float* length, float* width, float* perimeterOfRectangle){

	//performing operation
	*perimeterOfRectangle = 2 * (*length + *width);
	
}


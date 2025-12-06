//Write a C program to input the base and height of a triangle and calculate its area. (Area = 1/2 * (Base * Height))

#include<stdio.h>

void main(){
	
	//initiallization
	float base = 4, height = 10;
	
	//declaration
	float areaOfTriangle;
	
	//performing operation
	areaOfTriangle = 0.5 * (base * height);
	
	//printing output
	printf("Area of triangle is %.2f",areaOfTriangle);
	
}

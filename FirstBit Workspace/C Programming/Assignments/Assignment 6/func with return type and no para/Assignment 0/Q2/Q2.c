//Write a C program to find the area of a circle. (Area = Pi*radius*radius)

#include<stdio.h>

float areaOfCircle();
void main(){

   printf("%.2f",areaOfCircle());	
}

float areaOfCircle(){

	//Multi-Line initialization
	float Pi = 3.14, radius = 3;
	
	return Pi * radius * radius;
	
}


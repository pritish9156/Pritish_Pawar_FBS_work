//Write a C program to find the area of a circle. (Area = Pi*radius*radius)


#include<stdio.h>

void areaOfCircle(float, float);
void main(){
	
	//Multi-Line initialization
	float Pi = 3.14, radius = 3;
	
	areaOfCircle(Pi,radius);
	
}

void areaOfCircle(float Pi, float radius){
	
	//Declaration 
	float AreaOfCircle;
	
	//performing operation to find a operational value
	AreaOfCircle = Pi * radius * radius;
	
	//printing a result on output screen
	printf("Area of a circle is %.2f",AreaOfCircle);
	
}


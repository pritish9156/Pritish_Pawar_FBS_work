//Write a C program to find the area of a circle. (Area = Pi*radius*radius)


#include<stdio.h>

void areaOfCircle(float*, float*, float*);
void main(){
	
	//Multi-Line initialization
	float Pi = 3.14, radius = 3, AreaOfCircle;
	
	areaOfCircle(&Pi, &radius, &AreaOfCircle);
	
	//printing a result on output screen
	printf("Area of a circle is %.2f",AreaOfCircle);
	
}

void areaOfCircle(float* Pi, float* radius, float* AreaOfCircle){
	
	//performing operation to find a operational value
	*AreaOfCircle = *Pi * *radius * *radius;	
	
}


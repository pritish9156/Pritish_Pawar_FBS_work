//Write a C program to input the base and height of a triangle and calculate its area. (Area = 1/2 * (Base * Height))

#include<stdio.h>

void triangleAreaFinder(float*, float*, float*);
void main(){
	
	//initialization
	float base = 4, height = 10;
	float areaOfTriangle;
	
	triangleAreaFinder(&base, &height, &areaOfTriangle);
	
	printf("Area of triangle is %.2f",areaOfTriangle);
	
}

void triangleAreaFinder(float* base, float* height, float* areaOfTriangle){

	//performing operation
	*areaOfTriangle = 0.5 * (*base * *height);

}


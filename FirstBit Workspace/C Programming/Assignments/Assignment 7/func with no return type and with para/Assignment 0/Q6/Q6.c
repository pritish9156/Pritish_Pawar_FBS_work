//Write a C program to find the square and cube of a given number.

#include<stdio.h>

void squareCubeFinder(int*,int*,int*);
void main(){
	
	int num = 2;
	int square, cube;
	
	squareCubeFinder(&num,&square,&cube);
	
	//printing output
	printf("square of %d is %d",num, square);
	printf("\ncube of %d is %d",num, cube);
	
}

void squareCubeFinder(int* num,int* square, int* cube){
//performing operation
	*square = *num * *num;
	*cube = *num * *num * *num;
	
}


//Write a C program to find the square and cube of a given number.

#include<stdio.h>

void squareCubeFinder(int);
void main(){
	
	int num = 2;
	squareCubeFinder(num);
	
}

void squareCubeFinder(int num){
	
	//declaration
	int square, cube;
	
	//performing operation
	square = num * num;
	cube = num * num * num;
	
	//printing output
	printf("square of %d is %d",num, square);
	printf("\ncube of %d is %d",num, cube);
	
}


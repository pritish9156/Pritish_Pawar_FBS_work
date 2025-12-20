//Write a C program to input five numbers and find their average.

#include<stdio.h>

void findAverage(int,int,int,int,int);
void main(){
	
	//declaration
	int num1, num2, num3, num4, num5;
	
	//assigning five numbers
	num1 = 10;
	num2 = 15;
	num3 = 16;
	num4 = 20;
	num5 = 21;
	
	findAverage(num1,num2,num3,num4,num5);
	
}

void findAverage(int num1, int num2, int num3, int num4, int num5){

    float average;
    
	//Performing operation to find average of five numbers
	average = (num1 + num2 + num3 + num4 + num5) / 5.0;
	
	//printing a result on the output screen
	printf("Average of %d, %d, %d, %d and %d is %.1f",num1, num2, num3, num4, num5, average);
	
}

//Write a C program to input five numbers and find their average.

#include<stdio.h>

float average();
void main(){
	
	printf("%.2f",average());
	
}

float average(){

	//declaration
	int num1, num2, num3, num4, num5;
	
	//assigning five numbers
	num1 = 10;
	num2 = 15;
	num3 = 16;
	num4 = 20;
	num5 = 21;
	
	//Performing operation to find average of five numbers
	return (num1 + num2 + num3 + num4 + num5) / 5.0;
	
}

//Write a C program to swap two numbers using a temporary third variable.

#include<stdio.h>

void main(){
	
	//initialization
	int num1 = 10;
	int num2 = 50;
	
	//declaration of temp variable
	int temp;
	
	//displaying result before swapping on the output screen
	printf("Before Swapping :\n");
	printf("number 1 = %d\n",num1);
	printf("number 2 = %d",num2);
	
	//performing swapping operation
	temp = num1;
	num1 = num2;
	num2 = temp;
	
	//displaying result after swapping on the output screen
	printf("\n\nAfter Swapping :\n");
	printf("number 1 = %d\n",num1);
	printf("number 2 = %d",num2);
	
}


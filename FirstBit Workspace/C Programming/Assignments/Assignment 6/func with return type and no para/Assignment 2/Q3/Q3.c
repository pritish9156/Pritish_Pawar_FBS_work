//Write a program to find greatest of three numbers using nested if-else.

#include<stdio.h>

int findGreatestNumber();
void main(){

    printf("%d", findGreatestNumber());
	
}
	
int findGreatestNumber(){

	//variable initialization
	int num1 = 1000, num2 = 3200, num3 = 4400;
	
	//applying condition using nested if-else
	return num1>num2?num1>num3?num1:num3:num2>num3?num2:num3;
	
	
}

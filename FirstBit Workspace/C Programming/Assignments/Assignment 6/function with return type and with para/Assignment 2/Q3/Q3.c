//Write a program to find greatest of three numbers using nested if-else.

#include<stdio.h>

int findGreatestNumber(int,int,int);
void main(){

	//variable initialization
	int num1 = 1000, num2 = 3200, num3 = 4400;

    printf("%d", findGreatestNumber(num1,num2,num3));
	
}
	
int findGreatestNumber(int num1, int num2, int num3){

	//applying condition using nested if-else
	return num1>num2?num1>num3?num1:num3:num2>num3?num2:num3;	
	
}

//Write a program to check whether a number is even or odd.

#include<stdio.h>

void checkEvenOdd(int*, int*);
void main(){
	
	//variable initialization
	int number = 4, flag=0;
	
	checkEvenOdd(&number, &flag);
	
	if(flag==1)
		printf("Even number");
	else
		printf("Odd Number");
}

void checkEvenOdd(int* number, int* flag){

	//using conditional operator
	if(*number%2 == 0)
		*flag=1;

}


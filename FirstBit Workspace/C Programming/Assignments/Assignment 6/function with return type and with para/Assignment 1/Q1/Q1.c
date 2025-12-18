//Write a program to check whether a number is even or odd.

#include<stdio.h>

int evenOdd(int);
void main(){

	//variable initialization
	int number = 3;
	
	if(evenOdd(number))
	   printf("Even Number");
	else
	   printf("Odd Number");
	
}

int evenOdd(int number){
	
	//using conditional operator
	if(number%2 == 0)
		return 1;
	else
		return 0;

}


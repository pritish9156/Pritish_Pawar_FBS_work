//Write a program to check whether a number is even or odd.

#include<stdio.h>

int evenOdd();
void main(){
	
	if(evenOdd())
	   printf("Even Number");
	else
	   printf("Odd Number");
	
}

int evenOdd(){
	
	//variable initialization
	int number = 3;
	
	//using conditional operator
	if(number%2 == 0)
		return 1;
	else
		return 0;

}


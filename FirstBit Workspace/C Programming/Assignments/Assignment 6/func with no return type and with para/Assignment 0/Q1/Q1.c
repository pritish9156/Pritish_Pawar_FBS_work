//Write a C program to add two integers and display the result

#include<stdio.h>

void addIntegers(int, int);
void main(){
	
	//initialization
	int integer1 = 20;
	int integer2 = 30;
	
	addIntegers(integer1,integer2);
	
}

void addIntegers(int integer1, int integer2){
	
	//declaration
	int Addition_result;
	
	//performing operation to find a operational value
	Addition_result = integer1 + integer2;
	
	//printing result on output screen
	printf("Addition of %d and %d is %d",integer1, integer2, Addition_result);
}


//Write a C program to add two integers and display the result

#include<stdio.h>

void addIntegers(int*, int*, int*);
void main(){
	
	//initialization
	int integer1 = 20;
	int integer2 = 30;
	int addition;
	
	addIntegers(&integer1,&integer2,&addition);

	printf("The addition of %d and %d is: %d",integer1,integer2,addition);
	
}

void addIntegers(int* integer1, int* integer2, int* addition){
	
	//performing operation to find a operational value
	*addition = *integer1 + *integer2;
}


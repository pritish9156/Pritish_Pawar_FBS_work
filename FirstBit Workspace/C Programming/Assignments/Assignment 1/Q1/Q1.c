//Write a program to check whether a number is even or odd.

#include<stdio.h>

void main(){
	
	//variable initiallization
	int number = 4;
	
	//using conditional operator
	if(number%2 == 0)
		printf("%d is an even number",number);
	else
		printf("%d is an odd number",number);

}

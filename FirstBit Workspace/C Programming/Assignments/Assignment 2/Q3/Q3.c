//Write a program to find greatest of three numbers using nested if-else.

#include<stdio.h>

void main(){
	
	//variable initialization
	int num1 = 1000, num2 = 320, num3 = 44;
	
	//applying condition using nested if-else
	if(num1 > num2){
		if(num1 > num3)
			printf("%d - number 1 is greater",num1);
		else
			printf("%d - number 3 is greater",num3);
	}else{
		if(num2>num3)
			printf("%d - number 2 is greater",num2);
		else
			printf("%d - number 3 is greater",num3);
	}
	
}

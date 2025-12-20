/*Accept a number and check if it is divisible by 3, 5, or both.
(Print "Divisible by 3 but not by 5" or "Divisible by 5 but not by 3" or "Divisible by
both" or” Divisible by None”)*/

#include<stdio.h>

void checkDivisibility();
void main(){
	
	checkDivisibility();
	
}

void checkDivisibility(){
	
	//variable declaration
	int number;
	
	//taking input
	printf("Enter a number: ");
	scanf("%d",&number);
	
	//applying condition
	if(number%5 == 0 && number%3 == 0)
		printf("Divisible by Both 3 and 5");
	else if(number%5 == 0)
		printf("Divisible by 5 but not by 3");
	else if(number%3 == 0)
		printf("Divisible by 3 but not by 5");
	else
		printf("Divisible by None");
		
}

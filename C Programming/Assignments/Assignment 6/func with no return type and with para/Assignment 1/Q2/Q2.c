//Write a program to check given 3 digit number is pallindrome or not.

#include<stdio.h>

void pallindrome(int);
void main(){
	
	//variable declaration and initialization
	int digit = 313;
	
	pallindrome(digit);
	
}

void pallindrome(int digit){

	int first_digit, last_digit;
	
	//extracting first and last digit from given digit
	first_digit = digit/100;
	last_digit = digit%10;
	
	//checking extracted digits were equal or not
	if(first_digit == last_digit)
		printf("%d is an pallindrome number",digit);
	else
		printf("%d is not an pallindrome number",digit);	
	
}

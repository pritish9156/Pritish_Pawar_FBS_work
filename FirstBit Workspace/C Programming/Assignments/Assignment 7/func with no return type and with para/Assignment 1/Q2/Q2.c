//Write a program to check given 3 digit number is pallindrome or not.

#include<stdio.h>

void pallindrome(int*,int*,int*);
void main(){
	
	//variable declaration and initialization
	int digit = 313;
	int first_digit, last_digit;
	
	pallindrome(&digit,&first_digit,&last_digit);
	
	if(first_digit == last_digit)
		printf("%d is an pallindrome number",digit);
	else
		printf("%d is not an pallindrome number",digit);	
	
	
}

void pallindrome(int* digit,int* first_digit,int* last_digit){

	//extracting first and last digit from given digit
	*first_digit = *digit/100;
	*last_digit = *digit%10;

}

//Write a program to check whether a given year is a leap year.

#include<stdio.h>

void checkLeapYear();
void main(){
	
	checkLeapYear();
	
}
	
void checkLeapYear(){

	//variable initialization
	int year = 2000;
	
	//checking for leap year
	if(year%4==0 && year%100!=0 || year%400==0)
		printf("%d is a leap year",year);
	else
		printf("%d is not an leap year",year);
		
}
	


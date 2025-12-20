//Write a program to check whether a given year is a leap year.

#include<stdio.h>

int checkLeapYear();
void main(){

    if(checkLeapYear())
	   printf("Leap Year");
	else
	   printf("Not Leap Year");	
}
	
int checkLeapYear(){

	//variable initialization
	int year = 2000;
	
	//checking for leap year
	if(year%4==0 && year%100!=0 || year%400==0)
		return 1;
	else
		return 0;
	
}

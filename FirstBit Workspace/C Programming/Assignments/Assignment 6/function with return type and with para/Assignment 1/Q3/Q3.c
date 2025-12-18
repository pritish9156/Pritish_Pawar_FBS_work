//Write a program to check whether a given year is a leap year.

#include<stdio.h>

int checkLeapYear(int);
void main(){

	//variable initialization
	int year = 2000;

    if(checkLeapYear(year))
	   printf("Leap Year");
	else
	   printf("Not Leap Year");	
}
	
int checkLeapYear(int year){
	
	//checking for leap year
	if(year%4==0 && year%100!=0 || year%400==0)
		return 1;
	else
		return 0;
	
}

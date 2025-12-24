//to check if the year is leap or not
#include<stdio.h>
void main(){
	int year = 2025;
	
	if(year%4==0&&year%100!=0||year%400==0)
		printf("%d is an leap year",year);
	else
		printf("%d is not an leap year",year);
}
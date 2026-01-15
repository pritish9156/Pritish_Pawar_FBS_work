// using fuction(store, display) -> pass by value
#include<stdio.h>
typedef struct Date{
	int day;
	int month;
	int year;
}Date;

//storing details
Date setDate(Date date){
	printf("\nDay: ");
	scanf("%d",&date.day);
	printf("Month: ");
	scanf("%d",&date.month);
	printf("Year: ");
	scanf("%d",&date.year);
	printf("\n");
	return date;
}
	
//displaying array
void getDate(Date date){
	printf("\nDate(dd:MM:YYYY):"); 
	printf("\n%d/%d/%d",date.day, date.month, date.year);
}
void main(){
	Date d1,d2;
	
	d1=setDate(d1);
	d2=setDate(d2);
	
	getDate(d1);
	getDate(d2);		
}
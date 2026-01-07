//date structure using array with searching
#include<stdio.h>
typedef struct Date{
	int day;
	int month;
	int year;
}Date;

void main(){
	Date date[3];
	
	//storing details
	for(int i=0; i<3; i++){
		printf("Enter date number %d:", i+1);
		printf("\nDay: ");
		scanf("%d",&date[i].day);
		printf("Month: ");
		scanf("%d",&date[i].month);
		printf("Year: ");
		scanf("%d",&date[i].year);
		printf("\n");
	}
	
	printf("========================================\n");
	printf("\nDate(dd:MM:YYYY):"); 
	//displaying array
	for(int i=0; i<3; i++)
		printf("\n%d/%d/%d",date[i].day, date[i].month, date[i].year);
		
	//searching
	printf("\n\n========================================\n");
	int day,month,year,flag=0;
	printf("\nEnter a date your want to search:\n"); 
	printf("day: ");
	scanf("%d",&day);
	printf("month: ");
	scanf("%d",&month);
	printf("year: ");
	scanf("%d",&year);
		
	for(int i=0; i<3; i++){
		if(date[i].day==day&&date[i].month==month&&date[i].year==year){
			flag=1;
			printf("\nDate Found: \n%d/%d/%d",date[i].day, date[i].month, date[i].year);
			break;
		}
	}
	
	if(flag==0)
		printf("\nNot found in the structure");	
}
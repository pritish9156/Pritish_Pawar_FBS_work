//date structure using array with searching
#include<stdio.h>
typedef struct Date{
	int day;
	int month;
	int year;
}Date;

void setDate(Date* date, int size){
	for(int i=0; i<size; i++){
		printf("Enter date number %d:", i+1);
		printf("\nDay: ");
		scanf("%d",&date[i].day);
		printf("Month: ");
		scanf("%d",&date[i].month);
		printf("Year: ");
		scanf("%d",&date[i].year);
		printf("\n");
	}
}
	
void getDate(Date* date, int size){
	for(int i=0; i<size; i++){
		printf("\n%d/%d/%d",date[i].day, date[i].month, date[i].year);
	}
}


void main(){
	int size=3;
	Date date[size];
	
	//storing details
	setDate(date,size);
	
	printf("========================================\n");
	printf("\nDate(dd:MM:YYYY):"); 
	//displaying array
	getDate(date,size);
			
}
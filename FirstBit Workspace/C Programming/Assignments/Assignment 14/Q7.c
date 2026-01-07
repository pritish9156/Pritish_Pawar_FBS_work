//time structure using array
#include<stdio.h>
typedef struct Time{
	int hour;
	int min;
	int sec;
}Time;

void main(){
	Time time[3];
	
	//storing details
	for(int i=0; i<3; i++){
		printf("Enter time %d:", i+1);
		printf("\nHours: ");
		scanf("%d",&time[i].hour);
		printf("Minutes: ");
		scanf("%d",&time[i].min);
		printf("Seconds: ");
		scanf("%d",&time[i].sec);
		printf("\n");
	}
	
	printf("========================================\n");
	printf("\nTime(hours:minutes:second):"); 
	//displaying array
	for(int i=0; i<3; i++)
		printf("\n%dhrs %dmin %dsec",time[i].hour, time[i].min, time[i].sec);

}
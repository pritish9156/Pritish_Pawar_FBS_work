//Convert the time entered in hh,min and sec into total seconds.
#include<stdio.h>
void main(){
	int hh,min,sec,totalSeconds;
	printf("Enter time in hh:min:sec format : ");
	printf("\nhh: ");
	scanf("%d",&hh);
	printf("min: ");
	scanf("%d",&min);
	printf("sec: ");
	scanf("%d",&sec);
	
	//1min = 60sec and 1hours = 60min so 1hours = 60*60sec = 3600sec
	totalSeconds = (hh*3600) + (min*60) + sec;
	
	printf("\nTotal Seconds in %dhrs:%dmin:%dsec = %dseconds",hh,min,sec,totalSeconds);
}
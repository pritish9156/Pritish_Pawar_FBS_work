// using fuction(store, display) -> pass by value
#include<stdio.h>
typedef struct Time{
	int hour;
	int min;
	int sec;
}Time;

	//storing details
	Time setTime(Time time){
		printf("\nHours: ");
		scanf("%d",&time.hour);
		printf("Minutes: ");
		scanf("%d",&time.min);
		printf("Seconds: ");
		scanf("%d",&time.sec);
		printf("\n");
		return time;
	}
	 
	//displaying array
	void getTime(Time time){
		printf("\n%dhrs %dmin %dsec",time.hour, time.min, time.sec);
	}
	
void main(){
	Time t1,t2;
	t1=setTime(t1);
	t2=setTime(t2);
	
	printf("\nTime(hours:minutes:second):");
	getTime(t1);
	getTime(t2);

}
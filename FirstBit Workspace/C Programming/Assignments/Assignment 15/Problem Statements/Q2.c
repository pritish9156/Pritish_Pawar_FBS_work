//Create a structure Time with data members as hrs, min, sec. Accept the values of all
//these members from user and display them. Also perform addition of two time variables
//and display the result. If sec goes beyond 60, carry it to min etc. Add a method to convert
//the given time into sec.

#include<stdio.h>
#include<stdlib.h>
typedef struct Time{
	int timeId;
	int hrs;
	int min;
	int sec;
}Time;

//function for storing Time Data
void addTimeData(Time* time,int size){
	for(int i=0; i<size; i++){
		printf("\n\t------Enter Time %d--------",i+1);
		time[i].timeId=i+1;
		printf("\n(Hrs-Min-Sec): ");
		scanf("%d%d%d",&time[i].hrs,&time[i].min,&time[i].sec);
		printf("\n");
	}
	printf("\n--------------------------\n");
}

//function for displaying Time Data
void displayTimeData(Time* time,int size){
	for(int i=0; i<size; i++){
		printf("\nTime %d = %dhrs %dmin %dsec\n",time[i].timeId, time[i].hrs, time[i].min, time[i].sec);
	}
	printf("\n--------------------------\n");
}

//addition of Time Data using a Serial Number
void additionBySerialNumber(Time* time, int* TimeSerialNum, int size, int serialQuantity){
	Time addTime[serialQuantity];
	int resHrs=0, resMin=0, resSec=0, extraMin, extraSec;
	
	for(int i=0; i<serialQuantity; i++){
		for(int j=0; j<size; j++){
			if(TimeSerialNum[i]==time[j].timeId){
				addTime[i]=time[j];
			}
		}
	}
	
	for(int i=0; i<serialQuantity; i++){
		resHrs += addTime[i].hrs;
		resMin += addTime[i].min;
		resSec	+= addTime[i].sec;
	}
	
	if(resSec >= 60){
		extraSec = resSec / 60;
		resSec %= 60;
		resMin += extraSec;
	}
	
	if(resMin >= 60){
		extraMin = resMin / 60;
		resMin %= 60;
		resHrs += extraMin;
	}
		
	printf("\n\nAddition: %dhrs %dmin %dsec\n",resHrs, resMin, resSec);
	printf("\n-----------------------------------\n");
}

//function to add the all the avilable data of Time
void addAllTheTimeData(Time* time, int size){
	int resHrs=0, resMin=0, resSec=0, extraMin, extraSec;
	for(int i=0; i<size; i++){
		resHrs += time[i].hrs;
		resMin += time[i].min;
		resSec	+= time[i].sec;
	}
	
	if(resSec >= 60){
		extraSec = resSec / 60;
		resSec %= 60;
		resMin += extraSec;
	}
	
	if(resMin >= 60){
		extraMin = resMin / 60;
		resMin %= 60;
		resHrs += extraMin;
	}
		
	printf("\n\nAddition: %dhrs %dmin %dsec\n",resHrs, resMin, resSec);
	printf("\n-----------------------------------\n");
}

//function for addition of Time Data
void additionOfTime(Time* time,int size){
	int choice;
	printf("\nChoose How You Want to do addition:");
	
	do{
		printf("\n\n\t1.Using Time Serial Number\n\t2.Do Addition of all data Present\n\t3.Back to main menu");
		printf("\n\nEnter Your Choice: ");
		scanf("%d",&choice);
		
		switch(choice){
			case 1:{
				int serialQuantity;
				printf("\nHow many serial number are you going to enter in a addition process: ");
				scanf("%d",&serialQuantity);
				
				int TimeSerialNum[serialQuantity];
				
				for(int i=0; i<serialQuantity; i++){
					printf("\nEnter a serial number %d: ",i+1);
					scanf("%d",&TimeSerialNum[i]);
				}
				
				printf("\nYou Selected: ");
				for(int i=0; i<serialQuantity; i++){
					for(int j=0; j<size; j++){
						if(TimeSerialNum[i]==time[j].timeId){
							printf("\nTime %d = %dhrs %dmin %dsec",time[j].timeId, time[j].hrs, time[j].min, time[j].sec);
						}
					}
				}
			
				additionBySerialNumber(time,TimeSerialNum,size,serialQuantity);
				break;
			}
				
			case 2:
				addAllTheTimeData(time,size);
				break;
				
			case 3:
				printf("\n-------------------------------\n");
				break;
				
			default:
				printf("\n\n---------Wrong Choice Try again---------\n");
		}
	}while(choice!=3);
}

//convert a given time to total seconds
void convertTimeIntoTotalSec(Time* time, int size){
	int totalSec[size];
	
	for(int i=0; i<size; i++){
		totalSec[i] = time[i].hrs*3600 + time[i].min*60 + time[i].sec;
	}
	
	for(int i=0; i<size; i++){
		printf("\n%dhrs %dmin %dsec = %dsec\n",time[i].hrs,time[i].min,time[i].sec,totalSec[i]);
	}
	printf("\n-------------------------------\n");
}

void main(){
	int size,ch;
	Time* time;
	
	printf("How many data you want to store: ");
	scanf("%d",&size);
	
	time = (Time*)malloc(size*sizeof(Time));
	
	do{
		printf("\n\t1.Add Time Data\n\t2.Display All Data\n\t3.Perform Addition\n\t4.Convert Time into Seconds\n\t5.Exit");
		printf("\n\nEnter Your Choice: ");
		scanf("%d",&ch);
		
		switch(ch){
			case 1:
				addTimeData(time,size);
				break;
			
			case 2:
				displayTimeData(time,size);
				break;
		
			case 3:
				additionOfTime(time,size);
				break;
				
			case 4:
				convertTimeIntoTotalSec(time,size);
				break;
				
			case 5:
				printf("\n\t--------Exited Successfully--------");
				break;
				
			default:
				printf("\n\n\t---------Wrong Choice Please Try Again---------\n\n");
		}
		
	}while(ch!=5);
}

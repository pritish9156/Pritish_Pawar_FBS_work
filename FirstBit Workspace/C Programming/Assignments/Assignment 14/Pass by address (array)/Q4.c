//Hr structure using array
#include<stdio.h>
typedef struct HR{
	int id;
	char name[10];
	float salary;
	int commission;
}HR;

void setHr(HR* hrArray, int size){

	for(int i=0; i<size; i++){
		printf("Enter details for HR %d:", i+1);
		printf("\nEnter HR id: ");
		scanf("%d",&hrArray[i].id);
		printf("Enter HR name: ");
		scanf("%s",hrArray[i].name);
		printf("Enter HR salary: ");
		scanf("%f",&hrArray[i].salary);
		printf("Enter commission: ");
		scanf("%d",&hrArray[i].commission);
		printf("\n");
	}
}
	
	//displaying array
void getHr(HR* hrArray, int size){
	for(int i=0; i<size; i++){
		printf("\nDetails of HR id: %d",hrArray[i].id);
		printf("\nHR name: %s",hrArray[i].name);
		printf("\nHR salary: %.2f",hrArray[i].salary);
		printf("\nHR commission: %d\n",hrArray[i].commission);
	}
}

void main(){
	int size=3;
	HR hrArray[size];
	
	setHr(hrArray, size);
	getHr(hrArray, size);
	
}
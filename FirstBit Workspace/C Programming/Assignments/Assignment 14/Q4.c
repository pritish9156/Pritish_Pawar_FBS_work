//Hr structure using array
#include<stdio.h>
typedef struct HR{
	int id;
	char name[10];
	float salary;
	int commission;
}HR;

void main(){
	HR hrArray[3];
	
	//storing details
	for(int i=0; i<3; i++){
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
	
	printf("========================================\n");
	
	//displaying array
	for(int i=0; i<3; i++){
		printf("\nDetails of HR id: %d",hrArray[i].id);
		printf("\nHR name: %s",hrArray[i].name);
		printf("\nHR salary: %.2f",hrArray[i].salary);
		printf("\nHR commission: %d\n",hrArray[i].commission);
		
	}
}
//SalesManager structure using array
#include<stdio.h>
typedef struct SalesManager{
	int id;
	char name[10];
	float salary;
	int incentive;
	int targate;
}SalesManager;

void main(){
	SalesManager salesManagerArray[3];
	
	//storing details
	for(int i=0; i<3; i++){
		printf("Enter details for Sales Manager %d:", i+1);
		printf("\nEnter Sales Manager id: ");
		scanf("%d",&salesManagerArray[i].id);
		printf("Enter name: ");
		scanf("%s",salesManagerArray[i].name);
		printf("Enter salary: ");
		scanf("%f",&salesManagerArray[i].salary);
		printf("Enter incentive: ");
		scanf("%d",&salesManagerArray[i].incentive);
		printf("Enter target: ");
		scanf("%d",&salesManagerArray[i].targate);
		printf("\n");
	}
	
	printf("========================================\n");
	
	//displaying array
	for(int i=0; i<3; i++){
		printf("\nDetails of HR id: %d",salesManagerArray[i].id);
		printf("\nname: %s",salesManagerArray[i].name);
		printf("\nsalary: %.2f",salesManagerArray[i].salary);
		printf("\nincentive: %d",salesManagerArray[i].incentive);
		printf("\ntarget: %d\n",salesManagerArray[i].targate);
	}
}
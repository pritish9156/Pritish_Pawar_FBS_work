//SalesManager structure using array
#include<stdio.h>
typedef struct SalesManager{
	int id;
	char name[10];
	float salary;
	int incentive;
	int targate;
}SalesManager;

void setHR(SalesManager* salesManagerArray, int size){
	for(int i=0; i<size; i++){
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
}
	
void getHR(SalesManager* salesManagerArray, int size){
	for(int i=0; i<3; i++){
		printf("\nDetails of Sales Manager id: %d",salesManagerArray[i].id);
		printf("\nname: %s",salesManagerArray[i].name);
		printf("\nsalary: %.2f",salesManagerArray[i].salary);
		printf("\nincentive: %d",salesManagerArray[i].incentive);
		printf("\ntarget: %d\n",salesManagerArray[i].targate);
	}
}

void main(){
	int size=3;
	SalesManager salesManagerArray[size];
	
	setHR(salesManagerArray, size);
	getHR(salesManagerArray, size);
}
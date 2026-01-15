// using fuction(store, display) -> pass by valuey
#include<stdio.h>
typedef struct SalesManager{
	int id;
	char name[10];
	float salary;
	int incentive;
	int targate;
}SalesManager;

//storing details
SalesManager setSalesManager(SalesManager salesManager){
		printf("\nEnter Sales Manager id: ");
		scanf("%d",&salesManager.id);
		printf("Enter name: ");
		scanf("%s",salesManager.name);
		printf("Enter salary: ");
		scanf("%f",&salesManager.salary);
		printf("Enter incentive: ");
		scanf("%d",&salesManager.incentive);
		printf("Enter target: ");
		scanf("%d",&salesManager.targate);
		printf("\n");
		
		return salesManager;
	}
	
	
//displaying array
void getSalesManager(SalesManager salesManager){
		printf("\nDetails of HR id: %d",salesManager.id);
		printf("\nname: %s",salesManager.name);
		printf("\nsalary: %.2f",salesManager.salary);
		printf("\nincentive: %d",salesManager.incentive);
		printf("\ntarget: %d\n",salesManager.targate);
	}

void main(){
	SalesManager SM1, SM2;
	
	SM1 = setSalesManager(SM1);
	SM2 = setSalesManager(SM2);
	
	getSalesManager(SM1);
	getSalesManager(SM2);
	
}
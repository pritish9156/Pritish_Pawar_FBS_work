#include<stdio.h>
typedef struct HR{
	int id;
	char name[30];
	float salary;
	float incentive;
	int target;
}hr;

hr storeHR(){
	hr temp;
	printf("Enter HR id: ");
	scanf("%d", &temp.id);
	printf("Enter HR name: ");
	scanf("%s", temp.name);
	printf("Enter salary: ");
	scanf("%f", &temp.salary);
	printf("Enter Incentive: ");
	scanf("%f", &temp.incentive);
	printf("Enter target: ");
	scanf("%d", &temp.target);
	printf("\n");
	
	return temp;
}

hr displayHR(hr disp){
	printf("\nHR id: %d", disp.id);
	printf("\nHR name: %s", disp.name);
	printf("\nsalary: %f", disp.salary);
	printf("\nIncentive: %f", disp.incentive);
	printf("\nTarget: %d", disp.target);
	printf("\n");
}

void main(){
	hr h1,h2,h3;
	
	h1=storeHR();
	h2=storeHR();
	h3=storeHR();
	
	displayHR(h1);
	displayHR(h2);
	displayHR(h3);
}
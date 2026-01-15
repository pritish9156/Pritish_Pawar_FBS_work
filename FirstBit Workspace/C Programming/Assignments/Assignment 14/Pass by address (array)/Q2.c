#include<stdio.h>
#include<string.h>
typedef struct employee{
	int emp_id;
	char name[30];
	int salary;
}Employee;

void setEmployee(Employee* emp, int size){
	
	for(int i=0; i<size; i++){
		printf("\nEnter employee id: ");
		scanf("%d", &emp[i].emp_id);
		
		printf("Enter employee name: ");
		scanf("%s",emp[i].name);
		
		printf("Enter employee salary: ");
		scanf("%d", &emp[i].salary);
		
		printf("\n");
 	}
}

void getEmployee(Employee* emp, int size){
	
	for(int i=0; i<size; i++){
		printf("\nEmployee id: %d",emp[i].emp_id);
		
		printf("\nEmployee name: %s",emp[i].name);
		
		printf("\nEmployee salary: %d\n",emp[i].salary);
	}
	
}

void main(){
	int size=3;
	Employee empArray[size];
	
	setEmployee(empArray, size);
	getEmployee(empArray, size);
}
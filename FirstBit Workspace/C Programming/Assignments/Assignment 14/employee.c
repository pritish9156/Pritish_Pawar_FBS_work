//employee structure
#include<stdio.h>
#include<string.h>
typedef struct employee{
	int emp_id;
	char name[30];
	int salary;
}employee;

employee setEmployee(){
	employee temp;
	
	printf("\nEnter employee id: ");
	scanf("%d", &temp.emp_id);
	
	printf("Enter employee name: ");
	scanf("%s",temp.name);
	
	printf("Enter employee salary: ");
	scanf("%d", &temp.salary);
	
	return temp;
}

void getEmployee(employee emp){
	
	printf("\nEmployee id: %d",emp.emp_id);
	
	printf("\nEmployee name: %s",emp.name);
	
	printf("\nEmployee salary: %d",emp.salary);
	
}

void main(){
	employee e1,e2,e3;
	//taking values hardcoded for 1st employee
	e1.emp_id = 101;
	strcpy(e1.name, "Ramesh");
	e1.salary = 50000;
	
	//taking values by using fuction
	e2 = setEmployee();
	e3 = setEmployee();
	
	//printing output
	printf("\n\nDetails of employee 1: ");
	getEmployee(e1);
	
	printf("\n\nDetails of employee 2: ");
	getEmployee(e2);
	
	printf("\n\nDetails of employee 3: ");
	getEmployee(e3);
}
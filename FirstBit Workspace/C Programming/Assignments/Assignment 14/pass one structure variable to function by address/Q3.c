// using fuction(store, display) 
#include<stdio.h>
typedef struct Admin{
	int id;
	char name[30];
	float salary;
	int commission;
}admin;

void storeAdmin(admin*);
void displayAdmin(admin*);

void main(){
	admin a1,a2;
	//store admin data
	storeAdmin(&a1);
	storeAdmin(&a2);
	
	//display admin data
	displayAdmin(&a1);
	displayAdmin(&a2);
}

void storeAdmin(admin* temp){
	printf("Enter details for admin ");
	printf("\nEnter admin id: ");
	scanf("%d",&temp->id);
	printf("Enter admin name: ");
	scanf("%s",temp->name);
	printf("Enter salary: ");
	scanf("%f",&temp->salary);
	printf("Enter admin commission: ");
	scanf("%d",&temp->commission);
	printf("\n");
	
}

void displayAdmin(admin* Admin){
	printf("\nDetails of admin id %d",Admin->id);
	printf("\nadmin id: %d",Admin->id);
	printf("\nadmin name: %s",Admin->name);
	printf("\nsalary: %f",Admin->salary);
	printf("\nadmin commission: %d\n",Admin->commission);
}
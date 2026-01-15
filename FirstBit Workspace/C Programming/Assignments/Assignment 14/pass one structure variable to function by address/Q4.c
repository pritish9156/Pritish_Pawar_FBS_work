// using fuction(store, display)
#include<stdio.h>
typedef struct HR{
	int id;
	char name[10];
	float salary;
	int commission;
}HR;

void setHR(HR* temp){
	printf("\nEnter HR id: ");
	scanf("%d",&temp->id);
	printf("Enter HR name: ");
	scanf("%s",temp->name);
	printf("Enter HR salary: ");
	scanf("%f",&temp->salary);
	printf("Enter commission: ");
	scanf("%d",&temp->commission);
	printf("\n");
	
}

void getHR(HR* h){
	printf("\nDetails of HR id: %d",h->id);
	printf("\nHR name: %s",h->name);
	printf("\nHR salary: %.2f",h->salary);
	printf("\nHR commission: %d\n",h->commission);
}

void main(){
	HR h1,h2,h3;
	

	setHR(&h1);
	setHR(&h2);
	setHR(&h3);
	
	getHR(&h1);
	getHR(&h2);
	getHR(&h3);
		
	
}
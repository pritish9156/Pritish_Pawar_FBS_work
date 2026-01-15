//Admin(id,name,salary,commission)
#include<stdio.h>
typedef struct Admin{
	int id;
	char name[30];
	float salary;
	int commission;
}admin;

void storeAdmin(admin*,int);
void displayAdmin(admin*,int);

void main(){
	int size=3;
	admin Adminarray[size];
	//store admin data
	storeAdmin(Adminarray,size);
	
	//display admin data
	displayAdmin(Adminarray,size);

}

void storeAdmin(admin* temp, int size){
	
	for(int i=0; i<size; i++){

		printf("Enter details for admin ");
		printf("\nEnter admin id: ");
		scanf("%d",&temp[i].id);
		printf("Enter admin name: ");
		scanf("%s",temp[i].name);
		printf("Enter salary: ");
		scanf("%f",&temp[i].salary);
		printf("Enter admin commission: ");
		scanf("%d",&temp[i].commission);
		printf("\n");
	}
	
}

void displayAdmin(admin* Admin, int size){
	for(int i=0; i<size; i++){
		printf("\nDetails of admin id %d",Admin[i].id);
		printf("\nadmin id: %d",Admin[i].id);
		printf("\nadmin name: %s",Admin[i].name);
		printf("\nsalary: %f",Admin[i].salary);
		printf("\nadmin commission: %d\n",Admin[i].commission);
	}
}
#include<stdio.h>
#include<string.h>
typedef struct student{
	int roll;
	char name[30];
	int marks;
}student;

void setStudent(student* temp, int size){

	for(int i=0; i<size; i++){
		printf("\nEnter student roll: ");
		scanf("%d", &temp[i].roll);
		
		printf("Enter student name: ");
		scanf("%s",temp[i].name);
		
		printf("Enter student marks: ");
		scanf("%d", &temp[i].marks);
	}
}

void getStudent(student* stud, int size){
	for(int i=0; i<size; i++){
		printf("\nstudent roll: %d",stud[i].roll);
		printf("\nstudent name: %s",stud[i].name);
		printf("\nstudent marks: %d%%",stud[i].marks);
		printf("\n");
	}
}

void main(){
	int size=3;
	student stud[size];
	
	setStudent(stud,size);
	getStudent(stud,size);

}
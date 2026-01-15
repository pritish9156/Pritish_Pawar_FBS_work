// using fuction(store, display)
#include<stdio.h>
#include<string.h>
typedef struct student{
	int roll;
	char name[30];
	int marks;
}student;

void setStudent(student* temp){
	
	printf("\nEnter student roll: ");
	scanf("%d", &temp->roll);
	
	printf("Enter student name: ");
	scanf("%s",temp->name);
	
	printf("Enter student marks: ");
	scanf("%d", &temp->marks);

}

void getStudent(student* stud){
	
	printf("\nstudent roll: %d",stud->roll);
	
	printf("\nstudent name: %s",stud->name);
	
	printf("\nstudent marks: %d%%",stud->marks);
	
}

void main(){
	student s1,s2,s3;
	//taking values hardcoded for 1st employee
	s1.roll = 1;
	strcpy(s1.name, "rahul");
	s1.marks = 50;
	
	//taking values by using fuction
	setStudent(&s2);
	setStudent(&s3);
	
	//printing output
	printf("\n\nDetails of Student 1: ");
	getStudent(&s1);
	
	printf("\n\nDetails of Student 2: ");
	getStudent(&s2);
	
	printf("\n\nDetails of Student 3: ");
	getStudent(&s3);
}
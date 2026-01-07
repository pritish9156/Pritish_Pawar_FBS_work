//structure using array
#include<stdio.h>
typedef struct stud{
	int rollno;
	char name[30];
	int marks;
}stud;

void main(){
	stud studarray[]={
	{1,"pritsh",40},
	{2,"rohan",50},
	{3,"rakesh",70},
	{4,"dharmendar",90}};
	
//	for(int i=0; i<2; i++){
//		printf("Enter student information of stud %d:", i+1);
//		printf("\nEnter rollno: ");
//		scanf("%d", &studarray[i].rollno);
//		printf("Enter name: ");
//		scanf("%s", studarray[i].name);
//		printf("Enter marks: ");
//		scanf("%d", &studarray[i].marks);
//		printf("\n");
//	}
		for(int i=0; i<4; i++){
		printf("\nstudent information of stud %d:", i+1);
		printf("\nrollno: %d", studarray[i].rollno);
		printf("\nEnter name: %s", studarray[i].name);
		printf("\nEnter marks: %d", studarray[i].marks);
		printf("\n");
	}
	
	int roll, flag=0; 
	printf("\nStudent Corner");
	printf("\nEnter your roll number to check your marks: ");
	scanf("%d",&roll);
	
	for(int i=0; i<4; i++){
		if(studarray[i].rollno==roll){
			flag=1;
			printf("\nstudent information of stud roll no: %d", roll);
			printf("\nrollno: %d", studarray[i].rollno);
			printf("\nEnter name: %s", studarray[i].name);
			printf("\nEnter marks: %d", studarray[i].marks);
		}
	}
	
	if(flag==1)
		printf("\n\nDetails fetched successfully");
	else
		printf("\n\nDetails not found please check your roll number");
}
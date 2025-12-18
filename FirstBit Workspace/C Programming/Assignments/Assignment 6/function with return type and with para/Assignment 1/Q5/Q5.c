//Write a program to check whether a person is eligible to vote (age >= 18).

#include<stdio.h>

int checkAge(int);
void main(){

	//variable initialization
	int age = 17;

   if(checkAge(age))
      printf("Eligible to vote");
   else
       printf("Not Eligible");
}
	
int checkAge(int age){
	
	//applying condition
	if(age >= 18)
		return 1;
	else
		return 0;
}


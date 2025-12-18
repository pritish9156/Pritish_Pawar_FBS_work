//Write a program to check whether a person is eligible to vote (age >= 18).

#include<stdio.h>

int checkAge();
void main(){

   if(checkAge())
      printf("Eligible to vote");
   else
       printf("Not Eligible");
}
	
int checkAge(){
	
	//variable initialization
	int age = 17;
	
	//applying condition
	if(age >= 18)
		return 1;
	else
		return 0;
}


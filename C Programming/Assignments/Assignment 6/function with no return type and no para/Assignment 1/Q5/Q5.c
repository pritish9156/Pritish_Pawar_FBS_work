//Write a program to check whether a person is eligible to vote (age >= 18).

#include<stdio.h>

void checkAge();
void main(){
	
	checkAge();
	
}
	
void checkAge(){

	//variable initialization
	int age = 17;
	
	//applying condition
	if(age >= 18)
		printf("Eligible to vote");
	else
		printf("Not eligible to vote - Your age is %d years old\nAge must be at least 18 years old to be eligible.",age);

}

//Accept the age and check if the person is: Child (age < 12),Teenager (12–19),Adult (20–59),Senior (60 and above)

#include<stdio.h>

void checkAge(int);
void main(){
	
	//variable declaration
	int age = 34;
	
	checkAge(age);
}

void checkAge(int age){
	
	//applying condition
	if(age < 12){
		printf("child");
	}else if(age >= 12 && age <=19){
		printf("Teenager");
	}else if(age >= 20 && age <=59){
		printf("Adult");
	}else{
		printf("Senior");
	}
	
}

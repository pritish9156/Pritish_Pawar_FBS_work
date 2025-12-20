//Accept the age and check if the person is: Child (age < 12),Teenager (12–19),Adult (20–59),Senior (60 and above)

#include<stdio.h>

char checkPerson();
void main(){
	
	char result = checkPerson();
	
	if(result == 'c')
		printf("child");
	else if(result == 't')
		printf("Teenager");
	else if(result == 'a')
		printf("Adult");
	else
		printf("Senior");
	
}

char checkPerson(){
	
	//variable declaration
	int age = 34;
	
	//applying condition
	if(age < 12)
		return 'c';
	else if(age >= 12 && age <=19)
		return 't';
	else if(age >= 20 && age <=59)
		return 'a';	
	
}

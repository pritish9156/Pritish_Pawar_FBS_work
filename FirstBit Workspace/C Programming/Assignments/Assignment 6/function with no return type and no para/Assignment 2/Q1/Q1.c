//Accept two numbers from user and an operator (+,-,/,*,%) based on that perform the desired operations.

#include<stdio.h>

void calculateOperation();
void main(){
	
	calculateOperation();

}

void calculateOperation(){

    //variable declaration and initialization
	int num1, num2, result, error=1;
	char operation;
	
	//taking two numbers from the user
	printf("Enter 1st number: ");
	scanf("%d",&num1);
	printf("\nEnter 2nd number: ");
	scanf("%d",&num2);
	
	//taking operator from the user
	printf("\nChoose any one operator to perform operation (+,-,/,*,%%): ");
	scanf(" %c",&operation);
    
	//applying condition according to the operator given
	if(operation == '+')
		result = num1 + num2;
	else if(operation == '-')
		result = num1 - num2;
	else if(operation == '*')
		result = num1 * num2;
	else if(operation == '%')
		result = num1 % num2;
	else if(operation == '/'){
		//checking divisible by zero case
		if(num2 == 0){
			printf("\nError -> Not divisible by zero"); 
			error = 0; //error variable will get triggered to false 
		}
		else
			result = num1 / num2;
	}else{
		printf("\nNot a correct input please try again.");
	}
	
	//printing result
	if(error != 0) //no output if divisible by zero error occurs
		printf("\nResult: %d", result);;
		
}

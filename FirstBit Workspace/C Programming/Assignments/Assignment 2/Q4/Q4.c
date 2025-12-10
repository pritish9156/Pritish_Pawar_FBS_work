/*Ask the user to enter marks. Then show the result based on these rules:
If marks are more than 75  show "Distinction"
If marks are more than 65  show "First Class"
If marks are more than 55  show "Second Class"
If marks are 40 or more  show "Pass Class"
If marks are less than 40  show "Fail" */

#include<stdio.h>

void main(){
	
	//variable declaration
	int marks;
	
	//taking input
	printf("Enter your marks: ");
	scanf("%d",&marks);
	
	//applying condition
	if(marks > 75){
		printf("Result -> Distinction");
	}else if(marks > 65){
		printf("Result -> First Class");
	}else if(marks > 55){
		printf("Result -> Second Class");
	}else if(marks >= 40){
		printf("Result -> Pass Class");
	}else{
		printf("Result -> Fail");
	}
	
}

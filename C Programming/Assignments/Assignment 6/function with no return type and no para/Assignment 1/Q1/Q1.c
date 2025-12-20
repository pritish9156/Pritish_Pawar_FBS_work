//Write a program to check whether a number is even or odd.

#include<stdio.h>
	
void checkEvenOdd();
	
void main(){
	
	checkEvenOdd();
	checkEvenOdd();
	
}
	
void checkEvenOdd(){
	int num;
		
	printf("Enter a number : ");
	scanf("%d",&num);
		
	if(num%2==0)
        printf("Number is Even\n\n");
    else
        printf("Number is Odd\n\n");
}



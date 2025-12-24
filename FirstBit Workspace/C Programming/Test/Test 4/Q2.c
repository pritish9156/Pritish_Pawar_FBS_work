//write a program to find power of any number
#include<stdio.h>
void main(){
	int num,pow,power=1;
	printf("Enter a number: ");
	scanf("%d",&num);
	printf("Enter a power: ");
	scanf("%d",&pow);
	
	for(int i=1; i<=pow; i++){
		power = power * num;
	}
	
	printf("%d^%d = %d",num,pow,power);
	
}
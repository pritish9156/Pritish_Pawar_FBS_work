//Print numbers from 1 to 10 -> Output: 1 2 3 4 5 6 7 8 9 10

#include<stdio.h>

void primeNumberRange(int);
void main(){
	
	int number = 1;
	
	primeNumberRange(number);
	
}

void primeNumberRange(int number){
	
	while(number <= 10){
		printf("%d ",number);
		number++;
	}
	
}

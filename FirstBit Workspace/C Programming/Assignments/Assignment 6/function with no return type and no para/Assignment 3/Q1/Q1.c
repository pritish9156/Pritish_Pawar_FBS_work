//Print numbers from 1 to 10 -> Output: 1 2 3 4 5 6 7 8 9 10

#include<stdio.h>

void printNumbers();
void main(){
	
	printNumbers();
	
}

void printNumbers(){
	
	int number = 1;
	
	while(number <= 10){
		printf("%d ",number);
		number++;
	}
	
}

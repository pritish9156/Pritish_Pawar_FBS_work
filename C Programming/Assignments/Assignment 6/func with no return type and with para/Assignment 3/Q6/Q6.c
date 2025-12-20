//Check the given number is Perfect number or not. Input: n = 28 Output: Perfect

#include<stdio.h>

void checkPerfectNumber(int);
void main(){
	
	int number = 28;
	checkPerfectNumber(number);
}

void checkPerfectNumber(int number){

    int i=1, sum=0, orig = number;
	
	while(i < number){
		if(number%i==0){
			sum = sum + i;
		}
		i++;
	}
	
	if(sum == orig)
		printf("Perfect");
	else
		printf("Not Perfect");
	
}

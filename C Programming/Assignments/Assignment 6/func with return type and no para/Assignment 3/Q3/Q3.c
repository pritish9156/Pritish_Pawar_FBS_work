//Sum of numbers in given range. Find sum of numbers from start to end. Input: start = 1, end = 5 Output: 15

#include<stdio.h>

int sumStartEndOfNumber();
void main(){
	
	printf("Sum: %d",sumStartEndOfNumber());
	
}

int sumStartEndOfNumber(){
	
	int start = 1, end = 5, sum = 0;
	
	while(start <= end){
		sum = sum + start;
		start++;
	}
	
	return sum;
	
}

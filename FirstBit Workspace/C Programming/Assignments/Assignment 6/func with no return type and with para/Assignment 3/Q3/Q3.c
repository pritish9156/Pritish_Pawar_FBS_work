//Sum of numbers in given range. Find sum of numbers from start to end. Input: start = 1, end = 5 Output: 15

#include<stdio.h>

void sumOfNumbersInRange(int, int);
void main(){
	
	int start = 1, end = 5;
	sumOfNumbersInRange(start, end);
}

void sumOfNumbersInRange(int start, int end){

	int sum = 0;
	
	while(start <= end){
		sum = sum + start;
		start++;
	}
	
	printf("sum = %d",sum);
	
}

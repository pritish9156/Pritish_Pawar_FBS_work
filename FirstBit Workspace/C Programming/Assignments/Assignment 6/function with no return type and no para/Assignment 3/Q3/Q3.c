//Sum of numbers in given range. Find sum of numbers from start to end. Input: start = 1, end = 5 Output: 15

#include<stdio.h>

void sumOfNumbers();
void main(){
	
	sumOfNumbers();
	
}

void sumOfNumbers(){
	
	int start = 1, end = 5, sum = 0;
	
	while(start <= end){
		sum = sum + start;
		start++;
	}
	
	printf("sum = %d",sum);
	
}

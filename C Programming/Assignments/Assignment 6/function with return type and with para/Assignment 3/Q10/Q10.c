//Find Sum of first and last digit of given number. Input: n = 12345 Output: 6 (1 + 5)

#include<stdio.h>

int firstLastDigitSum(int);
void main(){
	int n = 12345;
	printf("%d",firstLastDigitSum(n));
	
}

int firstLastDigitSum(int n){
	
	int firstDigit, lastDigit, reverse, sum;
	
	lastDigit = n%10;
	
	while(n > 0){
		int r1 = n%10;
		reverse = reverse * 10 + r1;
		n = n/10;
	}
	
	firstDigit = reverse%10;
	
	sum = firstDigit + lastDigit;
	return sum;
	
}

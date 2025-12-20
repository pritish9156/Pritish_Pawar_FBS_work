//Find factorial of given number. Input: n = 5 Output: 120

#include<stdio.h>

int findFactorial(int);
void main(){
	
	int n = 5;
	printf("Factorial: %d",findFactorial(n));
	
}

int findFactorial(int n){
	
	int factorial=1;
	
	while(n > 0){
		factorial = factorial * n;
		n--;
	}
	
	return factorial;
	
}

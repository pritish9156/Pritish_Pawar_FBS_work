//Find factorial of given number. Input: n = 5 Output: 120

#include<stdio.h>

int findFactorial();
void main(){
	
	printf("Factorial: %d",findFactorial());
	
}

int findFactorial(){
	
	int n = 5, factorial=1;
	
	while(n > 0){
		factorial = factorial * n;
		n--;
	}
	
	return factorial;
	
}

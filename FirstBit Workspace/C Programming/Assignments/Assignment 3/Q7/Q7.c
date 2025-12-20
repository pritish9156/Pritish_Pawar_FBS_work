//Find factorial of given number. Input: n = 5 Output: 120

#include<stdio.h>

void main(){
	
	int n = 5, factorial=1;
	
	while(n > 0){
		factorial = factorial * n;
		n--;
	}
	
	printf("%d",factorial);
	
}

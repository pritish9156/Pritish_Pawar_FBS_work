//Check the given number is Strong number or not. Input: n = 145 Output: Strong

#include<stdio.h>

void main(){
	
	int n = 145, sum = 0, orig = n;
	
	while(n > 0){
		int r1 = n%10;
		
		int fact = 1, i = 1;
		while(i <= r1){
			fact = fact * i;
			i++;
		}
		
		sum = sum + fact;
		n = n/10;
	}
	
	if(orig == sum){
		printf("Strong Number");
	}
	else{
		printf("Not a Strong Number");
	}
}

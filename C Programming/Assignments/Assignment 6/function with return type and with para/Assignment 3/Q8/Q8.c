//Check the given number is Strong number or not. Input: n = 145 Output: Strong

#include<stdio.h>

int isStrong(int);
void main(){
	
	int n = 145;

	if(isStrong(n))
		printf("strong Number");
	else
	    printf("Not strong Number");
	    
}

int isStrong(int n){
	
	int sum = 0, orig = n;
	
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
	
	if(orig == sum)
		return 1;
	else
		return 0;
}

//Check the given number is prime or not. Input: n = 7 Output: Prime

#include<stdio.h>

int isPrime();
void main(){

    if(isPrime())
       printf("Prime");	
    else
       printf("Not Prime");
}
	
int isPrime(){

	int n = 7, i=2, flag=0;
	
	while(i < n){
		if(n%i==0){
			flag=1;
			break;
		}
		i++;
	}
	
	if(flag == 0)
		return 1;
	else
	    return 0;	
	
}

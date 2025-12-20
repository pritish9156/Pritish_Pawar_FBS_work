//Print table for given number. Input: n = 5 Output: 5 10 15 20 25 30 35 40 45 50

#include<stdio.h>

void main(){
	
	int input = 5, i = 1;
	
	while(i <= 10){
		printf("%d x %d = %d\n",input, i, input*i);
		i++;
	}
	
}

//Check the given number is Armstrong number or not.. Input: n = 153 Output: Armstrong

#include<stdio.h>

void Armstrong();
void main(){
	
	Armstrong();
}

void Armstrong(){
	
	int n = 153, sum=0, orig = n, digit;
	
	while(n > 0){
		n = n/10;
		digit++;
	}
	
	n = orig;
	
	while(n > 0){
		int r1 = n%10;
		
		int power = 1;
		int i=1;
		while(i<=digit){
			power = power * r1;
			i++;
		}
		
		sum = sum + power;
		n = n/10;
	}
	
	if(orig == sum){
		printf("Armstrong");
	}
	else{
		printf("Not Armstrong");
	}
	
}

//Check the given number is Palindrome number or not. Input: n = 121 Output: Palindrome

#include<stdio.h>

void palindrome(int);
void main(){
	
	int n = 121;
	palindrome(n);
	
}

void palindrome(int n){
    int orig = n, reverse=0;
    
	while(n > 0){
		int r1 = n%10;
		reverse = reverse * 10 + r1;
		n = n/10;
	}
	
	if(orig == reverse){
		printf("Number is Palindrome Number");
	}
	else{
		printf("Number is not an Palindrome Number");
	}
	
}

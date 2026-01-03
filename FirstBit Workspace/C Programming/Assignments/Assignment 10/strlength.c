// string length
#include<stdio.h>
#include<string.h>
void main(){
	char str[20];
	
	printf("Enter a string: ");
	gets(str);
	
	int length=strlen(str);
	
	printf("\nLength of entered string: %d",length);
}
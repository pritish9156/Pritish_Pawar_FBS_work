//gets()

#include<stdio.h>
#include<string.h>
void main(){
	char str[]=" ";
	
	printf("Enter string: ");
	gets(str);
	
	printf("%s",str);
}
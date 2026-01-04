//WAP to Form a New String where the First Character and the Last Character have been exchanged
#include<stdio.h>
#include<string.h>
void exchangeFirstLastChar(char*, char*);
void main(){
	char str[30];
	char str2[30];
	
	printf("Enter a string: ");
	gets(str);
	
	printf("\nYour string: %s", str);
	
	exchangeFirstLastChar(str,str2);
	
	printf("\n\nAfter exchanged: %s", str2);
}

void exchangeFirstLastChar(char* str, char* str2){
	int i=0, len;
	char temp;
	
	strcpy(str2,str);
	len = strlen(str2) - 1;
	temp = str2[i];
	str2[i]=str[len];
	str2[len]=temp;
}
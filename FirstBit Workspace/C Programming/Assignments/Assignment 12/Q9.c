//WAP to Take in Two Strings and Display the Larger String without Using Built-in Functions
#include<stdio.h>
void main(){
	char str1[30], str2[30];
	int lenstr1, lenstr2;
	printf("enter string: ");
	gets(str1);
	printf("\nenter another string: ");
	gets(str2);
	
	for(int i=0; str1[i]!='\0'; i++){
		lenstr1 = i;
	}
	
	for(int i=0; str2[i]!='\0'; i++){
		lenstr2 = i;
	}
	
	if(lenstr1 > lenstr2)
		printf("\nstring 1 is greater: %s",str1);
	else if(lenstr1 == lenstr2)
		printf("\nstring are equal");
	else
		printf("\nstring 2 is greater: %s",str2);
	
}
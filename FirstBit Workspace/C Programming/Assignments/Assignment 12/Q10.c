//Write a program to check the string is palindrome or not.
#include<stdio.h>
#include<string.h>
void main(){
	char str[30], orig[30];
	printf("enter a string: ");
	gets(str);
	
	printf("\nYour string: %s",str);
	
	strcpy(orig,str);
	strrev(str);
	
	printf("\nReverse string: %s",str);
	
	int i=0, flag=0;
	while(str[i]!='\0'){
		if(str[i]!=orig[i]){
			flag=1;
			break;
		}
		i++;
	}
	
	if(flag)
		printf("\n\nstring is not pallindrome");
	else
		printf("\n\nstring is pallindrome");
}
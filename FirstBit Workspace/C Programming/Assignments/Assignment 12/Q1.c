//1. Write a program to scan string from user then scan a single character and search it in a accepted string.
#include<stdio.h>
void main(){
	char str[30], ch;
	int i=0;
	printf("Enter a string: ");
	gets(str);
	
	printf("\nEnter a character to search: ");
	scanf("%c", &ch);
	
	while(str[i]!='\0'){
		if(str[i]==ch)
			printf("found at index: %d\n",i);
		i++;
	}
}
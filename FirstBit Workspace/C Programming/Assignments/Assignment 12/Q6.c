//WAP to Take in a String and Replace Every Blank Space with special symbol.
#include<stdio.h>
void main(){
	
	char str[30], symbol;
	
	printf("Enter a string: ");
	gets(str);
	
	printf("\nEnter a special symbol to replace blank space: ");
	scanf("%c",&symbol);
	
	for(int i=0; str[i]!='\0'; i++){
		if(str[i]==' ')
			str[i]=symbol;
	}
	
	printf("\n\nString after replacement: %s", str);
}
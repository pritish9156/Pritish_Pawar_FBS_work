//Write a program to check whether a given character is uppercase or lowercase.

#include<stdio.h>

char checkUpperLower(char);
void main(){
	
	//variable initialization
	char ch = 'a';

	char res = checkUpperLower(ch);
	
	if(res=='u')
	   printf("Uppercase");
	else if(res=='l')
	   printf("Lowercase");
	   
}

char checkUpperLower(char ch){

	//applying condition
	if(ch>='A' && ch<='Z')
		return 'u';
	else if(ch>='a' && ch<='z')
		return 'l';
	else
		printf("Not a valid character Input please try again.");
		
}

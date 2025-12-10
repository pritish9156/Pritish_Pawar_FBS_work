//Write a program to check whether a given character is uppercase or lowercase.

#include<stdio.h>

void main(){
	
	//variable initialization
	char ch = 'a';
	
	//applying condition
	if(ch>='A' && ch<='Z')
		printf("Given character -> (%c) is an Uppercase character",ch);
	else if(ch>='a' && ch<='z')
		printf("Given character -> (%c) is an lowercase character",ch);
	else
		printf("Not a valid character Input please try again.");
		
}

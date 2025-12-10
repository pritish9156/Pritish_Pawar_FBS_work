//Write a program to check whether a given character is a vowel or consonant.
//(vowel - a,e,i,o,u,A,E,I,O,U others are consonant)

#include<stdio.h>

void main(){
	
	//variable initialization
	char ch='A';
	
	//applying condition
	if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
		printf("%c is a vowel",ch);
	else
		printf("%c is a consonant",ch);
	
}



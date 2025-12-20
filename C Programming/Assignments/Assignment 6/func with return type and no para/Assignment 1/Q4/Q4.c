//Write a program to check whether a given character is a vowel or consonant.
//(vowel - a,e,i,o,u,A,E,I,O,U others are consonant)

#include<stdio.h>

int checkVowelConsonant();
void main(){

    if(checkVowelConsonant())
	   printf("Vowel");
	else
	   printf("Not Vowel");
}

int checkVowelConsonant(){
	
	//variable initialization
	char ch='A';
	
	//applying condition
	if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
		return 1;
	else
		return 0;
	
}



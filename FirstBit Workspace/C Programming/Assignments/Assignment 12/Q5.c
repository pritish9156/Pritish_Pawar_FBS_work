//WAP to Count the Number of Vowels in a String
#include<stdio.h>
#include<string.h>
#include<ctype.h>
void main(){
	char str[30];
	int count=0;
	
	printf("enter string: ");
	gets(str);
	
	for(int i=0; str[i]!='\0'; i++){
		if(strchr("aeiou",tolower(str[i])))
		{
			count++;
		}
	}
	
	printf("Vowel count: %d", count);
}
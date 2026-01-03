//mystrcat
#include<stdio.h>
#include<string.h>
void mystrcat(char*, char*);
void main(){
	char str[30], str2[30];
	
	printf("enter string: ");
	gets(str);
	
	printf("\nenter another string: ");
	gets(str2);
	
	mystrcat(str,str2);
	
	printf("\nstring: %s", str);
}

void mystrcat(char* str, char* str2){
	int i=0;
	int strlength = strlen(str);
	int str2length = strlen(str2);

	for(int i=0; i<=str2length; i++)
		str[strlength+i]=str2[i];

}
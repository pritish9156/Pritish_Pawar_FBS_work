//mystrlen
#include<stdio.h>
void mystrlen(char*, int*);
void main(){
	char str[30];
	int length;
	
	printf("Enter string: ");
	gets(str);
	
	mystrlen(str,&length);
	
	printf("\n\nstring length: %d", length);
}

void mystrlen(char* str, int* length){
	int i=0;
	while(str[i]!='\0')
		*length = ++i;
}
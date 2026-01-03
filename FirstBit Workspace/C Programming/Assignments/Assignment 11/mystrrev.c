//mystrrev
#include<stdio.h>
#include<string.h>
void mystrrev(char*);
void main(){
	char str[30];
	printf("enter a string: ");
	gets(str);
	
	mystrrev(str);
	
	printf("reverse string: %s", str);
}

void mystrrev(char* str){
	int length = strlen(str)-1;

	for(int i=0; i<length; i++){
		char temp = str[i];
		str[i] = str[length];
		str[length] = temp;
		length--;
	}
	
}
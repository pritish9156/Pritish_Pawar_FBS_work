//mystrstr
#include<stdio.h>
#include<string.h>
#include<stdlib.h>
char* mystrstr(char*, char*);
void main(){
	char str[30];
	char substring[30];
	
	printf("Enter string: ");
	gets(str);
	
	printf("\nEnter string to find: ");
	gets(substring);
	
	char* res = mystrstr(str, substring);
	
	if(res)
		printf("\n\nfound at index: %d",(res-str)/sizeof(char));
	else
		printf("\n\nNot found");
}

char* mystrstr(char* str, char* substring){
	int i=0;
	for(int i=0; str[i]!='\0'; i++){
		int j=0;
		
		while(substring[j]!='\0' && str[i+j]==substring[j])
			j++;
			
		if(substring[j]=='\0')
			return &str[i];
	}
	
	return NULL;
}
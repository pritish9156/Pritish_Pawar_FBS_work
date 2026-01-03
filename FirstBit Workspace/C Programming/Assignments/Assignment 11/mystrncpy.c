//mystrncpy
#include<stdio.h>
void mystrncpy(char*, char*, int);
void main(){
	char str1[30], str2[30];
	int n;

	printf("enter string: ");
	gets(str2);
	printf("memory address: %u", str2);
	printf("\nhow much char to copy: ");
	scanf("%d", &n);
	
	mystrncpy(str1, str2, n-1);
	
	printf("\n\nstring: %s", str1);
	printf("\nmemory address: %u", str1);
}

void mystrncpy(char* str1, char* str2, int n){
	int i=0;
	while(i<=n){
		str1[i]=str2[i];
		i++;
	}
	str1[i]='\0';
}
//strncpy- copy n number of string
#include<stdio.h>
#include<string.h>
void main(){
	char dest[30];
	char source[]="Hello world";
	
	printf("source: %s", source);
	strncpy(dest,source,5);
	printf("\ndestination: %s", dest);
	
	
}
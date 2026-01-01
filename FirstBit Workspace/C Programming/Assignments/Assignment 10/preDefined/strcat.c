//strcat
#include<stdio.h>
#include<string.h>
void main(){
	char dest[] = "hello";
	char source[] = " fbs";
	
	printf("before append operation: ");
	printf("\ndestination: %s", dest);
	printf("\nsource: %s", source);
	
	strcat(dest,source);
	
	printf("\n\nbefore append operation: ");
	printf("\ndestination: %s", dest);
	printf("\nsource: %s", source);
}
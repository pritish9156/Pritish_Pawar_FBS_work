//strncat
#include<stdio.h>
#include<string.h>
void main(){
	char dest[] = "hello";
	char source[] = " fbs full stack java";
	
	printf("before append operation: ");
	printf("\ndestination: %s", dest);
	printf("\nsource: %s", source);
	
	strncat(dest,source,9);
	
	printf("\n\nbefore append operation: ");
	printf("\ndestination: %s", dest);
	printf("\nsource: %s", source);
}
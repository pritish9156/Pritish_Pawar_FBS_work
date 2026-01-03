//strcmp
#include<stdio.h>
#include<string.h>
void main(){
	char dest[] = "hello";
	char source[] = "Hello";
	
	printf("destination: %s", dest);
	printf("\nsource: %s", source);
	
	int result = strcmp(dest,source);
	
	if(result==0)
		printf("\nstrings are same");
	else
		printf("\nstrings are different");
	
	
}
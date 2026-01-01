//strncmp
#include<stdio.h>
#include<string.h>
void main(){
	char dest[] = "hello";
	char source[] = "hello fbs";
	
	printf("destination: %s", dest);
	printf("\nsource: %s", source);
	
	int result = strncmp(dest,source,5);
	
	if(result==0)
		printf("\nstrings are same");
	else
		printf("\nstrings are different");
	
	
}
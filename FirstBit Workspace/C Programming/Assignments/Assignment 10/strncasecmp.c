#include<stdio.h>
#include<string.h>
void main(){
	char str[] = "hello";
	char str2[] = "hellO fbs";
	
	int res = strncasecmp(str,str2,5);
	
	if(res==0)
		printf("strings are same");
	else
		printf("strings are different");
}
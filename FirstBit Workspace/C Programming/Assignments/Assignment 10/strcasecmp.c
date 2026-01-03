//strcasecmp() - string compare without case sensitivity
#include<stdio.h>
#include<string.h>
void main(){
	char str[] = "hello";
	char str2[] = "hellO";
	
	int res = strcasecmp(str,str2);
	
	if(res==0)
		printf("strings are same");
	else
		printf("strings are different");
}
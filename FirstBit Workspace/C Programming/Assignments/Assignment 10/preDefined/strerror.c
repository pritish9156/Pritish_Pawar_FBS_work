//strerror() - Error message string
#include<stdio.h>
#include<string.h>
void main(){
	
	char* res = strerror(10);
	
	printf("%s",res);
}
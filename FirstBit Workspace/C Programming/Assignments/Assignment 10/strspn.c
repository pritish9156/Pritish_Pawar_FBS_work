//strspn(); Finds any matching char
#include<stdio.h>
#include<string.h>
void main(){
	char str[]="hello";
	char ch[] = "12345679hello";
	
	char* res = strpbrk(str,ch);
	
	printf("%s",res);
}
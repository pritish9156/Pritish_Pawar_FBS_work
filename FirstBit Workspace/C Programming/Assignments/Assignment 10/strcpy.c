//string copy
#include<stdio.h>
#include<string.h>
void main(){
	char dest[30];
	char source[] = "hello fbs";
	printf("before copying: %s", dest);
	strcpy(dest,source);
	printf("\nbefore copying: %s", dest);;
}
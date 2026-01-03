//mystrupper
#include<stdio.h>
#include<string.h>
void mystrupr(char*);
void main(){
	char str[30];
	printf("enter string: ");
	gets(str);
	
	mystrupr(str);
	
	printf("string in upper case: %s",str);
	
}

void mystrupr(char* str){
	int i=0;
	while(str[i]!='\0'){
		if(str[i]>='a' && str[i]<='z')
			str[i] = str[i] - 32;
		i++;
	}
	str[i]='\0';
}
//mystrlower
#include<stdio.h>
#include<string.h>
void mystrlwr(char*);
void main(){
	char str[30];
	printf("enter string: ");
	gets(str);
	
	mystrlwr(str);
	
	printf("string in lower case: %s",str);
	
}

void mystrlwr(char* str){
	int i=0;
	while(str[i]!='\0'){
		if(str[i]>='A' && str[i]<='Z')
			str[i] = str[i] + 32;
		i++;
	}
	str[i]='\0';
}
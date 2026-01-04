//mystrrchar
#include<stdio.h>
#include<string.h>
char* mystrchar(char*);
void main(){
	char str[30];
	printf("enter string: ");
	gets(str);
	
	char* res = mystrchar(str);
	if(res)
		printf("char found at index: %d", (res-str)/sizeof(char));
	else
		printf("Not found");
}

char* mystrchar(char* str){
	int i=strlen(str);
	
	char ch;
	printf("enter char to find: ");
	scanf("%c", &ch);
	
	while(i>=0){
		if(str[i]==ch)
			return &str[i];
		i--;
	}
	
	return NULL;
}
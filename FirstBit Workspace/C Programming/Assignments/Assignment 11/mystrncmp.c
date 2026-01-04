#include<stdio.h>
int mystrncmp(char*, char*, int* n);
void main(){
	char str[30], str2[30];
	int n;
	printf("enter string: ");
	gets(str);
	
	printf("enter another string: ");
	gets(str2);
	
	int res = mystrncmp(str, str2, &n);
	
	if(res==0)
		printf("first %d characters are same", n);
	else
		printf("first %d characters are not same", n);
}

int mystrncmp(char* str, char* str2, int* n){
	
	printf("enter length to compare: ");
	scanf("%d", n);
	
	for(int i=0; i<(*n); i++){
		if(str[i]!=str2[i])
			return 1;
	}
	
	return 0;
	
}
//WAP to Remove the nth Index Character from a Non-Empty String
#include<stdio.h>
void main(){
	char str[30];
	int index;
	printf("Enter a string: ");
	gets(str);
	
	printf("\nEnter a index to remove: ");
	scanf("%d",&index);
	
	for(int i=index; str[i]!='\0'; i++){
		str[i]=str[i+1];
	}
	
	printf("String: %s",str);
}
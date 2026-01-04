//WAP to Calculate the Number of Words Present in a String
#include<stdio.h>
void main(){
	char str[30];
	int count=0;
	
	printf("enter a string: ");
	gets(str);
	
	for(int i=0; str[i]!='\0'; i++){
		if(str[i]!=' ')
			count++;
	}
	
	printf("\n\nNumber of words in your string: %d",count);
}
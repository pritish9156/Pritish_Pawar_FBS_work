//WAP to Remove the Characters of Odd Index Values in a String
#include<stdio.h>
void main(){
	char str[30];
	int i, j = 0;
	
	printf("enter a string: ");
	gets(str);
	
	for(int i=0; str[i]!='\0'; i++){
		if(i%2==0){
			str[j]=str[i];
			j++;
		}
	}
	str[j]='\0';

	
	printf("\n\nafter removing odd index values: %s",str);
}
//2. WAP Replace all Occurrences of ‘a’ with $ in a String
#include<stdio.h>
void main(){
	char str[40];
	printf("Enter a string: ");
	gets(str);
	
	int i=0;
	
	while(str[i]!='\0'){
		if(str[i]=='a')
			str[i]='$';
		i++;
	}
	
	printf("\n\nString after replacement: %s",str);
}
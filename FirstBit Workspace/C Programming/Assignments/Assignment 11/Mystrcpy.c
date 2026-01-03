//mystrcpy
#include<stdio.h>
#include<string.h>
void Mystrcpy(char*,char*);
void main(){
	char orig[30];
	char copy[30];
	printf("Enter a string: ");
	gets(orig);
	
	printf("\nmemory address: %d", orig);
	
	Mystrcpy(orig,copy);
	
	printf("\n\nCopy string: %s", copy);
	printf("\nmemory address: %d", copy);
}

void Mystrcpy(char* orig, char* copy){
	int i=0;
	printf("\n%d",i);
	while(orig[i]!='\0'){
		copy[i]=orig[i];
		i++;
	}
	
	copy[i]='\0';
}
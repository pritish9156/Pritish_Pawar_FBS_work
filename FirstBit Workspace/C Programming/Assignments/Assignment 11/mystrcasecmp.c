//mystrcasecmp
#include<stdio.h>
#include<string.h>
int mystrcasecmp(char*,char*);
void main(){
	char str[30],str2[30];
	printf("Enter string: ");
	gets(str);
	printf("\nEnter another string: ");
	gets(str2);
	
	int res = mystrcasecmp(str,str2);
	printf("\nresL : %d",res);
	if(res)
		printf("\nNot same");
	else
		printf("\nsame");
}

int mystrcasecmp(char* str, char* str2){
	char* strlower = strlwr(str);
	char* strlower2 = strlwr(str2);
	int i=0;
	while(strlower[i]!='\0' || strlower2[i]!='\0'){
		if(strlower[i]!=strlower2[i])
			return 1;
		i++;
	}
	return 0;
}
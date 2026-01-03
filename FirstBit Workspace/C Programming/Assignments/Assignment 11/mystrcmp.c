//mystrcmp
#include<stdio.h>
#include<string.h>
int mystrcmp(char*, char*);
void main(){
	char str1[30], str2[30];
	printf("Enter string: ");
	gets(str1);
	printf("\nEnter another string: ");
	gets(str2);
	
	int res = mystrcmp(str1,str2);
	printf("\n%d",res);
	
	if(res==1)
		printf("\n\nstrings are same");
	else
		printf("\n\nstrings are different");
}

int mystrcmp(char* str1, char* str2) {
    int i = 0;

    while (str1[i] != '\0' || str2[i] != '\0') {
        if (str1[i] != str2[i])
            return 0;
        i++;
    }
    return 1;
}

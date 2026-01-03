//strstr() - search the first occurrence of a substring in another string

#include <stdio.h>
#include <string.h>

void main() {
    char s[] = "Hello fbs";
    
    char *str = strstr(s,"fbs");
    
    if (str != NULL)
        printf("Found"); 
    else
        printf("Not Found");
}
//sprintf() function is used to format a string and store it in a string.
#include <stdio.h>
void main() {
    char s[50];
    int n = 10;
    
    sprintf(s, "The value is %d", n);
    printf("%s", s);
}
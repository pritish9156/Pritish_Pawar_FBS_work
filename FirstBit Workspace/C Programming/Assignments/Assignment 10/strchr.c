//strchr()
#include <stdio.h>
#include <string.h>

int main() {
    char email[50];
    printf("Enter your email: ");
    scanf("%s", email);

    if (strchr(email, '@') && strchr(email, '.'))
        printf("Valid email format.\n");
    else 
        printf("Invalid email format.\n");
}
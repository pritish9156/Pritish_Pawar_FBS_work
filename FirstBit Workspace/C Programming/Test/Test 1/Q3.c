//print last 2 digit of number
#include<stdio.h>
void main(){
	int num = 223410, last, sLast;
	last = num%10;
    num = num/10;
    sLast = num%10;
	printf("%d%d",sLast,last);
}

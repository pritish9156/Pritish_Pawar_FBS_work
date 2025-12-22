// to add alternate numbers from given range
#include<stdio.h>
void main(){
	
	int start, end, sum=0;
	printf("enter the starting and ending number : ");
	scanf("%d%d",&start,&end);
	
	for(int i=start; i<=end; i++){
		sum = sum+i;
		i++;
	}
	
	printf("\n sum is %d",sum);
}
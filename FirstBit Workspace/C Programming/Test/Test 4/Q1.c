//write a program to print factors of numbers in given range.
#include<stdio.h>
void main(){
	int sp,ep;
	printf("Enter range starting point and ending point : ");
	scanf("%d%d",&sp,&ep);
	printf("\n");
	
	
	
	for(int i=sp; i<=ep; i++){
		printf("%d = ",i);
		for(int j=1; j<=i; j++){
			if(i%j==0){
				printf("%d,",j);
			}
		}
		printf("\n");
	}
}
// print even and odd numbers in a give range.
#include<stdio.h>

void isEven(int,int);
void isOdd(int,int);
void main(){
	
	int start, end;
	printf("enter the starting and ending number : ");
	scanf("%d%d",&start, &end);
	
	printf("\nEven numbers in a range are: ");
	isEven(start, end);
	
	printf("\nOdd numbers in a range are: ");
	isOdd(start, end);
	
}//Main ends here

void isEven(int start, int end){
	for(int i=start; i<=end; i++){
		if(i%2==0)
			printf("%d ",i);
	}
}

void isOdd(int start, int end){
	for(int i=start; i<=end; i++){
		if(i%2!=0)
			printf("%d ",i);
	}
}
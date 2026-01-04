//Find sum of all numbers.
#include<stdio.h>
void main(){
	
	int arr[10], sum=0;
	
	//storing numbers in a array
	printf("Enter 10 numbers to store in a array: ");
	for(int i=0;i<10;i++)
		scanf("%d",&arr[i]);
		
	printf("\nYour array: ");
	for(int i=0;i<10;i++)
		printf("%d ",arr[i]);
		
	printf("\nSum or all the elements: ");
	for(int i=0;i<10;i++){
		sum=sum+arr[i];
	}
	printf("%d",sum);
		
}
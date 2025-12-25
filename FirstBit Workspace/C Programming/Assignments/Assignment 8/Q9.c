//Reverse the given array
#include<stdio.h>
void main(){
	
	int arr[10];
	
	//storing numbers in a array
	printf("Enter 10 numbers to store in a array: ");
	for(int i=0;i<10;i++)
		scanf("%d",&arr[i]);
		
	printf("\nYour array: ");
	for(int i=0;i<10;i++)
		printf("%d ",arr[i]);
		
	int arr_length = sizeof(arr)/sizeof(arr[0]);
		
	printf("\n\nReversed Array: ");
	for(int i=arr_length-1;i>=0;i--)
		printf("%d ",arr[i]);
		
}
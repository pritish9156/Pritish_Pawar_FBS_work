//Find odd and even among the numbers.
#include<stdio.h>
void main() {

	int arr[10];
	
	//storing numbers in a array
	printf("Enter 10 numbers to store in a array: ");
	for(int i=0;i<10;i++)
		scanf("%d",&arr[i]);
		
	printf("\nYour array: ");
	for(int i=0;i<10;i++)
		printf("%d ",arr[i]);
		
	printf("\n\nEven elements: ");
	for(int i=0;i<10;i++)
		if(arr[i]%2==0)
			printf("\nindex %d: %d ",i,arr[i]);
	
	printf("\n\nOdd elements: ");
	for(int i=0;i<10;i++)
		if(arr[i]%2!=0)
			printf("\nindex %d: %d ",i,arr[i]);
}
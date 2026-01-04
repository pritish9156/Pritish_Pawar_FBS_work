//Print alternate elements in array.
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
		
	//printing alternate elements
	printf("\n\nPrinting alternate elements from your array: ");
	for(int i=0;i<10;i=i+2)
		printf("\nindex %d: %d ",i,arr[i]);
		
}
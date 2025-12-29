//Print alternate elements in array.
#include<stdio.h>
void arrayInputOutput(int*, int);
void alternateArray(int*, int);
void main(){
	
	int arr[10];
	
	arrayInputOutput(arr, 10);
	alternateArray(arr,10);
		
}	

void arrayInputOutput(int* ptr, int size){
	
	//storing numbers in a array
	printf("Enter 10 numbers to store in a array: ");
	for(int i=0;i<size;i++)
		scanf("%d",&ptr[i]);
		
	printf("\nYour array: ");
	for(int i=0;i<size;i++)
		printf("%d ",ptr[i]);
}	

void alternateArray(int* ptr, int size){

	//printing alternate elements
	printf("\n\nPrinting alternate elements from your array: ");
	for(int i=0;i<size;i=i+2)
		printf("\nindex %d: %d ",i,ptr[i]);
		
}
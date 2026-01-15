//Find odd and even among the numbers.
#include<stdio.h>
#include<stdlib.h>
int* storeArrayInHeap(int size){
	
	int* ptr = (int*)malloc(size*sizeof(int));
	
	//storing numbers in a array
	printf("Enter %d numbers to store in a array: ",size);
	for(int i=0;i<size;i++)
		scanf("%d",&ptr[i]);
		
	return ptr;
}

void main() {

	int* arr = storeArrayInHeap(10);
		
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
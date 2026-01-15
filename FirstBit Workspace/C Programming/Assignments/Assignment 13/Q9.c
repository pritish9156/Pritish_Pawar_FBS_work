//reverse the given array
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

void main(){
	int* arr = storeArrayInHeap(5);
	
	printf("\n\nArray: ");
	for(int i=0;i<5;i++){
		printf("%d ", arr[i]);
	}
	
	printf("\n\nReversed Array: ");
	int end=4;
	for(int i=0;i<end;i++){
		int temp = arr[i];
		arr[i]=arr[end];
		arr[end]=temp;
		end--;
	}
	
	for(int i=0;i<5;i++){
		printf("%d ", arr[i]);
	}
	
}
/*Take two array and add sum in third array

Example-
arr[5]= {1,2, 3, 4,5}
brr[5]={10,20,30, 40, 50}
crr[5]={11,22,33,44,55}*/

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

int* storeArraySumInHeap(int* arr, int* brr, int size){
	
	int* ptr = (int*)malloc(size*sizeof(int));
	
	//sum in third array
	for(int i=0;i<size;i++){
		ptr[i]=arr[i]+brr[i];
	}
		
	return ptr;
}

void main(){
	
	int* arr = storeArrayInHeap(5);
	int* brr = storeArrayInHeap(5);
		
	//printing 2 arrays
	printf("\nFirst array: ");
	for(int i=0;i<5;i++)
		printf("%d ",arr[i]);
		
	printf("\nSecond array: ");
	for(int i=0;i<5;i++)
		printf("%d ",brr[i]);
		
	int* crr = storeArraySumInHeap(arr,brr,5);	
	
	printf("\n\nThird array: ");
	for(int i=0;i<5;i++){
		printf("%d ",crr[i]);
	}
}
//Find minimum and maximum number in array.
#include<stdio.h>
#include<stdlib.h>
void minMaxOfArray(int*, int);
int* storeArrayInHeap();
void main(){
	
	int* arr = storeArrayInHeap();
		
	minMaxOfArray(arr,10);
		
}

int* storeArrayInHeap(){
	int* res = (int*)malloc(10*sizeof(int));
	
	//storing numbers in a array
	printf("Enter 10 numbers to store in a array: ");
	for(int i=0;i<10;i++)
		scanf("%d",&res[i]);
		
	printf("\nYour array: ");
	for(int i=0;i<10;i++)
		printf("%d ",res[i]);
		
	return res;
}

void minMaxOfArray(int* ptr, int size){

    int max, min;
	//finding max and min number from the array
	max=ptr[0];
	min=ptr[0];
	for(int i=0;i<size;i++){
		if(ptr[i]>=max)
			max=ptr[i];
		
		if(ptr[i]<=min)
			min=ptr[i];
	}
	
	printf("\nMaximum number from your array is: %d",max);
	printf("\nMinimum number from your array is: %d",min);
}
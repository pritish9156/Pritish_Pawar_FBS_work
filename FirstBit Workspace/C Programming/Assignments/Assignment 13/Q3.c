//Find sum of all numbers.
#include<stdio.h>
#include<stdlib.h>
int* storeArrayInHeap(int size){
	
	int* ptr = (int*)malloc(size*sizeof(int));
	
	//storing numbers in a array
	printf("Enter 10 numbers to store in a array: ");
	for(int i=0;i<10;i++)
		scanf("%d",&ptr[i]);
		
	return ptr;
}

void main(){
	
	int size=10, sum=0;
	
	int* arr = storeArrayInHeap(size);
		
	printf("\nYour array: ");
	for(int i=0;i<10;i++)
		printf("%d ",arr[i]);
		
	printf("\nSum or all the elements: ");
	for(int i=0;i<10;i++){
		sum=sum+arr[i];
	}
	printf("%d",sum);
		
}
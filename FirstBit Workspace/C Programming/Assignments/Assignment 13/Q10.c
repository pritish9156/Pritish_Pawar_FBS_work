//Sort the array.
#include<stdio.h>
#include<stdlib.h>
int* storeArrayInHeap(int size){
	
	int* ptr = (int*)malloc(size*sizeof(int));
	
	//storing numbers in a array
	printf("Enter 10 numbers to store in a array: ");
	for(int i=0;i<size;i++)
		scanf("%d",&ptr[i]);
		
	return ptr;
}

void main(){
	
	int n;
	int* arr = storeArrayInHeap(10);
		
	printf("\nYour array: ");
	for(int i=0;i<10;i++)
		printf("%d ",arr[i]);
		
	
	for(int i=0;i<10;i++){
		for(int j=i+1;j<10;j++){
			if(arr[i]>arr[j]){
				n=arr[i];
				arr[i]=arr[j];
				arr[j]=n;
			}
		}	
	}
	
	printf("\n\nSorted array: ");
	for(int i=0;i<10;i++)
		printf("%d ",arr[i]);
		
}
		
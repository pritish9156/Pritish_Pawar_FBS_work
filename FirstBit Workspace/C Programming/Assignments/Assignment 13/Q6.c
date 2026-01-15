//Accept array and print only prime numbers of array.
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
	
	int* arr = storeArrayInHeap(10);
		
	printf("\nYour array: ");
	for(int i=0;i<10;i++)
		printf("%d ",arr[i]);

	printf("\n\nPrime elements from array: ");
	for(int i=0;i<10;i++){
		int flag=0;
		if(arr[i]!=1){
		
			for(int j=2;j<arr[i];j++){
				if(arr[i]%j==0){
					flag=1;
					break;
				}
			}
			if(flag==0)
				printf("\nindex %d: %d ",i,arr[i]);
		}
	}		
}
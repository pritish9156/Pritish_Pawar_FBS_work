//Merge tow arrays
#include<stdio.h>
#include<stdlib.h>
int* storeArrayInHeap(int size){
	
	int* ptr = (int*)malloc(size*sizeof(int));
	
//	//storing numbers in a array
//	printf("Enter 10 numbers to store in a array: ");
//	for(int i=0;i<size;i++)
//		scanf("%d",&ptr[i]);
		
	return ptr;
}

void main(){
	
	int* arr = storeArrayInHeap(10);
	int* brr = storeArrayInHeap(10);
	
	//storing numbers in 1st array
	printf("Storing elements for 1st array");
	printf("\nEnter 5 numbers to store in a array: ");
	for(int i=0;i<10;i++)
		scanf("%d",&arr[i]);
		
	int length_arr = sizeof(arr) / sizeof(arr[0]);
	
	//storing numbers in 2nd array
	printf("\n\nStoring elements for 2nd array");
	printf("\nEnter 5 numbers to store in a array: ");
	for(int i=0;i<10;i++)
		scanf("%d",&brr[i]);
	
	int length_brr = sizeof(brr) / sizeof(brr[0]);
	int merged_arr_size = length_arr+length_brr;
	int crr[merged_arr_size];
		
	//printing 2 arrays
	printf("\nFirst array: ");
	for(int i=0;i<10;i++)
		printf("%d ",arr[i]);
		
	printf("\nSecond array: ");
	for(int i=0;i<10;i++)
		printf("%d ",brr[i]);
		
	printf("\n\nMerging arrays: ");
	int j=0;
	for(int i=0;i<merged_arr_size;i++)
		if(i<merged_arr_size/2)
			crr[i]=arr[i];
		else{
			crr[i]=brr[j];
			j++;
		}
	
	for(int i=0;i<merged_arr_size;i++)
		printf("%d ",crr[i]);		
	
}
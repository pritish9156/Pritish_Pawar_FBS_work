//Merge tow arrays
#include<stdio.h>
void arrayInputOutput(int*, int);
void mergeArray(int*, int*, int);
void main(){
	
	int arr[10], brr[10];
	
	arrayInputOutput(arr, 10);
	arrayInputOutput(brr, 10);
	
	int length_arr = sizeof(arr) / sizeof(arr[0]);
	int length_brr = sizeof(brr) / sizeof(brr[0]);
	int merged_arr_size = length_arr+length_brr;
	
	mergeArray(arr,brr,merged_arr_size);
		
}	

void arrayInputOutput(int* ptr, int size){
	
	//storing numbers in a array
	printf("Enter 10 numbers to store in a array:\n ");
	for(int i=0;i<size;i++)
		scanf("%d",&ptr[i]);
		
	printf("\nYour array: ");
	for(int i=0;i<size;i++)
		printf("%d ",ptr[i]);
		
	printf("\n\n");
}	

void mergeArray(int* arr, int* brr, int size){

	int crr[size];	
	printf("\n\nMerging arrays: ");
	int j=0;
	for(int i=0;i<size;i++)
		if(i<size/2)
			crr[i]=arr[i];
		else{
			crr[i]=brr[j];
			j++;
		}
	
	for(int i=0;i<size;i++)
		printf("%d ",crr[i]);		
	
}
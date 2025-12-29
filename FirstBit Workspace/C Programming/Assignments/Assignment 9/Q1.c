//Find minimum and maximum number in array.
#include<stdio.h>
void arrayInputOutput(int*, int);
void minMaxOfArray(int*, int);
void main(){
	
	int arr[10];
	
	arrayInputOutput(arr,10);
	minMaxOfArray(arr,10);
		
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
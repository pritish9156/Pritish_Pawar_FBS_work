//Find odd and even among the numbers.
#include<stdio.h>
void arrayInputOutput(int*, int);
void evenOddArray(int*, int);
void main(){
	
	int arr[10];
	
	arrayInputOutput(arr, 10);
	evenOddArray(arr,10);
		
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

void evenOddArray(int* ptr, int size){

	printf("\n\nEven elements: ");
	for(int i=0;i<size;i++)
		if(ptr[i]%2==0)
			printf("\nindex %d: %d ",i,ptr[i]);
	
	printf("\n\nOdd elements: ");
	for(int i=0;i<size;i++)
		if(ptr[i]%2!=0)
			printf("\nindex %d: %d ",i,ptr[i]);
}
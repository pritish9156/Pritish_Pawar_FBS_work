//reverse the given array
#include<stdio.h>
void arrayInputOutput(int*, int);
void reverseArray(int*, int);
void main(){
	
	int arr[10];
	
	arrayInputOutput(arr, 10);
	reverseArray(arr,10);
		
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
	
void reverseArray(int* arr, int size){

	printf("\n\nReversed Array: ");
	int end=size-1;
	for(int i=0;i<end;i++){
		int temp = arr[i];
		arr[i]=arr[end];
		arr[end]=temp;
		end--;
	}
	
	for(int i=0;i<size;i++){
		printf("%d ", arr[i]);
	}
	
}
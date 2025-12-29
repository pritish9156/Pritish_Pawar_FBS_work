//Sort the array.
#include<stdio.h>
void sortArray(int*, int);
void arrayInputOutput(int*, int);
void main(){
	
	int arr[11];
	
	arrayInputOutput(arr, 10);
	sortArray(arr,10);
		
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
	
void sortArray(int* arr, int size){

	for(int i=0;i<size;i++){
		for(int j=i+1;j<size;j++){
			if(arr[i]>arr[j]){
				int n=arr[i];
				arr[i]=arr[j];
				arr[j]=n;
			}
		}	
	}
	
	printf("\n\nSorted array: ");
	for(int i=0;i<size;i++)
		printf("%d ",arr[i]);
		
}
		
//Find sum of all numbers.
#include<stdio.h>
void sumOfElements(int*, int);
void arrayInputOutput(int*, int);

void main(){
	
	int arr[10];
	
	arrayInputOutput(arr, 10);
	sumOfElements(arr,10);
		
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

void sumOfElements(int* ptr, int size)
{
	
	int sum=0;
		
	printf("\nSum or all the elements: ");
	for(int i=0;i<size;i++){
		sum=sum+ptr[i];
	}
	printf("%d",sum);
		
}
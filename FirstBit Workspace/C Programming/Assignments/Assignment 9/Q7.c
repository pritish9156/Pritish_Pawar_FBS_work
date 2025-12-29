/*Take two array and add sum in third array

Example-
arr[5]= {1,2, 3, 4,5}
brr[5]={10,20,30, 40, 50}
crr[5]={11,22,33,44,55}*/
#include<stdio.h>
void arrayInputOutput(int*, int);
void primeNumberArray(int*, int);
void sumOfArrayInThird(int*, int*, int);
void main(){
	
	int arr[5], brr[5];
	
	arrayInputOutput(arr, 5);
	arrayInputOutput(brr, 5);
	sumOfArrayInThird(arr, brr, 5);
		
}	

void arrayInputOutput(int* ptr, int size){
	
	//storing numbers in a array
	printf("Enter 10 numbers to store in a array:\n ");
	for(int i=0;i<size;i++)
		scanf("%d",&ptr[i]);
		
	printf("\nYour array: ");
	for(int i=0;i<size;i++)
		printf("%d ",ptr[i]);
		
	printf("\n");
}
	

void sumOfArrayInThird(int* arr, int* brr, int size){

    int crr[5];
    
	//sum in third array
	printf("\n\nThird array: ");
	for(int i=0;i<size;i++){
		crr[i]=arr[i]+brr[i];
		printf("%d ",crr[i]);
	}
		
}
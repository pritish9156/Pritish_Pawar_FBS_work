//Accept array and print only prime numbers of array.
#include<stdio.h>
void arrayInputOutput(int*, int);
void primeNumberArray(int*, int);
void main(){
	
	int arr[10];
	
	arrayInputOutput(arr, 10);
	primeNumberArray(arr,10);
		
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

void primeNumberArray(int* ptr, int size){

	printf("\n\nPrime elements from array: ");
	for(int i=0;i<size;i++){
		int flag=0;
		if(ptr[i]!=1){
		
			for(int j=2;j<ptr[i];j++){
				if(ptr[i]%j==0){
					flag=1;
					break;
				}
			}
			if(flag==0)
				printf("\nindex %d: %d ",i,ptr[i]);
		}
	}		
}
//Search the given number in array.
#include<stdio.h>
void searchArray(int*, int);
void arrayInputOutput(int*, int);

void main(){
	
	int arr[10];
	
	arrayInputOutput(arr,10);
	searchArray(arr,10);
		
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

void searchArray(int* ptr, int size){
	
	int num, flag=0, flag1=0;
		
	printf("\nEnter number to search in a array: ");
	scanf("%d",&num);
	for(int i=0;i<size;i++){
		if(num==ptr[i]){
			flag=1;
		}
		if(flag==1){
			printf("\nNumber found at index %d: %d",i,ptr[i]);
			flag1=1;
		}
		flag=0;
	}
	
	if(flag1==0)
		printf("\nNumber not present in a array");

}
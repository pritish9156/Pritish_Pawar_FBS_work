//Search the given number in array.
#include<stdio.h>
#include<stdlib.h>
int* storeArrayInHeap();
void searchArray(int*, int);
void main(){
	
	int* arr = storeArrayInHeap();
		
	searchArray(arr,10);
	
}

int* storeArrayInHeap(){
	int* res = (int*)malloc(10*sizeof(int));
	
	//storing numbers in a array
	printf("Enter 10 numbers to store in a array: ");
	for(int i=0;i<10;i++)
		scanf("%d",&res[i]);
		
	printf("\nYour array: ");
	for(int i=0;i<10;i++)
		printf("%d ",res[i]);
		
	return res;
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
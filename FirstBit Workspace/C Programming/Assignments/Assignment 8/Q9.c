//reverse the given array
#include<stdio.h>
void main(){
	int arr[5];
	
	printf("Enter the elements in the array: ");
	for(int i=0;i<5;i++){
		scanf("%d", &arr[i]);
	}
	
	printf("\n\nArray: ");
	for(int i=0;i<5;i++){
		printf("%d ", arr[i]);
	}
	
	printf("\n\nReversed Array: ");
	int end=4;
	for(int i=0;i<end;i++){
		int temp = arr[i];
		arr[i]=arr[end];
		arr[end]=temp;
		end--;
	}
	
	for(int i=0;i<5;i++){
		printf("%d ", arr[i]);
	}
	
}
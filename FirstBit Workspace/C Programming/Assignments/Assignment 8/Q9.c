//Reverse the given array
#include<stdio.h>
void reverseArray(int[], int);
void main(){
	
	int arr[10];
	
	//storing numbers in a array
	printf("Enter 10 numbers to store in a array: ");
	for(int i=0;i<10;i++)
		scanf("%d",&arr[i]);
		
	printf("\nYour array: ");
	for(int i=0;i<10;i++)
		printf("%d ",arr[i]);
		
	int n = sizeof(arr) / sizeof(arr[0]);
		
	reverseArray(arr,n);
		
	printf("\n\nReversed Array: ");
	for(int i=0;i<10;i++)
		printf("%d ",arr[i]);
		
		
}

void reverseArray(int arr[], int size) {
    int start = 0;
    int end = size - 1;
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        start++;
        end--;
    }
}
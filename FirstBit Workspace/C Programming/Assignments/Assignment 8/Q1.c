//Find minimum and maximum number in array.
#include<stdio.h>
void main(){
	
	int arr[10], max, min;
	
	//storing numbers in a array
	printf("Enter 10 numbers to store in a array: ");
	for(int i=0;i<10;i++)
		scanf("%d",&arr[i]);
		
	printf("\nYour array: ");
	for(int i=0;i<10;i++)
		printf("%d ",arr[i]);
		
	//finding max and min number from the array
	max=arr[0];
	min=arr[0];
	for(int i=0;i<10;i++){
		if(arr[i]>=max)
			max=arr[i];
		
		if(arr[i]<=min)
			min=arr[i];
	}
	
	printf("\nMaximum number from your array is: %d",max);
	printf("\nMinimum number from your array is: %d",min);
}
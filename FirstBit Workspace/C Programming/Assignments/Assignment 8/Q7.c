/*Take two array and add sum in third array

Example-
arr[5]= {1,2, 3, 4,5}
brr[5]={10,20,30, 40, 50}
crr[5]={11,22,33,44,55}*/

#include<stdio.h>
void main(){
	
	int arr[5], brr[5], crr[5];
	
	//storing numbers in 1st array
	printf("Storing elements for 1st array");
	printf("\nEnter 5 numbers to store in a array: ");
	for(int i=0;i<5;i++)
		scanf("%d",&arr[i]);
		
	//storing numbers in 2nd array
	printf("\n\nStoring elements for 2nd array");
	printf("\nEnter 5 numbers to store in a array: ");
	for(int i=0;i<5;i++)
		scanf("%d",&brr[i]);
		
	//printing 2 arrays
	printf("\nFirst array: ");
	for(int i=0;i<5;i++)
		printf("%d ",arr[i]);
		
	printf("\nSecond array: ");
	for(int i=0;i<5;i++)
		printf("%d ",brr[i]);
		
	//sum in third array
	printf("\n\nThird array: ");
	for(int i=0;i<5;i++){
		crr[i]=arr[i]+brr[i];
		printf("%d ",crr[i]);
	}
		
}
//Sort the array.
#include<stdio.h>
void main(){
	
	int arr[10], n;
	
	//storing numbers in a array
	printf("Enter 10 numbers to store in a array: ");
	for(int i=0;i<10;i++)
		scanf("%d",&arr[i]);
		
	printf("\nYour array: ");
	for(int i=0;i<10;i++)
		printf("%d ",arr[i]);
		
	
	for(int i=0;i<10;i++){
		for(int j=i+1;j<10;j++){
			if(arr[i]>arr[j]){
				n=arr[i];
				arr[i]=arr[j];
				arr[j]=n;
			}
		}	
	}
	
	printf("\n\nSorted array: ");
	for(int i=0;i<10;i++)
		printf("%d ",arr[i]);
		
}
		
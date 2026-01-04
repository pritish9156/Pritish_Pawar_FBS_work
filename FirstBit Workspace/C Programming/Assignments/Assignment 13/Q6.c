//Accept array and print only prime numbers of array.
#include<stdio.h>
void main(){
	
	int arr[10];
	
	//storing numbers in a array
	printf("Enter 10 numbers to store in a array: ");
	for(int i=0;i<10;i++)
		scanf("%d",&arr[i]);
		
	printf("\nYour array: ");
	for(int i=0;i<10;i++)
		printf("%d ",arr[i]);

	printf("\n\nPrime elements from array: ");
	for(int i=0;i<10;i++){
		int flag=0;
		if(arr[i]!=1){
		
			for(int j=2;j<arr[i];j++){
				if(arr[i]%j==0){
					flag=1;
					break;
				}
			}
			if(flag==0)
				printf("\nindex %d: %d ",i,arr[i]);
		}
	}		
}
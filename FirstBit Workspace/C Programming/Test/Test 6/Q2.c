//write a program in c to find two maximum number in array
#include<stdio.h>
void main(){
	int arr[] = {1,2,10,4,5};
	
	int firstMax=arr[0], secondMax=arr[0];
	for(int i=0; i<5; i++){
		if(arr[i]>firstMax)
			firstMax=arr[i];
		for(int j=0; j<5; j++){
			if(arr[j]<firstMax)
				secondMax=arr[j];
		}
	}
	printf("first Max: %d, second Max: %d",firstMax,secondMax);
}
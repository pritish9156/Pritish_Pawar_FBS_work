//write a program in c to find two maximum number in array
#include<stdio.h>
void main(){
	int arr[] = {110,40,12,350,5};
	
	int firstMax, secondMax, arraylen;
	
	arraylen = sizeof(arr)/sizeof(arr[0]);
	
	for(int i=0; i<arraylen; i++){
		for(int j=i+1; j<arraylen; j++){
			if(arr[i]>=arr[j]){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}

	firstMax = arr[arraylen-1];
	secondMax = arr[arraylen-2];
	
	printf("\nfirst Max: %d, second Max: %d",firstMax,secondMax);
}
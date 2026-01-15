//structure using array pointer
#include<stdio.h>
typedef struct distance{
	int feet;
	int inch;
}distance;

void storeDistance(distance* array,int size){
	for(int i=0; i<size; i++){
		printf("Enter feet: ");
		scanf("%d",&array[i].feet);
		printf("Enter inch: ");
		scanf("%d",&array[i].inch);
		printf("\n");
	}
}

void displayDistance(distance* array,int size){
	for(int i=0; i<size; i++){
		printf("\nfeet: %d ",array[i].feet);
		printf("inch: %d\n",array[i].inch);	
	}
	printf("\n address size of array inside func %d",array);
}
void main(){
	distance arr[10];
	printf("address of array in main %d\n",arr);
	
	//storing details
	storeDistance(arr,3);
	
	//displaying details
	displayDistance(arr,3);
}
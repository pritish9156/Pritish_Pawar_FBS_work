// using fuction(store, display)
#include<stdio.h>
typedef struct distance{
	int feet;
	int inch;
}distance;

void storeDistance(distance* dist){
		printf("Enter feet: ");
		scanf("%d",&dist->feet);
		printf("Enter inch: ");
		scanf("%d",&dist->inch);
		printf("\n");
}

void displayDistance(distance* dist){
		printf("\nfeet: %d ",dist->feet);
		printf("inch: %d\n",dist->inch);	
}

void main(){
	distance d1,d2;
	
	//storing details
	storeDistance(&d1);
	storeDistance(&d2);
	
	//displaying details
	displayDistance(&d1);
	displayDistance(&d2);
}
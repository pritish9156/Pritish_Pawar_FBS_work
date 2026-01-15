// using fuction(store, display) -> pass by value
#include<stdio.h>
typedef struct distance{
	int feet;
	int inch;
}distance;

distance storeDistance(distance dist){
		printf("Enter feet: ");
		scanf("%d",&dist.feet);
		printf("Enter inch: ");
		scanf("%d",&dist.inch);
		printf("\n");
		return dist;
}

void displayDistance(distance dist){
		printf("\nfeet: %d ",dist.feet);
		printf("inch: %d\n",dist.inch);	
}

void main(){
	distance d1,d2;
	
	//storing details
	d1=storeDistance(d1);
	d2=storeDistance(d2);
	
	//displaying details
	displayDistance(d1);
	displayDistance(d2);
}
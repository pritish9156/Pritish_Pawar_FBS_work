//Write a C program to convert given minutes into hours and remaining minutes. (1hours = 60minutes)

#include<stdio.h>

void convertMinToHours(int*, int*, int*);
void main(){
	
	//initialization
	int minutes = 250;
	//declaration
	int hours, rmin;
	
	convertMinToHours(&minutes,&hours,&rmin);
	
	//printing output
	printf("After converting %d minutes into hours :\n",minutes);
	printf("%d hours and %d minutes",hours, rmin);
	
}

void convertMinToHours(int* minutes,int* hours,int* rmin){

	//performing operations
	*hours = *minutes / 60;
	*rmin = *minutes % 60;
	
}


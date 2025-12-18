//Write a C program to convert given minutes into hours and remaining minutes. (1hours = 60minutes)

#include<stdio.h>

void convertMinToHours(int);
void main(){
	
	//initialization
	int minutes = 250;
	
	convertMinToHours(minutes);
	
}

void convertMinToHours(int minutes){
	
	//declaration
	int hours, rmin;
	
	//performing operations
	hours = minutes / 60;
	rmin = minutes % 60;
	
	//printing output
	printf("After converting %d minutes into hours :\n",minutes);
	printf("%d hours and %d minutes",hours, rmin);
	
}


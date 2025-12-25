//Write a C program to convert temperature from Celsius to Fahrenheit using the formula: F = (C *9/5) + 32

#include<stdio.h>

void convertTemperature(float*, float*);
void main(){
	
	//initialization
	float celsius = 3;
	//declaration
	float fahrenheit;
	
	convertTemperature(&celsius, &fahrenheit);
	
	//displaying result on output screen
	printf("Temperature in celsius is %.1f degrees\n",celsius);
	printf("Temperature after conversion in fahrenheit is %.1f degrees",fahrenheit);
}

void convertTemperature(float* celsius, float* fahrenheit){
	
	//performing operation to obtain operational value
	*fahrenheit = (*celsius * 1.8) + 32;
		
}


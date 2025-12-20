//Write a C program to convert temperature from Celsius to Fahrenheit using the formula: F = (C *9/5) + 32

#include<stdio.h>

void convertTemperature();
void main(){
	
	convertTemperature();
}

void convertTemperature(){
	
	//initialization
	float celsius = 3;
	
	//declaration
	float fahrenheit;
	
	//performing operation to obtain operational value
	fahrenheit = (celsius * 1.8) + 32;
	
	//displaying result on output screen
	printf("Temperature in celsius is %.1f degrees\n",celsius);
	printf("Temperature after conversion in fahrenheit is %.1f degrees",fahrenheit);
	
}


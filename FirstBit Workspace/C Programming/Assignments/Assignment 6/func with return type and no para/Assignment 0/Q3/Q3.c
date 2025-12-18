//Write a C program to convert temperature from Celsius to Fahrenheit using the formula: F = (C *9/5) + 32

#include<stdio.h>

float celsiusToFahrenheit();

void main(){
	
printf("%.2f",celsiusToFahrenheit());	

}

float celsiusToFahrenheit(){

	//initialization
	float celsius = 3;
	
	return (celsius * 1.8) + 32;
	
}


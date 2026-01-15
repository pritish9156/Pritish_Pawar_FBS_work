// using fuction(store, display) -> pass by value
#include<stdio.h>

typedef struct complex{
	int real;
	int imaginary;
}complex;

complex storeComplex(complex c1){
	printf("Enter real number: ");
	scanf("%d",&c1.real);
	printf("Enter imaginary number: ");
	scanf("%d",&c1.imaginary);
	return c1;
}

void displayComplex(complex c1){
	printf("\n\ncomplex number: %d+%di",c1.real,c1.imaginary);
}
void main(){
	complex c1,c2;
	c1=storeComplex(c1);
	c2=storeComplex(c2);
	
	displayComplex(c1);
	displayComplex(c2);
}
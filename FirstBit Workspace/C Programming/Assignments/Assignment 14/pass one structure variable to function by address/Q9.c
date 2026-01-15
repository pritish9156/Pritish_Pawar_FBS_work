//complex(real, imaginary)
#include<stdio.h>

typedef struct complex{
	int real;
	int imaginary;
}complex;

void storeComplex(complex* c1){
	printf("Enter real number: ");
	scanf("%d",&c1->real);
	printf("Enter imaginary number: ");
	scanf("%d",&c1->imaginary);
}

void displayComplex(complex* c1){
	printf("\n\ncomplex number: %d+%di",c1->real,c1->imaginary);
}
void main(){
	complex c1;
	storeComplex(&c1);
	displayComplex(&c1);
}
//complex(real, imaginary) structure using pointer
#include<stdio.h>

typedef struct complex{
	int real;
	int imaginary;
}complex;

void storeComplex(complex* c1, int size){
	for(int i=0; i<size; i++){
		printf("Enter real number: ");
		scanf("%d",&c1[i].real);
		printf("Enter imaginary number: ");
		scanf("%d",&c1[i].imaginary);
		printf("\n");
	}
}

void displayComplex(complex* c1, int size){
	for(int i=0; i<size; i++){
		printf("\n\ncomplex number: %d+%di",c1[i].real,c1[i].imaginary);
	}
}

void main(){
	complex c1[3];
	storeComplex(c1,3);
	displayComplex(c1,3);
}
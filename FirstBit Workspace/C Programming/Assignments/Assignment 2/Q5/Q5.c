/*Accept the price from user. Ask the user if he is a student (user may say y or n). If he
is a student and he has purchased more than 500 than discount is 20% otherwise
discount is 10%.But if he is not a student then if he has purchased more than 600
discount is 15% otherwise there is not discount.*/

#include<stdio.h>

void main(){
	
	//variable declaration and initialization
	float price, total, discount = 0;
    char stud;
	
	//taking input
	printf("Enter Price: ");
	scanf("%f",&price);
	printf("\nAre you student (y or n): ");
	scanf(" %c",&stud);
	
	//applying conditions
	if(stud == 'y' || stud == 'Y'){
		if(price > 500){
			discount = 0.20;
			printf("\nCongratulations you are eligible for %.f%% discount offer",discount*100);
			total = price - (discount * price);
		}else{
			discount = 0.10;
			printf("\nCongratulations you are eligible for %.f%% discount offer",discount*100);
			total = price - (discount * price);
		}	
	}else{
		if(price>600){
			discount = 0.15;
			printf("\nCongratulations you are eligible for %.f%% discount offer",discount*100);
			total = price - (discount * price);
		}else{
			total = price;
		}
	}
	
	//printing output
	printf("\n\nBill:");
	printf("\n_____________________________");
	printf("\nPrice: %.2f",price);
	printf("\nDiscount: %.f%%",discount*100);
	printf("\n-----------------------------");
	printf("\nTotal: %.2f",total);
	printf("\n-----------------------------");
	
}

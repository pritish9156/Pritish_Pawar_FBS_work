/*Calculating total salary based on basic. If basic <=5000 da, ta and hra will be
10%,20% and 25% respectively otherwise da, ta and hra will be 15%,25% and 30% respectively.
DA (Dearness Allowance)  TA (Travel Allowance)  HRA (House Rent Allowance)*/

#include<stdio.h>

void calculateTotal(int);
void main(){
	
	//variable declaration and initialization
	int basicSal = 12839;
	
	calculateTotal(basicSal);
}

void calculateTotal(int basicSal){

    float da, ta, hra, totalSal, daPercentage, taPercentage, hraPercentage;
	
	//applying logic
	if(basicSal <=5000){
	    //storing percentages in different variables to use on the output screen	
		daPercentage = 0.10;
		taPercentage = 0.20;
		hraPercentage = 0.25;
		
		//calculating da, ta, and hra according to the condition
		da = basicSal * daPercentage;
		ta = basicSal * taPercentage;
		hra = basicSal * hraPercentage;	
	}
	else{
		daPercentage = 0.15;
		taPercentage = 0.25;
		hraPercentage = 0.30;
		
		da = basicSal * daPercentage;
		ta = basicSal * taPercentage;
		hra = basicSal * hraPercentage;
	}
	
	//calculating total salary
	totalSal = basicSal + da+ ta + hra;
	
	//printing output
	printf("Salary Slip : ");
	printf("\n______________________________");
	printf("\n\nBasic Salary: %drs",basicSal);
	printf("\nDearness Allowance(%.f%%): %.2frs",daPercentage*100, da);
	printf("\nTraval Allowance(%.f%%): %.2frs",taPercentage*100, ta);
	printf("\nHouse Rent Allowance(%.f%%): %.2frs",hraPercentage*100, hra);
	printf("\n---------------------------------------");
	printf("\nTotal Cost to Company: %.2frs",totalSal);
	printf("\n---------------------------------------");
	
}



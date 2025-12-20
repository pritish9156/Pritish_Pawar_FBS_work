/*Calculating total salary based on basic. If basic <=5000 da, ta and hra will be
10%,20% and 25% respectively otherwise da, ta and hra will be 15%,25% and 30% respectively.
DA (Dearness Allowance)  TA (Travel Allowance)  HRA (House Rent Allowance)*/

#include<stdio.h>

float totalSal();
void main(){

    printf("\nTotal Cost to Company: %.2frs",totalSal());	
}
	
float totalSal(){

	//variable declaration and initialization
	int basicSal = 12839;
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
	
    return totalSal;
	
}



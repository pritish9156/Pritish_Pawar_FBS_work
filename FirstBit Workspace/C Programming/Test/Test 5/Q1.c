//wap to calculate selling price of a book based on cost price and the 
//discount using function and nested if else

#include<stdio.h>
float calculate_selling_price(float);
void main()
{
	float base_price = 1000, total;
	total = calculate_selling_price(base_price);
	printf("Selling Price: %.2f",total);
	
}

float calculate_selling_price(float base_price){
	float selling_price;
	if(base_price>=2000)
		selling_price = base_price - (0.50*base_price);
	else if(base_price>=5000)
		selling_price = base_price - (0.50*base_price);
	else if(base_price>=10000)
		selling_price = base_price - (0.50*base_price);
	else
		selling_price = base_price;
		
	return selling_price;
}
/*to calculate electricity bill.
For 1-50 units – 30 rs/unit , For 51-150 units – 40 rs/unit, For 151and above units –
50 rs/unit.*/

#include<stdio.h>
void main(){
	int units = 1000, totalBill=0;
	
	if(units>0)
		if(units<51)
			totalBill = units*30;
		else if(units<151)
			totalBill = (50*30)+(units-50)*40;
		else
			totalBill = (50*30)+(100*40)+(units-150)*50;
 	
    printf("TotalBill = %drs",totalBill);
}
//Print armstrong numbers in the given range 1 to n.

#include<stdio.h>

void armstrong(int);
void main(){
	
	int n = 2000;
	armstrong(n);
}

void armstrong(int n){
	
	for(int i=1; i<=n; i++){
		int orig = i, temp = i, digit = 0;
		while(temp>0){
	    	temp = temp/10;
	    	digit++;
	    }
	    
	    int num = i, sum=0;
	    while(num > 0){
	    	int power = 1;
	    	int r1 = num%10;
	    	
	    	for(int i = 1; i <= digit; i++)
	    		power = power * r1;
			
			sum = sum + power;
			num = num/10;	
		}
		
		if(orig==sum)
			printf("%d\n",orig);  
	}
    	
}
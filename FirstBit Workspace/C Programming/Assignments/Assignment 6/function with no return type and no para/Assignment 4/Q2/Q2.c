//Print prime numbers in the given range 1 to n.

#include<stdio.h>
void isPrime();
void main(){
	
	isPrime();
}

void isPrime(){

	int n = 20;
	
	for(int i=1; i<=20; i++){
		int flag = 0;
		for(int j=2; j<i; j++){
			if(i%j==0){
			    flag=1;
				break;	
			}			
		}	
		if(i==1)
			continue;		
	    else if(flag==0)
	    	printf("%d\n",i);
	}
} 
  
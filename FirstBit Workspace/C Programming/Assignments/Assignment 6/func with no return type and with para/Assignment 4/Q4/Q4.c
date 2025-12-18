//Print strong numbers in the given range 1 to n.
#include<stdio.h>

void isStrong(int);
void main(){
	
	int n=50000;
	
	isStrong(n);
}

void isStrong(int n){
	
	for(int i=1; i<=n; i++){
		int temp=i, sum=0;
		
		while(temp>0){
			int r1=temp%10;
			
			int fact=1;
			for(int j=1; j<=r1; j++)
				fact=fact*j;
			
			sum=sum+fact;
			temp = temp/10;	
		}
		
		if(sum==i)
			printf("%d\n",i);
	}
}
// int n = 5 -> 1+11+111+1111+11111;
#include<stdio.h>
void main(){
	int n=4, temp=1, res=0;
	
	for(int i=1; i<=n; i++){
		res = res * 10 + temp;
		if(i!=n)
			printf("%d+",res);
		else 
			printf("%d",res);
	}
}

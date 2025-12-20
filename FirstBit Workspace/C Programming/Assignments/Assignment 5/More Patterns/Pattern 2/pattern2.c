#include<stdio.h>

void main(){
	
	int n=6,p=10;
	
	for(int i=3; i>0; i--){
		for(int j=1; j<=i; j++){
				printf("  ");
		}
		
		for(int k=1; k<=n; k++){
			if(i==3||k==1||k==n)
				printf("* ");
			else
			    printf("  ");
		}
		n=n+2;
		printf("\n");
	}
	
	for(int i=1; i<=4; i++){
		for(int j=1; j<=12; j++){
			if(j==1||j==12)
				printf("* ");
		    else
		    	printf("  ");
		}
		printf("\n");
	}
	
	for(int i=1; i<=3; i++){
		for(int j=1; j<=i; j++){
				printf("  ");
		}
		
		for(int k=1; k<=p; k++){
			if(k==1||k==p||i==3)
				printf("* ");
			else
				printf("  ");
		}
		p=p-2;
		printf("\n");
	}
	
	for(int i=5; i>0; i--){
		for(int j=1; j<=9; j++){
			if(j>3)
				printf("* ");
			else
				printf("  ");
		}
		printf("\n");
	}
}
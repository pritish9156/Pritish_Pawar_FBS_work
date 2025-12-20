#include<stdio.h>

void main(){
	int n=10;
	int k=n/2, space=2, c=3, space1=6;
	for(int i=n; i>0; i--){
		for(int j=1; j<=i; j++){
			if(j==k&&i!=n){
					for(int y=1; y<=space; y++){
						printf("  ");
					}
				space = space + 2;
				k--;
			}
			printf("* ");
		}
		printf("\n");
		
		i--;
	}
    
	for(int a=4; a<=n; a++){
		for(int b=1; b<=a; b++){
			if(b==c){
				for(int y=1; y<=space1; y++){
						printf("  ");
				}	
				space1=space1-2;
			}
			printf("* ");
		}
		printf("\n");
		a++;
		c++;
	}
}
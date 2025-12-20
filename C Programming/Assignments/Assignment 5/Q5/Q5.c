/*Print an inverted pyramid pattern
Input: n = 5
Output:

 * * * * *
  * * * *
   * * *
    * *
     *

*/

#include<stdio.h>

void main(){
	
	int n = 5;
	int no = 1;
	
	for(int i=n; i>0; i--){
		
	    for(int j=1; j<=i; j++)
	    	printf("* ");	
		printf("\n");
		for(int k=1; k<=no; k++)
			printf(" ");
		no++;
	}
}
/*pyramid pattern
Input: n = 5
Output:
    *
   * *
  * * *
 * * * *
* * * * *

*/

#include<stdio.h>

void main(){
	
	int n = 5;
	int no = n-1;
	
	for(int i=1; i<=n; i++){
		for(int k=1; k<=no; k++)
			printf(" ");
		no--;
	    for(int j=1; j<=i; j++)
	    	printf("* ");	
		printf("\n");
	}
}
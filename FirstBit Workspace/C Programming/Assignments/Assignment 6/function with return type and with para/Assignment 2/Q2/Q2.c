//Accept three sides of a triangle from the user and determine whether the triangle is equilateral, isosceles, or scalene.
/*all three sides (let's call them 'a', 'b', and 'c').
Equilateral: If a = b = c (all three are identical).
Isosceles: If exactly two sides are equal (e.g., a = b, but b != c).
Scalene: If no sides are equal (a != b, b != c, a != c).*/

#include<stdio.h>

int checkTriangleType(int,int,int);
void main(){

	//variable declaration
	int s1,s2,s3;

	//taking input from the user
	printf("Enter three sides of a triangle : ");
	scanf("%d%d%d",&s1,&s2,&s3);

    int result = checkTriangleType(s1,s2,s3);
    
    if(result==1)
    	printf("Triangle is equilateral");
	else if(result==0)
	    printf("Triangle is Isosceles");
	else
	    printf("Triangle is Scalene");
}
	
int checkTriangleType(int s1, int s2, int s3){

	//applying condition
	if(s1==s2 && s2==s3)
		return 1;
	else if(s1==s2 && s2!=s3 || s2==s3 && s3!=s1 || s3==s1 && s1!=s2)
		return 0;
	
}



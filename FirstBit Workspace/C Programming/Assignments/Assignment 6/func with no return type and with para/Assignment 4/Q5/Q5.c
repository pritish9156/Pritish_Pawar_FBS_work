/*Write a menu driven program to take a number for user and perform operations as follows.
Press 1.To check number is even or odd.
2.To check number is prime or not.
3.To check number is pallindrome or not.
4.To check number is positive, negative or zero.
5.To reverse a number.
6.To find sum of digits.*/

#include<stdio.h>

void main(){
	
	int choice=0, num;
	
	while(choice!=7){
		printf("\n-----------------------------------------------------\n");
		printf("1.To check number is even or odd.\n2.To check number is prime or not.\n");
		printf("3.To check number is pallindrome or not.\n4.To check number is positive, negative or zero.\n");
		printf("5.To reverse a number.\n6.To find sum of digits.\n7.Exit\n");
		printf("\nPlease Enter Your Choice: ");
		scanf("%d",&choice);
		printf("______________________________________________________\n");
		
		if(choice !=7 && choice == 1||choice == 2||choice == 3||choice == 4||choice == 5||choice == 6){
			printf("\n\nEnter a number: ");
		    scanf("%d",&num);	    
		}
		
		if(choice == 1){	
			printf("\n=============================================\n");
			printf("      1.To check number is even or odd");
			printf("\n=============================================\n\n");
			printf("Entered number is: %d\n",num);
			
			if(num%2==0)
				printf("Entered number is an even number\n\n");
			else
				printf("Entered number is an odd number\n\n");
			
		}else if(choice == 2){
			int flag=0;
			
			printf("\n=============================================\n");
			printf("      2.To check number is prime or not");
			printf("\n=============================================\n\n");
			printf("Entered number is: %d\n",num);
			
			for(int i=2; i<num; i++){
				if(num%i==0){
					flag=1;
					break;
				}
			}
			
			if(flag==0)
				printf("Entered number is a prime number\n\n");
			else
				printf("Entered number is not an prime number\n\n");
			
			
		}else if(choice == 3){
			int origNum, reverseNum=0;
			
			printf("\n=============================================\n");
			printf("    3.To check number is pallindrome or not");
			printf("\n=============================================\n\n");
			printf("Entered number is: %d\n",num);
			origNum = num;
			
			while(num>0){
				int r1 = num%10;
				reverseNum = reverseNum * 10 + r1;
				num = num/10;
			}
			
			if(origNum==reverseNum)
				printf("Entered Number is an Pallindrome number\n\n");
			else
				printf("Entered Number is not an Pallindrome number\n\n");
			
			
		}else if(choice == 4){
			printf("\n==================================================\n");
			printf("   4.To check number is positive, negative or zero");
			printf("\n==================================================\n\n");
			printf("Entered number is: %d\n",num);
			
			if(num>0)
				printf("%d is an Positive number\n\n",num);
			else if(num<0)
				printf("%d is an Negative number\n\n",num);	
			else
				printf("Zero is entered\n\n");
			
			
		}else if(choice == 5){
			int reverseNum=0, origNum;
			
			printf("\n==================================\n");
			printf("        5.To reverse a number");
			printf("\n==================================\n\n");
			printf("Entered number is: %d\n",num);
			origNum = num;
			
			while(num>0){
				int r1 = num%10;
				reverseNum = reverseNum * 10 + r1;
				num = num/10;
			}
			
			printf("Reverse of %d is %d\n\n",origNum, reverseNum);
			
		}else if(choice == 6){
			int origNum, sum=0;
			
			printf("\n==================================\n");
			printf("      6.To find sum of digits");
			printf("\n==================================\n\n");
			printf("Entered number is: %d\n",num);
			origNum = num;
			
			while(num>0){
				int r1 = num%10;
				sum = sum + r1;
				num = num/10;
			}
			
			printf("Sum of digit %d is %d\n\n",origNum, sum);
			
		}else if(choice == 7)
		    printf("\nYou are successfully exited.");
		else
			printf("\nYour choice is not correct. Please Try Again..\n\n");
	}
}
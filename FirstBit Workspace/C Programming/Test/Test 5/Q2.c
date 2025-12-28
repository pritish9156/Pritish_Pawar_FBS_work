// wap to initiallize some amount in your account and deposite and withdraw. withdraw condition(balance>3000)
#include<stdio.h>
void main(){
	int account_balance = 10000;
	int ch;
	
	do{
		printf("\n\n1.check balace\n2.withdraw\n3.deposit\n4.exit");
		printf("\n\nEnter Your choice: ");
		scanf("%d", &ch);
		
		if(ch==1){
			printf("\nCurrent Balace: %d",account_balance);
		}else if(ch==2){
			int withdraw_amount;
			
			printf("\nEnter amount to withdraw: ");
			scanf("%d", &withdraw_amount);
			if(account_balance>3000&&withdraw_amount<=account_balance){
				account_balance = account_balance-withdraw_amount;
				printf("\nAmount withdraw sucssesfull");
			}else{
				printf("\nInsufficient balance for withdraw");
			}
		}else if(ch==3){
			int deposite_amount;
			printf("\nEnter amount to deposite: ");
			scanf("%d", &deposite_amount);
				
			account_balance = account_balance+deposite_amount;
			printf("\nAmount deposite sucssesfull");
			
		}else if(ch==4){
			printf("\nexited sucssesfully");
		}
	}while(ch!=4);
}
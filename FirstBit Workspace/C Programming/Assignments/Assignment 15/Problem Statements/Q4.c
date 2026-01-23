/*Point to Sale System: Build a simple point of sale system using structures to
represent products with attributes like name, price, and quantity. Allow users
to add items to a cart and calculate the total cost.*/

#include<stdio.h>
#include<string.h>
#include<stdlib.h>

//product structure
typedef struct Product{
	int pid;
	char name[40];
	float price;
	int stock;
	float discount;
	float taxRate; //sgst + cgst
}Product;

//customer structure
typedef struct CustDetails{
	int custId;
	int mobileNo;
	char email[40];
	char address[40];
}CustDetails;

//function to add customer
void addProduct(Product* product, int productQuantity, int* currentIndex, int productAddFlow){
	
		scanf("%d",&productQu
			fflush(stdin);
			printf("Enter Price: ");
			scanf("%f",&product[i].price);
			printf("Number of stock: ");
			scanf("%d",&product[i].stock);
			printf("Discount on Product: ");
			scanf("%f",&product[i].discount);
			product[i].taxRate=0.18;
			printf("\n");	
		}
		
	}else{
			scanf("%d",&product[i].pid);
			printf("Enter Product Name: ");
			fflush(stdin);
			gets(product[i].name);
				printf("Enter Price: ");
			printf("Number of stock: ");
		
	
}
 

void addSingleProduct(Product* product, int productQuantity ,int* currentIndex){
	int i=*currentIndex;
	int newSize = *currentIndex + productQuantity;
	printf("%d",i);
	while(i<newSize){
		*currentIndex += 1;
		printf("\nEnter Product Id: ");
		scanf("%d",&product[i].pid);
		printf("Enter Product Name: ");
		fflush(stdin);
		gets(product[i].name);
		fflush(stdin);
		printf("Enter Price: ");
		scanf("%f",&product[i].price);
		printf("Number of stock: ");
		scanf("%d",&product[i].stock);
		printf("Discount on Product: ");
		scanf("%f",&product[i].discount);
		product[i].taxRate=0.18;
		printf("\n");
		i++;
	}
}
void main(){
	char username[10], password[10];
	
	printf("Enter Username: ");
	scanf("%s",username);
	printf("Enter Password: ");
	scanf("%s",password);
	
	if(strcasecmp(username,"admin")==0 && strcasecmp(password,"admin")==0){
		
		system("cls");
		printf("\t\t|===========================================================================|\n");
		printf("\t\t|\t\t\t\tAdmin Department\t\t\t    |\n");
		printf("\t\t|===========================================================================|\n"); 
		
		int choice, productAddFlow=0;
		int productQuantity, currentIndex=0;
		Product* product = NULL;
		
		do{
			
			if(productAddFlow==0)
				printf("\n\t1.Add Product");
			else
				printf("\n\t1.Add Single Product");
				
			printf("\n\t2.Display Product\n\t3.Remove Product\n\t4.Update Product\n\t5.Exit");
			printf("\n\nEnter Your Choice: ");
			scanf("%d",&choice);
			
			switch(choice){
				case 1:{
					
					if(productAddFlow==0){
						addProduct(product, &currentIndex, productAddFlow);
						productAddFlow=1;
						
					}else{
						
						addProduct(product, &currentIndex, productAddFlow);
					}
					
					break;
				}ase 2:
						printf("\nHow many products do you want to add: ");
						scanf("%d",&productQuantity);
					                      
						printf("\nHow many pr
						productAddFlow=1;oducts do you want to add: ");
						scanf("%d",&productQuantity);
					
						product = (Product*)malloc(productQuantity*sizeof(Product));
					
						product = (Product, productQuantity *realloc(product, productQuantity*sizeof(Product));
					{reak;                                                               
					break;
				}
			}	
			
		}while(choice!=5);    , productQuantity 
		       Single
		
		
		
		
	}else if(strcasecmp(username,"customer")==0 && strcasecmp(password,"customer")==0){
		
		system("cls");
		printf("\t\t|===========================================================================|\n");
		printf("\t\t|\t\tWelcome To EveryBit International Store\t\t\t    |\n\t\t|\t\t   Quality in Every Bit of Product\t\t\t    |");
		printf("\n\t\t|===========================================================================|\n"); 
	
		int choice;
		
		do{
			
			printf("\n\t1.Available Products\n\t2.Add To Cart\n\t3.Checkout\n\t4.exit\n");
			printf("\nEnter Your Choice: ");
			scanf("%d",&choice);
			
			switch(choice){
				case 1:{
					
					break;
				}	
				
				case 2:{
					
					break;
				}
				
				case 3:{
					
					break;
				}
			}
			
		}while(choice!=4);	
		
	}else
		printf("\n\nPassword is Not correct");
}
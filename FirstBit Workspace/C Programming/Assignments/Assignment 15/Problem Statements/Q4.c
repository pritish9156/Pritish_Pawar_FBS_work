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

//function to add hardcoded products
Product* addProductHardcoded(Product* product, int* productQuantity, int* currentIndex, int* productAddFlow, int* arraySize){
	
	*productQuantity = 10;
	
	*arraySize = 10;
	
	product = (Product*)malloc((*productQuantity)*sizeof(Product));
	
	if(product==NULL){
		printf("\n\t----- Fasing Some issue Please Contact Admin -----\n");
		return NULL;
	}
	
		product[0].pid = 1;
		strcpy(product[0].name,"Toothpaste");
		product[0].price = 50;
		product[0].stock = 5;
		product[0].discount = 0;
		product[0].taxRate = 0.18;
		
		product[1].pid = 2;
		strcpy(product[1].name,"Soap");
		product[1].price = 40;
		product[1].stock = 10;
		product[1].discount = 5;
		product[1].taxRate = 0.18;
		
		product[2].pid = 3;
		strcpy(product[2].name,"Shampoo");
		product[2].price = 120;
		product[2].stock = 8;
		product[2].discount = 10;
		product[2].taxRate = 0.18;
		
		product[3].pid = 4;
		strcpy(product[3].name,"Facewash");
		product[3].price = 150;
		product[3].stock = 6;
		product[3].discount = 8;
		product[3].taxRate = 0.18;
		
		product[4].pid = 5;
		strcpy(product[4].name,"Hair Oil");
		product[4].price = 90;
		product[4].stock = 7;
		product[4].discount = 5;
		product[4].taxRate = 0.18;
		
		product[5].pid = 6;
		strcpy(product[5].name,"Body Lotion");
		product[5].price = 200;
		product[5].stock = 4;
		product[5].discount = 12;
		product[5].taxRate = 0.18;
		
		product[6].pid = 7;
		strcpy(product[6].name,"Handwash");
		product[6].price = 80;
		product[6].stock = 9;
		product[6].discount = 6;
		product[6].taxRate = 0.18;
		
		product[7].pid = 8;
		strcpy(product[7].name,"Sanitizer");
		product[7].price = 60;
		product[7].stock = 12;
		product[7].discount = 3;
		product[7].taxRate = 0.18;
		
		product[8].pid = 9;
		strcpy(product[8].name,"Deodorant");
		product[8].price = 220;
		product[8].stock = 5;
		product[8].discount = 15;
		product[8].taxRate = 0.18;
		
		product[9].pid = 10;
		strcpy(product[9].name,"Perfume");
		product[9].price = 500;
		product[9].stock = 3;
		product[9].discount = 20;
		product[9].taxRate = 0.18;	
		
		printf("\n\tHardcoded Values Added...\n");
		
		*currentIndex = 10;	
	
	*productAddFlow = 1;
	
	return product;
}

//add multiple products
Product* addProduct(Product* product, int* productQuantity, int* currentIndex, int* productAddFlow){
	
	printf("\nHow much products you want to add: ");
	scanf("%d", productQuantity);
	
	product = (Product*)malloc((*productQuantity)*sizeof(Product));
	
	if(product==NULL){
		printf("\n\t----- Fasing Some issue Please Contact Admin -----\n");;
		return NULL;
	}
	
	for(int i=0; i<*productQuantity; i++){
		(*currentIndex)++;
		product[i].pid = i+1;
		printf("\nEnter Product Name: ");
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
	}
	
	*productAddFlow = 1;
	
	return product;
}

int addProductByID(Product* product, int i){
	printf("\n\tEnter Detials for the product:");
	printf("\n\t------------------------------\n");
		product[i].pid = i+1;
		printf("\nEnter Product Name: ");
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
		printf("\n\t-----------------------------------");
		printf("\n\t       Product Added");
		printf("\n\t-----------------------------------");
		
		return 1;
}
 
//add single product 
Product* addSingleProduct(Product* product, int* currentIndex, int* arraySize){ 
	
	if(*currentIndex == *arraySize){
		*arraySize = (*arraySize)*2;
		
		Product* temp;
		
		temp = (Product*)realloc(product, (*arraySize)*sizeof(Product)); 
	
		if(temp==NULL){ 
			printf("\n\t----- Fasing Some issue Please Contact Admin -----\n"); 
			return NULL; 
		} 
		
		product = temp;
	}
	
	
	if(addProductByID(product, *currentIndex)){ 
		*currentIndex += 1; 
		return product; 
	} 
	
	return NULL; 	
}

//function to display products
void displayProduct(Product* product, int* currentIndex){
	
	int srNo=0;
	
	if(product==NULL){
		printf("\n\t----- Fasing Some issue Please Contact Admin -----\n");
	}
	else{
	
		printf("\nAviliable Numbers of Products: %d", *currentIndex);
		printf("\n--------------------------------");
		
		for(int i=0; i<*currentIndex; i++){
	
			printf("\n\t---------------------------------");
			printf("\n\t    %d) Product Name: %s", product[i].pid, product[i].name);
			printf("\n\t---------------------------------\n");
			printf("\nEnter Price: %.2f", product[i].price);
			printf("\nNumber of stock: %d", product[i].stock);
			printf("\nDiscount on Product: %.2f", product[i].discount);
			printf("\nTax Rate: %.2f", product[i].taxRate*100);
			printf("\n");
			
		}
		
		printf("\n------------------------------------\n");
	}
}

//function to display product of perticular id
void displayProductById(Product* product, int i){
	
	if(product==NULL){
		printf("\n\t----- Fasing Some issue Please Contact Admin -----\n");
	}
	else{
	
		printf("\n\t---------------------------------");
		printf("\n\t    %d) Product Name: %s", product[i].pid, product[i].name);
		printf("\n\t---------------------------------\n");
		printf("\nEnter Price: %.2f", product[i].price);
		printf("\nNumber of stock: %d", product[i].stock);
		printf("\nDiscount on Product: %.2f", product[i].discount);
		printf("\nTax Rate: %.2f", product[i].taxRate*100);
		printf("\n");
		
	}
}

//search product by id
int searchProductById(Product* product, int currentIndex){
	
	int productId, flag = 0;
				
	printf("\nEnter product id: ");
	scanf("%d", &productId);
				
	for(int i=0; i < currentIndex; i++){
		if(product[i].pid == productId){
			return i;
		}
	}
	
	return -1;
}

//search product by Name
int searchProductByName(Product* product, int currentIndex){
	
	char productName[50];
			
	printf("\nEnter Product Name: ");
	fflush(stdin);
	gets(productName);
	fflush(stdin);
				
	char name[50];
				
	for(int i=0; i < currentIndex; i++){
					
		strcpy(name, product[i].name);
						
		if(strstr(strlwr(name), strlwr(productName)) != NULL){
			return i;
		}
	}
				
    return -1;
}

//function to search product
void searchProduct(Product* product, int currentIndex){
	
	int choice;
	
	do{
		printf("\n\t-------- Search Menu ----------\n");
		printf("\n\t1.Search by Product Id\n\t2.Search with Product Name\n\t3.Back to main Menu\n");
		printf("\nEnter Your Choice: ");
		scanf("%d", &choice);
	
		switch(choice){
			case 1:{
				
				int id = searchProductById(product, currentIndex);
				
				if(id != -1){
					displayProductById(product, id);
					printf("\n\t-------- Product Details Found ----------\n");
				}
				else
					printf("\n\t-------- Product Details Not Found ----------\n");
					
				break;
			}
			
			case 2:{
				
				int id = searchProductByName(product, currentIndex);
				
				if(id != -1){
					displayProductById(product, id);
					printf("\n\t-------- Product Details Found ----------\n");
				}
				else
					printf("\n\t-------- Product Details Not Found ----------\n");
				
				break;
			}
			
			case 3:{
				
				break;
			}
		}
		
	}while(choice!=3);
}

//function to delete product
void deleteProduct(Product* product, int* productAddFlow, int* currentIndex){
	
	int choice;
	
	do{
		printf("\n\t-------- Delete Menu ----------\n");
		printf("\n\t1.Delete by Product Id\n\t2.Delete with Product Name\n\t3.Back to main Menu\n");
		printf("\nEnter Your Choice: ");
		scanf("%d", &choice);
	
		switch(choice){
			case 1:{
				
				int id = searchProductById(product, *currentIndex);
				
				if(id != -1){
					displayProductById(product, id);
					printf("\n\t-------- Product Details Found ----------\n");
					
					char ch;
					
					printf("\nAre you sure you want to delete this product(Y/N): ");
					fflush(stdin);
					scanf("%c", &ch);
					fflush(stdin);
					
					if(ch=='y' || ch=='Y'){
						for(int i=id; i < *currentIndex-1; i++){
							product[i] = product[i+1];
						}
						
						*currentIndex -= 1; 
						
						printf("\n%d\n", *currentIndex);
						
						if(*currentIndex == 0)
							*productAddFlow = 0;
						
						for(int i=0; i < *currentIndex; i++){
							product[i].pid = i+1;
						}
						
						printf("\n\t-----------------------------------------\n");
						printf("\n\t       Product Deleted Successfully\n");
						printf("\n\t-----------------------------------------\n");
					}
				}
				else
					printf("\n\t-------- Product Details Not Found ----------\n");
					
				break;
			}
			
			case 2:{
				
				int id = searchProductByName(product, *currentIndex);
				
				if(id != -1){
					displayProductById(product, id);
					printf("\n\t-------- Product Details Found ----------\n");
					
					char ch;
					
					printf("\nAre you sure you want to delete this product(Y/N): ");
					fflush(stdin);
					scanf("%c", &ch);
					fflush(stdin);
					
					if(ch=='y' || ch=='Y'){
						for(int i=id; i < *currentIndex-1; i++){
							product[i] = product[i+1];
						}
						
						*currentIndex -= 1; 
						
						printf("\n%d\n", *currentIndex);
						
						if(*currentIndex == 0)
							*productAddFlow = 0;
						
						for(int i=0; i < *currentIndex; i++){
							product[i].pid = i+1;
						}
						
						printf("\n\t-----------------------------------------\n");
						printf("\n\t       Product Deleted Successfully\n");
						printf("\n\t-----------------------------------------\n");
					}						
				}
				else
					printf("\n\t-------- Product Details Not Found ----------\n");
				
				break;
			}
			
			case 3:{
				
				break;
			}
		}
		
	}while(choice!=3);
	
}

//function to update product
void updateProduct(Product* product, int* currentIndex){
	
		int choice;
	
	do{
		printf("\n\t-------- Update Menu ----------\n");
		printf("\n\t1.Search with Product Id\n\t2.Search with Product Name\n\t3.Back to main Menu\n");
		printf("\nEnter Your Choice: ");
		scanf("%d", &choice);
	
		switch(choice){
			case 1:{
				
				int id = searchProductById(product, *currentIndex);
				
				if(id != -1){
					displayProductById(product, id);
					printf("\n\t-------- Product Details Found ----------\n");
					
					char ch;
					
					printf("\nAre you sure you want to update this product(Y/N): ");
					fflush(stdin);
					scanf("%c", &ch);
					fflush(stdin);
					
					if(ch=='y' || ch=='Y'){
						int choice;
						
						do{
						
							printf("\nWhich details you want to update\n");
							printf("\n\t1.Product Name\n\t2.Product Price\n\t3.Product Stock Information\n\t4.Discount Rate\n\t5.Tax Rate\n\t6.Exit");
							printf("\nEnter Your Choice: ");
							scanf("%d", &choice);
							printf("\n\tEnter Detials for the product:");
							printf("\n\t------------------------------\n");
							
							switch(choice){
									
								case 1:	{							
									printf("\nEnter Product Name: ");
									fflush(stdin);
									gets(product[id].name);
									fflush(stdin);
									
									printf("\n\t-----------------------------------------\n");
									printf("\n\t       Name Updated Successfully\n");
									printf("\n\t-----------------------------------------\n");
									break;
								}
									
								case 2:{
									printf("\nEnter Price: ");
									scanf("%f",&product[id].price);
									
									printf("\n\t-----------------------------------------\n");
									printf("\n\t     Price Updated Successfully\n");
									printf("\n\t-----------------------------------------\n");									
									break;
								}
									
								case 3:{
									printf("\nNumber of stock: ");
									scanf("%d",&product[id].stock);
									
									printf("\n\t-----------------------------------------\n");
									printf("\n\t  Stock Information Updated Successfully\n");
									printf("\n\t-----------------------------------------\n");									
									break;
								}
									
								case 4:{
									printf("\nEnter Discount Rate for Product: ");
									scanf("%f",&product[id].discount);
									
									printf("\n\t-----------------------------------------\n");
									printf("\n\t    Discount Rate Updated Successfully\n");
									printf("\n\t-----------------------------------------\n");									
									break;
								}
									
								case 5:{
									printf("\nTax Percentage on Product: ");
									scanf("%f",&product[id].taxRate);
									
									printf("\n\t-----------------------------------------\n");
									printf("\n\t     Tax Rate Updated Successfully\n");
									printf("\n\t-----------------------------------------\n");									
									break;
								}
								
								case 6:{
									
									break;
								}
							}
							
						}while(choice!=6);
					}
				}
				else
					printf("\n\t-------- Product Details Not Found ----------\n");
					
				break;
			}
			
			case 2:{
				
				int id = searchProductByName(product, *currentIndex);
				
				if(id != -1){
					displayProductById(product, id);
					printf("\n\t-------- Product Details Found ----------\n");
					
					char ch;
					
					printf("\nAre you sure you want to update this product(Y/N): ");
					fflush(stdin);
					scanf("%c", &ch);
					fflush(stdin);
					
					if(ch=='y' || ch=='Y'){
						int choice;
						
						do{
						
							printf("\nWhich details you want to update\n");
							printf("\n\t1.Product Name\n\t2.Product Price\n\t3.Product Stock Information\n\t4.Discount Rate\n\t5.Tax Rate\n\t6.Exit");
							printf("\nEnter Your Choice: ");
							scanf("%d", &choice);
							printf("\n\tEnter Detials for the product:");
							printf("\n\t------------------------------\n");
							
							switch(choice){
									
								case 1:	{							
									printf("\nEnter Product Name: ");
									fflush(stdin);
									gets(product[id].name);
									fflush(stdin);
									
									printf("\n\t-----------------------------------------\n");
									printf("\n\t       Name Updated Successfully\n");
									printf("\n\t-----------------------------------------\n");
									break;
								}
									
								case 2:{
									printf("\nEnter Price: ");
									scanf("%f",&product[id].price);
									
									printf("\n\t-----------------------------------------\n");
									printf("\n\t     Price Updated Successfully\n");
									printf("\n\t-----------------------------------------\n");									
									break;
								}
									
								case 3:{
									printf("\nNumber of stock: ");
									scanf("%d",&product[id].stock);
									
									printf("\n\t-----------------------------------------\n");
									printf("\n\t  Stock Information Updated Successfully\n");
									printf("\n\t-----------------------------------------\n");									
									break;
								}
									
								case 4:{
									printf("\nEnter Discount Rate for Product: ");
									scanf("%f",&product[id].discount);
									
									printf("\n\t-----------------------------------------\n");
									printf("\n\t    Discount Rate Updated Successfully\n");
									printf("\n\t-----------------------------------------\n");									
									break;
								}
									
								case 5:{
									printf("\nTax Percentage on Product: ");
									scanf("%f",&product[id].taxRate);
									
									printf("\n\t-----------------------------------------\n");
									printf("\n\t     Tax Rate Updated Successfully\n");
									printf("\n\t-----------------------------------------\n");									
									break;
								}
								
								case 6:{
									
									break;
								}
							}	
						}while(choice!=6);
					}					
				}
				else
					printf("\n\t-------- Product Details Not Found ----------\n");
				
				break;
			}
			
			case 3:{
				
				break;
			}
		}
		
	}while(choice!=3);
	
}

void main(){
	char username[10], password[10];
	
//	printf("Enter Username: ");
//	scanf("%s",username);
//	printf("Enter Password: ");
//	scanf("%s",password);

	strcpy(username, "admin");
	strcpy(password, "admin");
	
	if(strcasecmp(username,"admin")==0 && strcasecmp(password,"admin")==0){
		
		system("cls");
		printf("\t\t|===========================================================================|\n");
		printf("\t\t|\t\t\t\tAdmin Department\t\t\t    |\n");
		printf("\t\t|===========================================================================|\n"); 
		
		int choice, productAddFlow=0, arraySize;
		int productQuantity=0, currentIndex=0;
		Product* product = NULL;
		
		do{
			
			printf("\n\t-------- Main Menu ----------\n");
			
			if(productAddFlow==0)
				printf("\n\t1.Add Product");
			else
				printf("\n\t1.Add Single Product");
				
			printf("\n\t2.Display Product\n\t3.Search Product\n\t4.Update Product\n\t5.Remove Product\n\t6.Exit");
			printf("\n\nEnter Your Choice: ");
			scanf("%d",&choice);
			
			switch(choice){
				case 1:{
					if(productAddFlow==0){
						//product = addProduct(product, &productQuantity, &currentIndex, &productAddFlow);
						product = addProductHardcoded(product, &productQuantity, &currentIndex, &productAddFlow, &arraySize);	
							
						if(product==NULL){
							productAddFlow=0;
							printf("\n\t----- Fasing Some issue Please Contact Admin -----\n");
						}
					}else{
						product = addSingleProduct(product, &currentIndex, &arraySize);
						if(product==NULL)
							printf("\n\t----- Fasing Some issue Please Contact Admin -----\n");
					}
					break;
				}
					
				case 2:{
					if(productAddFlow==0)
						printf("\n\t----- Products Not Aviliable to display -----\n");
					else
						displayProduct(product, &currentIndex);
					break;
				}
				
				case 3:{
					if(productAddFlow==0)
						printf("\n\t----- Products Not Aviliable to Search -----\n");
					else
						searchProduct(product, currentIndex);	
					break;
				}
				
				case 4:{
					if(productAddFlow==0)
						printf("\n\t----- Products Not Aviliable to Update -----\n");
					else
						updateProduct(product, &currentIndex);
					break;
				}
				
				case 5:{
					if(productAddFlow==0)
						printf("\n\t----- Products Not Aviliable to Delete -----\n");
					else
						deleteProduct(product, &productAddFlow, &currentIndex);
					break;
				}
			}
			
		}while(choice!=6);		
			
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
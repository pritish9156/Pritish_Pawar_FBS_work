// product(id,name,quantity,price) using structure array pointer dynamic memory allocation

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct Product{
    int id;
    char name[10];
    int quantity;
    int price;
} Product;

void storeProduct(Product* product, int numOfProduct){
    for(int i = 0; i < numOfProduct; i++){
        printf("\nEnter product id: ");
        scanf("%d", &product[i].id);

        printf("Enter product name: ");
        scanf("%s", product[i].name);

        printf("Enter product quantity: ");
        scanf("%d", &product[i].quantity);

        printf("Enter product price: ");
        scanf("%d", &product[i].price);

    }
}

void displayProduct(Product* product, int numOfProduct){
    for(int i = 0; i < numOfProduct; i++){
        printf("\nProduct no %d", i + 1);
        printf("\nProduct id: %d", product[i].id);
        printf("\nProduct name: %s", product[i].name);
        printf("\nProduct quantity: %d", product[i].quantity);
        printf("\nProduct price: %d", product[i].price);
        printf("\n");
    }
}

void storeAsingleProduct(Product* product, int* currentIndex){
    printf("\nEnter product id: ");
    scanf("%d", &product[*currentIndex].id);

    printf("Enter product name: ");
    scanf("%s", product[*currentIndex].name);

    printf("Enter product quantity: ");
    scanf("%d", &product[*currentIndex].quantity);

    printf("Enter product price: ");
    scanf("%d", &product[*currentIndex].price);

    (*currentIndex)++;
}

int searchProduct(Product* product, int numOfProduct, int choiceForSearch){
    int searchId;
    char searchName[20];

    if(choiceForSearch == 1){
        printf("\nEnter Product id: ");
        scanf("%d", &searchId);

        for(int i = 0; i < numOfProduct; i++){
            if(product[i].id == searchId)
                return i;
        }
    }
    else if(choiceForSearch == 2){
        printf("\nEnter product name: ");
        scanf("%s", searchName);

        for(int i = 0; i < numOfProduct; i++){
            if(strcasecmp(product[i].name, searchName) == 0)
                return i;
        }
    }

    return -1;
}

void deleteProduct(Product* product, int* numOfProduct){
    int deleteID;
    printf("\nEnter Id to delete a product: ");
    scanf("%d",&deleteID);
    
    for(int i=0; i<*numOfProduct; i++){
    	if(product[i].id==deleteID){
    		for(int j=i; j<*numOfProduct; j++){
    			product[j]=product[j+1];
			}
			(*numOfProduct)--;
			break;
		}
	}
}

int main(){
    Product* product = NULL;
    int choice, numOfProduct = 0;

    do{
        printf("\n\n1.Add product details\n2.Show all products\n3.Add a single product\n4.Search a product\n5.Delete a product\n6.Exit");
        printf("\nEnter your choice: ");
        scanf("%d", &choice);

        if(choice == 1){
            printf("\nHow many products do you want to add: ");
            scanf("%d", &numOfProduct);

            product = (Product*)malloc(numOfProduct*sizeof(Product));
            if(product == NULL){
                printf("\nMemory allocation failed.");
            }

            storeProduct(product, numOfProduct);
        }

        else if(choice == 2){
            displayProduct(product, numOfProduct);
        }

        else if(choice == 3){
            product = (Product*)realloc(product, (numOfProduct + 1) * sizeof(Product));
            if(product == NULL){
                printf("\nMemory allocation failed.");
            }

            storeAsingleProduct(product, &numOfProduct);
        }

        else if(choice == 4){
            int mode;
            printf("\nEnter 1 to search by ID or 2 to search by Name: ");
            scanf("%d", &mode);

            int index = searchProduct(product, numOfProduct, mode);
            if(index == -1){
                printf("\nProduct not found.");
            }
            else{
                printf("\nProduct Found:");
                printf("\nID: %d", product[index].id);
                printf("\nName: %s", product[index].name);
                printf("\nQuantity: %d", product[index].quantity);
                printf("\nPrice: %d", product[index].price);
            }
        }

        else if(choice == 5){
            deleteProduct(product, &numOfProduct);
        }
        
        else if(choice == 6){
            printf("\n\nExited successfully");
        }

    } while(choice != 6);

    free(product);
    return 0;
}

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

void storeProduct(Product* product, int numOfProduct, int* currentIndex){
    for(int i = 0; i < numOfProduct; i++){
        printf("\nEnter product id: ");
        scanf("%d", &product[*currentIndex].id);

        printf("Enter product name: ");
        scanf("%9s", product[*currentIndex].name);

        printf("Enter product quantity: ");
        scanf("%d", &product[*currentIndex].quantity);

        printf("Enter product price: ");
        scanf("%d", &product[*currentIndex].price);

        (*currentIndex)++;
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
    scanf("%9s", product[*currentIndex].name);

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
        scanf("%19s", searchName);

        for(int i = 0; i < numOfProduct; i++){
            if(strcmp(product[i].name, searchName) == 0)
                return i;
        }
    }

    return -1;
}

void deleteProduct(Product** product, int* numOfProduct){
    int index = searchProduct(*product, *numOfProduct, 1);

    if(index == -1){
        printf("\nProduct not found.");
        return;
    }

    for(int i = index; i < *numOfProduct - 1; i++){
        (*product)[i] = (*product)[i + 1];
    }

    (*numOfProduct)--;

    Product* temp = realloc(*product, (*numOfProduct) * sizeof(Product));
    if(temp != NULL || *numOfProduct == 0){
        *product = temp;
    }

    printf("\nProduct deleted successfully.");
}

int main(){
    Product* product = NULL;
    int choice, currentIndex = 0, numOfProduct = 0;

    do{
        printf("\n\n1.Add product details\n2.Show all products\n3.Add a single product\n4.Search a product\n5.Delete a product\n6.Exit");
        printf("\nEnter your choice: ");
        scanf("%d", &choice);

        if(choice == 1){
            int n;
            printf("\nHow many products do you want to add: ");
            scanf("%d", &n);

            Product* temp = realloc(product, (numOfProduct + n) * sizeof(Product));
            if(temp == NULL){
                printf("\nMemory allocation failed.");
                continue;
            }

            product = temp;
            storeProduct(product, n, &numOfProduct);
            currentIndex = numOfProduct;
        }

        else if(choice == 2){
            displayProduct(product, numOfProduct);
        }

        else if(choice == 3){
            Product* temp = realloc(product, (numOfProduct + 1) * sizeof(Product));
            if(temp == NULL){
                printf("\nMemory allocation failed.");
                continue;
            }

            product = temp;
            storeAsingleProduct(product, &numOfProduct);
            currentIndex = numOfProduct;
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
            deleteProduct(&product, &numOfProduct);
            currentIndex = numOfProduct;
        }
        
        else if(choice == 6){
            printf("\n\nExited successfully");
        }

    } while(choice != 6);

    free(product);
    return 0;
}

//Create a structure Book with data members as bname, id, author, price. Accept the
//values of all these members from user and display them.
#include<stdio.h>
#include<stdlib.h>
typedef struct Book{
	int id;
	char bname[40];
	char author[30];
	float price;
}Book;

//fuction for storing book information
void storeBooksInfo(Book* books, int noOfBooks){
	for(int i=0; i<noOfBooks; i++){
		printf("\n\nEnter details for the book number: %d",i+1);
		printf("\nEnter book id: ");
		scanf("%d",&books[i].id);
		printf("Enter book name: ");
		fflush(stdin);
		gets(books[i].bname);
		fflush(stdin);
		printf("Enter author name: ");
		fflush(stdin);
		gets(books[i].author);
		fflush(stdin);
		printf("Enter price: ");
		scanf("%f",&books[i].price);
		printf("\n");
	}
}

//fuction for displaying book information
void displayBooksInfo(Book* books, int noOfBooks){
	for(int i=0; i<noOfBooks; i++){
		printf("\n\nDetails of book number: %d",i+1);
		printf("\nBook id: %d",books[i].id);
		printf("\nBook name: %s",books[i].bname);
		printf("\nAuthor name: %s",books[i].author);
		printf("\nPrice: %.2frs\n",books[i].price);
	}
}

void main(){
	int noOfBooks;
	Book* bookArray;
	
	printf("How many number of Books you want to store: ");
	scanf("%d",&noOfBooks);
	
	bookArray = (Book*)malloc(noOfBooks*sizeof(Book));
	
	//store books informatin
	storeBooksInfo(bookArray,noOfBooks);
	
	printf("\n============================================\n");
	
	//display books information;
	displayBooksInfo(bookArray,noOfBooks);
}
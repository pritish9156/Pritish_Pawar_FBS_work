//Search the given number in array.
#include<stdio.h>
void main(){
	
	int arr[10], num, flag=0, flag1=0;
	
	//storing numbers in a array
	printf("Enter 10 numbers to store in a array: ");
	for(int i=0;i<10;i++)
		scanf("%d",&arr[i]);
		
	printf("\nYour array: ");
	for(int i=0;i<10;i++)
		printf("%d ",arr[i]);
		
	printf("\nEnter number to search in a array: ");
	scanf("%d",&num);
	for(int i=0;i<10;i++){
		if(num==arr[i]){
			flag=1;
		}
		if(flag==1){
			printf("\nNumber found at index %d: %d",i,arr[i]);
			flag1=1;
		}
		flag=0;
	}
	
	if(flag1==0)
		printf("\nNumber not present in a array");

}
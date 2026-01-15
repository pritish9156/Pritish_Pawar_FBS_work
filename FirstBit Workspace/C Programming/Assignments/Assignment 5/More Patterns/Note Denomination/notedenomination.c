// note denomination

#include<stdio.h>
void main(){
	int amount = 5432, note = 500;
	
	while(amount>0){
		if(amount >= note){
			printf("%d x %d\n",note, amount/note);
			amount = amount%note;
		}
		
		if(note==500) 
			note = 200;
		else if(note==200)
			note = 100;
		else if(note==100)
			note = 50;
		else if(note==50)
			note = 20;
		else if(note==20)
			note = 10;
		else if(note==10)
			note = 5;
		else if(note==5)
			note = 2;
		else if(note==2)
			note = 1;
		else
			break;
	}
}
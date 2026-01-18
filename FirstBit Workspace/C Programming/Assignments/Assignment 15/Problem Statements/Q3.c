/*3. Write a program to create an array for 10 players. For each player store name, no. of
matches played, runs, wickets takes.
a. Create function to Accept the information of each player.
b. Create function to display the information of all the players
c. Display the information of player who made maximum runs and the one who took
maximum number of wickets.*/

#include<stdio.h>

typedef struct Player{
	int id;
	char name[30];
	int matchesPlayed;
	int runs;
	int wickets;
}Player;

//function to accept a player information 
void acceptPlayerInfo(Player* player, int size){
	for(int i=0; i<size; i++){
		printf("\n\t---------------Enter details for player %d------------------\n",i+1);
		//Auto unique id generate
		player[i].id=i+1;
		printf("\nEnter name: ");
		fflush(stdin);
		gets(player[i].name);
		fflush(stdin);
		printf("Enter Matches Played: ");
		scanf("%d",&player[i].matchesPlayed);
		printf("Enter Total runs made: ");
		scanf("%d",&player[i].runs);
		printf("Enter wickets: ");
		scanf("%d",&player[i].wickets);
		printf("\n");
	}
	printf("\n==========================================\n");
}

//function to display player information
void displayPlayerInfo(Player* player,int size){
	for(int i=0; i<size; i++){
		printf("\n\t-------------Details of player %d-----------------\n",player[i].id);
		printf("\nName: %s",player[i].name);
		printf("\nMatches Played: %d",player[i].matchesPlayed);
		printf("\nTotal runs made: %d",player[i].runs);
		printf("\nWickets: %d\n",player[i].wickets);
	}	
	printf("\n==========================================\n");
}

//Find a top performer player by matches played by the player
void topPerformerByMatchesPlayed(Player* player,int size){
	
	Player tempPlayer[size], temp[1];
	
	for(int i=0; i<size; i++){
		tempPlayer[i]=player[i];
	}
	
	for(int i=0; i<size; i++){
		for(int j=i+1; j<size; j++){
			if(tempPlayer[i].matchesPlayed>=tempPlayer[j].matchesPlayed){
				temp[0]=tempPlayer[i];
				tempPlayer[i]=tempPlayer[j];
				tempPlayer[j]=temp[0];
			}
		}
	}
	
	printf("\nPlayer sorted\n");
	
	printf("\n\nPlayer %d made maximum runs : ", tempPlayer[size-1].id);
	printf("\nName: %s",tempPlayer[size-1].name);
	printf("\nMatches Played: %d",tempPlayer[size-1].matchesPlayed);
	printf("\n\n==================================================\n");
}

//Find a top performer player by the wickets taken by the player
void topPerformerByWicketsTaken(Player* player,int size){
	Player tempPlayer[size], temp[1];
	
	for(int i=0; i<size; i++){
		tempPlayer[i]=player[i];
	}
	
	for(int i=0; i<size; i++){
		for(int j=i+1; j<size; j++){
			if(tempPlayer[i].wickets>=tempPlayer[j].wickets){
				temp[0]=tempPlayer[i];
				tempPlayer[i]=tempPlayer[j];
				tempPlayer[j]=temp[0];
			}
		}
	}
	
	printf("\nPlayer sorted\n");
	
	printf("\n\nPlayer %d took maximum number of wickets : ", tempPlayer[size-1].id);
	printf("\nName: %s",tempPlayer[size-1].name);
	printf("\nWickets: %d",tempPlayer[size-1].wickets);
	printf("\n\n==================================================\n");
}

//function to find a top performer
void topPerformerPlayer(Player* player,int size){
	int ch;
	
	printf("\nHow would you like to find a top performer player\n");
	do{
		printf("\n\t1.By number of matches played\n\t2.By number of wickets taken\n\t3.Back to main menu");
		printf("\n\nEnter Your Choice: ");
		scanf("%d",&ch);
		
		switch(ch){
			case 1:
				topPerformerByMatchesPlayed(player,size);
				break;
				
			case 2:
				topPerformerByWicketsTaken(player,size);
				break;
				
			case 3:
				
				break;
				
			default:
				printf("\n\t------------Wrong Choice Please Try Again-----------\n");
		}
	}while(ch!=3);
}

void main(){
	int size=10, choice;
	Player player[size];
	
	do{
		printf("\n\t1.Store Player Information\n\t2.Display Player Information\n\t3.Find Top Performer Player\n\t4.Exit");
		printf("\n\nEnter Your choice: ");
		scanf("%d",&choice);

		switch(choice){
			case 1:
				acceptPlayerInfo(player,size);
				break;
				
			case 2:
				displayPlayerInfo(player,size);
				break;
				
			case 3:
				topPerformerPlayer(player,size);
				break;
				
			case 4:
				printf("\n\t------------Exited successfully---------\n");
				break;
				
			default:
				printf("\n\t----------Worng Choice Please Try again--------\n");		
		}	
	}while(choice!=4);
	
}
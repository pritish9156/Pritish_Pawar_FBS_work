//Player Project
#include<stdio.h>
#include<stdlib.h>
#include<string.h>

//Date structure for player date of birth
typedef struct Date{
	int day;
	int month;
	int year;
}Date;

//Team structure for player team details
typedef struct Team{
	int teamId;
	char name[30];
	char role[30];
	char captainStatus;
	char activeStatus;
}Team;

//structure for player performance stats
typedef struct PerformanceStats{
	int matchPlayed;
	int score;
	int bestPerformance;
}PerformanceStats;

//structure for player data information in a system
typedef struct System{
	Date sysDate;
	Date lastUpdated;
	char remarks[30];
	int contactValue;
}System;

//player structure creation
typedef struct Player{
	int id;
	char name[30];
	int age;
	char gender;
	Date dob;
	char mobile[11];
	char email[30];
	int jerseyNum;
	Team teamInfo;
	PerformanceStats performance;
	int yearOfExp;
	System sysInfo;
}Player;

//single player store/update function
void updatePlayerById(Player* player, int index){
		int i=index;
		printf("\n\n\t----------Enter details for Player------------");
		
		printf("\n\n\t ------------Player Personal Information------------\n");
		printf("Enter Player Id: ");
		scanf("%d",&player[i].id);
		printf("Enter Player Name: ");
		fflush(stdin);
		gets(player[i].name);
		fflush(stdin);
		printf("Enter Player Age: ");
		scanf("%d",&player[i].age);
		printf("Enter Player Gender(M or F): ");
		scanf(" %c",&player[i].gender);
		printf("Enter Player Date of Birth(dd-mm-yyyy): ");
		scanf("%d%d%d",&player[i].dob.day,&player[i].dob.month,&player[i].dob.year);
		printf("Enter Mobile Number: ");
		fflush(stdin);
		gets(player[i].mobile);
		fflush(stdin);
		printf("Enter email address: ");
		fflush(stdin);
		gets(player[i].email);
		fflush(stdin);
		printf("Enter Jersey Number: ");
		scanf("%d",&player[i].jerseyNum);
		
		printf("\n\n\t -------------Enter Details About Player current Team Information------------\n");
		printf("\nEnter Team Id: ");
		scanf("%d",&player[i].teamInfo.teamId);
		printf("Enter Team Name: ");
		fflush(stdin);
		gets(player[i].teamInfo.name);
		fflush(stdin);
		printf("Enter Player Role: ");
		fflush(stdin);
		gets(player[i].teamInfo.role);
		fflush(stdin);
		printf("Enter captain status(Y or N): ");
		scanf("%c",&player[i].teamInfo.captainStatus);
		printf("Is Player Active(Y or N): ");
		scanf(" %c",&player[i].teamInfo.activeStatus);
		
		printf("\n\n\t -------------Enter Details About Player Performance------------\n");
		printf("\nEnter Match Played: ");
		scanf("%d",&player[i].performance.matchPlayed);
		printf("Enter score: ");
		scanf("%d",&player[i].performance.score);
		printf("Enter best performance score: ");
		scanf("%d",&player[i].performance.bestPerformance);
		
		printf("\n\n\t -------------System Information about player data------------\n");
		printf("\nEnter data upload date(dd-mm-yyyy): ");
		scanf("%d%d%d",&player[i].sysInfo.sysDate.day,&player[i].sysInfo.sysDate.month,&player[i].sysInfo.sysDate.year);
		printf("Enter data Last update date(dd-mm-yyyy): ");
		scanf("%d%d%d",&player[i].sysInfo.lastUpdated.day,&player[i].sysInfo.lastUpdated.month,&player[i].sysInfo.lastUpdated.year);
		printf("Enter Remarks If Any or enter no remarks if not: ");
		fflush(stdin);
		gets(player[i].sysInfo.remarks);
		fflush(stdin);
		printf("Enter player contact Value(charges if any) if not enter 0 : ");
		scanf("%d",&player[i].sysInfo.contactValue);
}

//All players data storing function
void addPlayers(Player* player, int size){
	for(int i=0; i<size; i++){
		printf("\n\n\t----------Enter details for Player number %d------------",i+1);
		
		printf("\n\n\t ------------Player Personal Information------------\n");
		printf("\nEnter Player Id: ");
		scanf("%d",&player[i].id);
		printf("Enter Player Name: ");
		fflush(stdin);
		gets(player[i].name);
		fflush(stdin);
		printf("Enter Player Age: ");
		scanf("%d",&player[i].age);
		printf("Enter Player Gender(M or F): ");
		scanf(" %c",&player[i].gender);
		printf("Enter Player Date of Birth(dd-mm-yyyy): ");
		scanf("%d%d%d",&player[i].dob.day,&player[i].dob.month,&player[i].dob.year);
		printf("Enter Mobile Number: ");
		fflush(stdin);
		gets(player[i].mobile);
		fflush(stdin);
		printf("Enter email address: ");
		fflush(stdin);
		gets(player[i].email);
		fflush(stdin);
		printf("Enter Jersey Number: ");
		scanf("%d",&player[i].jerseyNum);
		
		printf("\n\n\t -------------Enter Details About Player current Team Information------------\n");
		printf("\nEnter Team Id: ");
		scanf("%d",&player[i].teamInfo.teamId);
		printf("Enter Team Name: ");
		fflush(stdin);
		gets(player[i].teamInfo.name);
		fflush(stdin);
		printf("Enter Player Role: ");
		fflush(stdin);
		gets(player[i].teamInfo.role);
		fflush(stdin);
		printf("Enter captain status(Y or N): ");
		scanf("%c",&player[i].teamInfo.captainStatus);
		printf("Is Player Active(Y or N): ");
		scanf(" %c",&player[i].teamInfo.activeStatus);
		
		printf("\n\n\t -------------Enter Details About Player Performance------------\n");
		printf("\nEnter Match Played: ");
		scanf("%d",&player[i].performance.matchPlayed);
		printf("Enter score: ");
		scanf("%d",&player[i].performance.score);
		printf("Enter best performance score: ");
		scanf("%d",&player[i].performance.bestPerformance);
		
		printf("\n\n\t -------------System Information about player data------------\n");
		printf("\nEnter data upload date(dd-mm-yyyy): ");
		scanf("%d%d%d",&player[i].sysInfo.sysDate.day,&player[i].sysInfo.sysDate.month,&player[i].sysInfo.sysDate.year);
		printf("Enter data Last update date(dd-mm-yyyy): ");
		scanf("%d%d%d",&player[i].sysInfo.lastUpdated.day,&player[i].sysInfo.lastUpdated.month,&player[i].sysInfo.lastUpdated.year);
		printf("Enter Remarks If Any or enter no remarks if not: ");
		fflush(stdin);
		gets(player[i].sysInfo.remarks);
		fflush(stdin);
		printf("Enter player contact Value(charges if any) if not enter 0 : ");
		scanf("%d",&player[i].sysInfo.contactValue);
		
		printf("\n\n===================================================================");
		printf("\n\t---------Details Saved successfully for player %d-----------",i+1);
		printf("\n====================================================================\n\n");
	}
}

//display a single player info
void displayPlayerByIndex(Player* player,int index){
		int i=index;
		
		printf("\n\n\t----------Details of Player number %d------------",player[i].id);
		
		printf("\n\n\t ------------Player Personal Information------------\n");
		printf("\nName: %s",player[i].name);
		printf("\nAge: %d",player[i].age);
		printf("\nGender: %c",player[i].gender);
		printf("\nDate of Birth: %d-%d-%d",player[i].dob.day,player[i].dob.month,player[i].dob.year);
		printf("\nMobile Number: +91 %s",player[i].mobile);
		printf("\nEmail address: %s",player[i].email);
		printf("\nJersey Number: %d",player[i].jerseyNum);
		
		printf("\n\n\t -------------Current Team Information------------\n");
		printf("\nTeam Name: %s",player[i].teamInfo.name);
		printf("\nPlayer Role: %s",player[i].teamInfo.role);
		printf("\nCaptainship status: %c",player[i].teamInfo.captainStatus);
		printf("\nIs Player Active: %c",player[i].teamInfo.activeStatus);
		
		printf("\n\n\t -------------Details About Player Performance------------\n");
		printf("\nMatch Played: %d",player[i].performance.matchPlayed);
		printf("\nScore: %d",player[i].performance.score);
		printf("\nEnter best performance score: %d",player[i].performance.bestPerformance);
		
		printf("\n\n\t -------------System Information about player data------------\n");
		printf("\nData upload date: %d-%d-%d",player[i].sysInfo.sysDate.day,player[i].sysInfo.sysDate.month,player[i].sysInfo.sysDate.year);
		printf("\nData Last updated on: %d-%d-%d",player[i].sysInfo.lastUpdated.day,player[i].sysInfo.lastUpdated.month,player[i].sysInfo.lastUpdated.year);
		printf("\nRemarks: %s",player[i].sysInfo.remarks);
		printf("\nPlayer contact Value(charges): %d",player[i].sysInfo.contactValue);
		
		printf("\n\n================================================================\n");
}

//All players information display function
void displayPlayer(Player* player,int size){
	for(int i=0; i<size; i++){
		printf("\n\n\t----------Details of Player number %d------------",player[i].id);
		
		printf("\n\n\t ------------Player Personal Information------------\n");
		printf("\nName: %s",player[i].name);
		printf("\nAge: %d",player[i].age);
		printf("\nGender: %c",player[i].gender);
		printf("\nDate of Birth: %d-%d-%d",player[i].dob.day,player[i].dob.month,player[i].dob.year);
		printf("\nMobile Number: +91 %s",player[i].mobile);
		printf("\nEmail address: %s",player[i].email);
		printf("\nJersey Number: %d",player[i].jerseyNum);
		
		printf("\n\n\t -------------Current Team Information------------\n");
		printf("\nTeam Name: %s",player[i].teamInfo.name);
		printf("\nPlayer Role: %s",player[i].teamInfo.role);
		printf("\nCaptainship status: %c",player[i].teamInfo.captainStatus);
		printf("\nIs Player Active: %c",player[i].teamInfo.activeStatus);
		
		printf("\n\n\t -------------Details About Player Performance------------\n");
		printf("\nMatch Played: %d",player[i].performance.matchPlayed);
		printf("\nScore: %d",player[i].performance.score);
		printf("\nEnter best performance score: %d",player[i].performance.bestPerformance);
		
		printf("\n\n\t -------------System Information about player data------------\n");
		printf("\nData upload date: %d-%d-%d",player[i].sysInfo.sysDate.day,player[i].sysInfo.sysDate.month,player[i].sysInfo.sysDate.year);
		printf("\nData Last updated on: %d-%d-%d",player[i].sysInfo.lastUpdated.day,player[i].sysInfo.lastUpdated.month,player[i].sysInfo.lastUpdated.year);
		printf("\nRemarks: %s",player[i].sysInfo.remarks);
		printf("\nPlayer contact Value(charges): %d",player[i].sysInfo.contactValue);
		
		printf("\n\n================================================================\n");
	}
}

//Function to fetch a specific player details
int searchPlayer(Player* player,int size){
	int searchChoice;
	printf("\n1.Using Player Id\n2.Using Player Name\n");
	printf("\nEnter Your Choice: ");
	scanf("%d",&searchChoice);
	
	if(searchChoice==1){
		int searchId;
		printf("Enter player id: ");
		scanf("%d",&searchId);
		
		for(int i=0; i<size; i++){
			if(player[i].id==searchId)
				return i;
		}
		return -1;
		
	}else if(searchChoice==2){
		char searchName[30];
		printf("Enter Player name: ");
		fflush(stdin);
		gets(searchName);
		fflush(stdin);
		
		for(int i=0; i<size; i++){
			if(strcasecmp(player[i].name,searchName)==0)
				return i;
		}
		return -1;
	}else{
		printf("\nWrong choice -- not avilable\n");
		return -1;
	}
}

void addSinglePlayer(Player* player, int* size, int* isDataEmpty){
	if(*isDataEmpty!=0)
		*size += 1;
		
	player = (Player*)realloc(player,(*size)*sizeof(Player));
	updatePlayerById(player, *size-1);
	                    
	*isDataEmpty=1;
	   
	printf("\n\n===================================================================");
	printf("\n\t---------Player Details successfully Added-----------");
	printf("\n====================================================================\n\n");
}

//function to update a specific player information
void updatePlayer(Player* player,int size){
	printf("\nSelect Your choice how would you like to Update Data\n");
	int indexToUpdate = searchPlayer(player,size);
	if(indexToUpdate==-1){
		printf("\nPlayer Details Not Found\n");
		printf("======================================\n\n");
				
	}else{
		printf("\nUpdation in Progress.....\n");
		updatePlayerById(player, indexToUpdate);
		printf("\n\n===================================================================");
		printf("\n\t---------Details Updated successfully for player %d-----------",player[indexToUpdate].id);
		printf("\n====================================================================\n\n");
	}
	
}

//To sort a player information
void sortPlayer(Player* player, int size){
	int sortChoice;
	Player* sortedPlayer = (Player*)malloc(size*sizeof(Player));
	for(int i=0;i<size;i++){
		sortedPlayer[i]=player[i];
	}
	printf("\nSelect Your choice how would you like to sort your Data\n");
	printf("\n\t1.Sort - Player Score\n\t2.Sort - Player Match Played\n\t3.Sort - Player Best Performance Score\n\t4.Back to Main Menu");
	printf("\n\nEnter Your Choice: ");
	scanf("%d",&sortChoice);
	
	switch(sortChoice){
		case 1:{
			int maxOrMinSort;
			
			printf("\n\n\t-------------Player Data According to player Score---------------\n\n");
			for(int i=0;i<size;i++){
				for(int j=size-1; j>i; j--){
					if(sortedPlayer[i].performance.score>sortedPlayer[j].performance.score){
						sortedPlayer[i]=player[j];
						sortedPlayer[j]=player[i];
					}
				}	
			}
			
			printf("\n\t1.Minimum to Maximum\n\t2.Maximum to Minimum");
			printf("\n\nEnter Your Choice: ");
			scanf("%d",&maxOrMinSort);
			
			if(maxOrMinSort==1){
				for(int i=0;i<size;i++)
					printf("\nName: %s | Score: %d\n",sortedPlayer[i].name,sortedPlayer[i].performance.score);

			}else if(maxOrMinSort==2){
				for(int i=size-1;i>=0;i--)
					printf("\nName: %s | Score: %d\n",sortedPlayer[i].name,sortedPlayer[i].performance.score);
			}else
				printf("\n\tWrong Choice --- Please Try Again\n");
			
			printf("\n\n================================================================\n\n");
			break;
		}
		case 2:{
			int maxOrMinSort;
			
			printf("\n\n\t-------------Player Data According to Player Match Played---------------\n\n");
			for(int i=0;i<size;i++){
				for(int j=size-1; j>i; j--){
					if(sortedPlayer[i].performance.matchPlayed>sortedPlayer[j].performance.matchPlayed){
						sortedPlayer[i]=player[j];
						sortedPlayer[j]=player[i];
					}
				}	
			}
			
			printf("\n\t1.Minimum to Maximum\n\t2.Maximum to Minimum");
			printf("\n\nEnter Your Choice: ");
			scanf("%d",&maxOrMinSort);
			
			if(maxOrMinSort==1){
				for(int i=0;i<size;i++)
					printf("\nName: %s | Match Played: %d\n",sortedPlayer[i].name,sortedPlayer[i].performance.matchPlayed);

			}else if(maxOrMinSort==2){
				for(int i=size-1;i>=0;i--)
					printf("\nName: %s | Match Played: %d\n",sortedPlayer[i].name,sortedPlayer[i].performance.matchPlayed);
			}else
				printf("\n\tWrong Choice --- Please Try Again\n");
			
			printf("\n\n================================================================\n\n");
			
			break;
		}
		case 3:{
			int maxOrMinSort;
			
			printf("\n\n\t-------------Player Data According to player Score---------------\n\n");
			for(int i=0;i<size;i++){
				for(int j=size-1; j>i; j--){
					if(sortedPlayer[i].performance.bestPerformance>sortedPlayer[j].performance.bestPerformance){
						sortedPlayer[i]=player[j];
						sortedPlayer[j]=player[i];
					}
				}	
			}
			
			printf("\n\t1.Minimum to Maximum\n\t2.Maximum to Minimum");
			printf("\n\nEnter Your Choice: ");
			scanf("%d",&maxOrMinSort);
			
			if(maxOrMinSort==1){
				for(int i=0;i<size;i++)
					printf("\nName: %s | Score: %d\n",sortedPlayer[i].name,sortedPlayer[i].performance.bestPerformance);

			}else if(maxOrMinSort==2){
				for(int i=size-1;i>=0;i--)
					printf("\nName: %s | Score: %d\n",sortedPlayer[i].name,sortedPlayer[i].performance.bestPerformance);
			}else
				printf("\n\tWrong Choice --- Please Try Again\n");
			
			printf("\n\n================================================================\n\n");
			
			break;
		}
		case 4:
			//back to main menu
			break;
			
		default:
			printf("\nWrong Choice -- Please Try Again\n");
	}
	
}

void deletePlayer(Player* player, int* size, int* isDataEmpty){
	printf("\nSelect Your choice how would you like to Delete Data\n");
	int indexToDelete = searchPlayer(player,*size);
	if(indexToDelete==-1){
		printf("\nPlayer Details Not Found\n");
		printf("======================================\n\n");
				
	}else{
		printf("\nDeletion in Progress.....\n");
		for(int i=indexToDelete; i<(*size); i++){
			player[i] = player[i+1];
		}
		*size -= 1;
		
		if(*size==0)
			*isDataEmpty = 0;
			
		printf("\n\n===================================================================");
		printf("\n\t---------Details Deleted successfully-----------");
		printf("\n====================================================================\n\n");
	}
	

}

//Main function
void main(){
	int size, choice, isDataEmpty=0;
	printf("\t\t===========================================================");
	printf("\n\t\t|              Player Management System                   |  \n");
	printf("\t\t===========================================================\n");
	printf("\nHow many players details you want to store: ");
	scanf("%d",&size);
	Player* player = (Player*)malloc(sizeof(Player)*size);
	
	do{
		if(isDataEmpty==0)
			printf("\n\t1.Add players");
			
		printf("\n\t2.Display Players\n\t3.Search Playern\n\t4.Add a Single Player\n\t5.Update Player\n\t6.Delete Player\n\t7.Sort Player Data\n\t8.Close Software\n");
		printf("\nEnter Your Choice: ");
		scanf("%d",&choice);
		
		switch(choice){
			case 1:{
				addPlayers(player,size);
				isDataEmpty=1;
				break;
			}
			case 2:{
				if(isDataEmpty==1)
					displayPlayer(player,size);	
				else
					printf("\n\t-----------Data Not avilable to display--------------\n");
				
				break;
			}
			case 3:{
				printf("\nSelect Your choice how would you like to search\n");
				int index = searchPlayer(player,size);
				if(index==-1){
					printf("\nPlayer Details Not Found\n");
					printf("======================================\n\n");
				
				}else{
					printf("\nPlayer Details Found\n");
					displayPlayerByIndex(player,index);
				}
				
				break;
			}
			case 4:
				addSinglePlayer(player, &size, &isDataEmpty);
				break;
				
			case 5:
				updatePlayer(player,size);
				break;
				
			case 6:
				deletePlayer(player, &size, &isDataEmpty);
				break;
				
			case 7:
				sortPlayer(player,size);
				break;
				
			case 8:
				printf("\n\n\tSoftware Closed Successfully");
				break;
				
			default:
				printf("\n\t-----------Wrong Choice please try again-------------\n");
		}
		
	}while(choice!=8);
}
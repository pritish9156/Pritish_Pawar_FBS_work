//Player Project
#include<stdio.h>
#include<stdlib.h>

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
		printf("\n\n\t----------Enter details for Player number %d------------",player[i].id);
		
		printf("\n\n\t ------------Player Personal Information------------\n");
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
		printf("\n\t---------Details Updated successfully for player %d-----------",player[i].id);
		printf("\n====================================================================\n\n");
}

//player storing function
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

//player information display function
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

int searchPlayer(Player* player,int size){
	int searchChoice, searchId;
	printf("\n1.Using Player Id\n2.Using Player Name\n");
	printf("\nEnter Your Choice: ");
	scanf("%d",&searchChoice);
	
	if(searchChoice==1){
		printf("Enter player id: ");
		scanf("%d",&searchId);
		
		for(int i=0; i<size; i++){
			if(player[i].id==searchId)
				return i;
		}
		return -1;
		
	}else if(searchChoice==2){
		
	}else{
		printf("\nWrong choice -- not avilable\n");
		return -1;
	}
}

int updatePlayer(Player* player,int size){
	printf("\nSelect Your choice how would you like to Update Data\n");
	int indexToUpdate = searchPlayer(player,size);
	if(indexToUpdate==-1){
		printf("\nPlayer Details Not Found\n");
		printf("======================================\n\n");
				
	}else{
		printf("\nUpdation in Progress.....\n");
		updatePlayerById(player, indexToUpdate);
	}
}

void main(){
	int size, choice, flow=0;
	printf("\t\t===========================================================");
	printf("\n\t\t|              Player Management System                   |  \n");
	printf("\t\t===========================================================\n");
	printf("\nHow many players details you want to store: ");
	scanf("%d",&size);
	Player* player = (Player*)malloc(sizeof(Player)*size);
	
	do{
		printf("\n\t1.Add players\n\t2.Display Players\n\t3.Search Player\n\t4.Update Player\n\t5.Delete Player\n\t6.Close Software\n");
		printf("\nEnter Your Choice: ");
		scanf("%d",&choice);
		
		switch(choice){
			case 1:{
				addPlayers(player,size);
				flow=1;
				break;
			}
			case 2:{
				if(flow==1)
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
				updatePlayer(player,size);
				break;
			case 5:
				
				break;
			case 6:
				printf("\n\n\tSoftware Closed Successfully");
				break;
			default:
				printf("\n\t-----------Wrong Choice please try again-------------\n");
		}
		
	}while(choice!=6);
}
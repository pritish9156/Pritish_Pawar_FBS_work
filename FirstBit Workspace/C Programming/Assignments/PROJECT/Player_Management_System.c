//Player Management Project
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
void updatePlayerById(Player* player, int index, int* isUpdate){
		int i=index, updateChoice, subUpdateChoice;
		char updateStatus;
		printf("\n\n\t----------Enter details for Player------------");
		printf("\n\nwhich data you want to update");
		
		do{
		
			printf("\n\n\t1.Player Personal Information\n\t2.Player current Team Information\n\t3.Details About Player Performance\n\t4.System Information about player data\n\t5.Back To Main Menu");
			printf("\n\nEnter Your Choice: ");
			scanf("%d",&updateChoice);
			
			switch(updateChoice){
				case 1:{
					
					do{
					
						printf("\n\n\t ------------Player Personal Information------------\n");
						printf("\n\nWhich details you want to update");
						printf("\n\n\t1.Name\n\t2.Age\n\t3.Mobile Number\n\t4.Email\n\t5.Jersey Number\n\t6.Back To Main Menu");
						printf("\n\nEnter Your Choice: ");
						scanf("%d",&subUpdateChoice);
						switch(subUpdateChoice){
							case 1:{
								printf("\n\nOld Record: %s",player[i].name);
								printf("\nDo You want to continue(Y or N): ");
								scanf(" %c",&updateStatus);
								
								if(updateStatus=='Y'||updateStatus=='y'){
									printf("\nEnter New Player Name: ");
									fflush(stdin);
									gets(player[i].name);
									fflush(stdin);
									printf("\n\n\t---------Player Name Updated----------\n");
								}
								
								break;
							}
							case 2:{
								printf("\n\nOld Record: %s",player[i].age);
								printf("\nDo You want to continue(Y or N): ");
								scanf(" %c",&updateStatus);
								
								if(updateStatus=='Y'||updateStatus=='y'){
									printf("\n\nEnter new Age: ");
									scanf("%d",&player[i].age);
									printf("\n\n\t---------Player Age Updated----------\n");
								}
								break;
							}
							case 3:{		
								printf("\n\nOld Record: %s",player[i].mobile);
								printf("\nDo You want to continue(Y or N): ");
								scanf(" %c",&updateStatus);
								
								if(updateStatus=='Y'||updateStatus=='y'){
									printf("\n\nEnter New Mobile Number: ");
									fflush(stdin);
									gets(player[i].mobile);
									fflush(stdin);
									printf("\n\n\t---------Player Mobile Number Updated----------\n");
								}
								break;
							}
							case 4:{
								printf("\n\nOld Record: %s",player[i].email);
								printf("\nDo You want to continue(Y or N): ");
								scanf(" %c",&updateStatus);
								
								if(updateStatus=='Y'||updateStatus=='y'){
									printf("\n\nEnter new email address: ");
									fflush(stdin);
									gets(player[i].email);
									fflush(stdin);
									printf("\n\n\t---------Player Email address Updated----------\n");
								}
								break;
							}
							case 5:{
								printf("\n\nOld Record: %s",player[i].jerseyNum);
								printf("\nDo You want to continue(Y or N): ");
								scanf(" %c",&updateStatus);
								
								if(updateStatus=='Y'||updateStatus=='y'){
									printf("\n\nEnter new Jersey Number: ");
									scanf("%d",&player[i].jerseyNum);
									printf("\n\n\t---------Player Jersey Number Updated----------\n");
								}
								break;
							}
							case 6:{
								
								break;
							}
						}
					}while(subUpdateChoice!=6);
					
					break;
				}
				case 2:{
					
					do{
						
						printf("\n\n\t -------------Enter Details About Player current Team Information------------\n");
						printf("\n\nWhich details you want to update");
						printf("\n\n\t1.Team Name\n\t2.Player Role in a Team\n\t3.Captain Status\n\t4.Is Player Active\n\t5.Back To Main Menu");
						printf("\n\nEnter Your Choice: ");
						scanf("%d",&subUpdateChoice);
						switch(subUpdateChoice){
							case 1:{
								printf("\n\nOld Record: %s",player[i].teamInfo.name);
								printf("\nDo You want to continue(Y or N): ");
								scanf(" %c",&updateStatus);
								
								if(updateStatus=='Y'||updateStatus=='y'){
									printf("\n\nEnter new Team Name: ");
									fflush(stdin);
									gets(player[i].teamInfo.name);
									fflush(stdin);
									printf("\n\n\t---------Player Team Name Updated----------\n");
								}
								break;
							}
							case 2:{
								printf("\n\nOld Record: %s",player[i].teamInfo.role);
								printf("\nDo You want to continue(Y or N): ");
								scanf(" %c",&updateStatus);
								
								if(updateStatus=='Y'||updateStatus=='y'){
									printf("\n\nEnter Player Role: ");
									fflush(stdin);
									gets(player[i].teamInfo.role);
									fflush(stdin);
									printf("\n\n\t---------Player Team Role Updated----------\n");
								}
								break;
							}
							case 3:{
								printf("\n\nOld Record: %s",player[i].teamInfo.captainStatus);
								printf("\nDo You want to continue(Y or N): ");
								scanf(" %c",&updateStatus);
								
								if(updateStatus=='Y'||updateStatus=='y'){
									printf("\n\nEnter captain status(Y or N): ");
									scanf("%c",&player[i].teamInfo.captainStatus);
									printf("\n\n\t---------Player Captain status Updated----------\n");
								}
								break;
							}
							case 4:{
								printf("\n\nOld Record: %s",player[i].teamInfo.activeStatus);
								printf("\nDo You want to continue(Y or N): ");
								scanf(" %c",&updateStatus);
								
								if(updateStatus=='Y'||updateStatus=='y'){
									printf("\n\nIs Player Active(Y or N): ");
									scanf(" %c",&player[i].teamInfo.activeStatus);
									printf("\n\n\t---------Player Active Status Updated----------\n");
								}
								break;
							}
							case 5:{
								
								break;
							}
						}
					}while(subUpdateChoice!=5);
	
					break;
				}
				case 3:{
					
					do{
						
						printf("\n\n\t -------------Enter Details About Player Performance------------\n");
						printf("\n\nWhich details you want to update");
						printf("\n\n\t1.Match Played\n\t2.Total Score\n\t3.Best Performance Score\n\t4.Back To Main Menu");
						printf("\n\nEnter Your Choice: ");
						scanf("%d",&subUpdateChoice);
						
						switch(subUpdateChoice){
							case 1:{
								printf("\n\nOld Record: %s",player[i].performance.matchPlayed);
								printf("\nDo You want to continue(Y or N): ");
								scanf(" %c",&updateStatus);
								
								if(updateStatus=='Y'||updateStatus=='y'){
									printf("\nEnter Match Played: ");
									scanf("%d",&player[i].performance.matchPlayed);
									printf("\n\n\t---------Match Played By Player Record Updated----------\n");
								}
								break;
							}
							case 2:{
								printf("\n\nOld Record: %s",player[i].performance.score);
								printf("\nDo You want to continue(Y or N): ");
								scanf(" %c",&updateStatus);
								
								if(updateStatus=='Y'||updateStatus=='y'){
									printf("Enter score: ");
									scanf("%d",&player[i].performance.score);
									printf("\n\n\t---------Match Scores Updated----------\n");
								}
								break;
							}
							case 3:{
								printf("\n\nOld Record: %s",player[i].performance.bestPerformance);
								printf("\nDo You want to continue(Y or N): ");
								scanf(" %c",&updateStatus);
								
								if(updateStatus=='Y'||updateStatus=='y'){
									printf("Enter best performance score: ");
									scanf("%d",&player[i].performance.bestPerformance);
									printf("\n\n\t---------Player Performance Score Updated----------\n");
								}
								break;
							}
							case 4:{
								
								break;
							}
						}
					}while(subUpdateChoice!=4);
	
					break;
				}
				case 4:{
					
					do{
						
						printf("\n\n\t -------------System Information about player data------------\n");
						printf("\n\nWhich details you want to update");
						printf("\n\n\t1.Remarks\n\t2.Player contact Value\n\t3.Back to Main Menu");
						printf("\n\nEnter Your Choice: ");
						scanf("%d",&subUpdateChoice);
						
						switch(subUpdateChoice){
							case 1:{
								printf("\n\nOld Record: %s",player[i].sysInfo.remarks);
								printf("\nDo You want to continue(Y or N): ");
								scanf(" %c",&updateStatus);
								
								if(updateStatus=='Y'||updateStatus=='y'){
									printf("Enter Remarks If Any or enter no remarks if not: ");
									fflush(stdin);
									gets(player[i].sysInfo.remarks);
									fflush(stdin);
									printf("\n\n\t---------Remarks for Player is Updated----------\n");
								}
								break;
							}
							case 2:{
								printf("\n\nOld Record: %d",player[i].sysInfo.contactValue);
								printf("\nDo You want to continue(Y or N): ");
								scanf(" %c",&updateStatus);
								
								if(updateStatus=='Y'||updateStatus=='y'){
									printf("Enter player contact Value(charges if any) if not enter 0 : ");
									scanf("%d",&player[i].sysInfo.contactValue);
									printf("\n\n\t---------Contact Value for Player is Updated----------\n");
								}
								break;
							}
							case 3:{
								
								break;
							}	
						}
					}while(subUpdateChoice!=3);
					
					break;
				}
				case 5:{
					*isUpdate=1;
					break;
				}
		    }
		}while(updateChoice!=5);
}

void addPlayerById(Player* player, int index){
	
	int i=index;

	printf("\n\n\t----------Enter details for Player number %d------------",i+1);
		
	printf("\n\n\t ------------Player Personal Information------------\n");
		
	player[i].id=i+1;
		
	printf("\nEnter Player Name: ");
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

void addPlayersHardcoded(Player* player){
		// Player 1
		player[0].id=1;
		strcpy(player[0].name,"Virat Koli");
		player[0].age=25;
		player[0].gender='M';
		player[0].dob.day=10;
		player[0].dob.month=03;
		player[0].dob.year=2003;
		strcpy(player[0].mobile,"2929394939");
		strcpy(player[0].email,"virat@gmail.com");
		player[0].jerseyNum=41;
		player[0].teamInfo.teamId=101;
		strcpy(player[0].teamInfo.name,"chennai");
		strcpy(player[0].teamInfo.role,"Batsman");
		player[0].teamInfo.captainStatus='Y';
		player[0].teamInfo.activeStatus='Y';
		player[0].performance.matchPlayed=1000;
		player[0].performance.score=5000;
		player[0].performance.bestPerformance=400;
		player[0].sysInfo.sysDate.day=10;
		player[0].sysInfo.sysDate.month=8;
		player[0].sysInfo.sysDate.year=2025;
		player[0].sysInfo.lastUpdated.day=8;
		player[0].sysInfo.lastUpdated.month=10;
		player[0].sysInfo.lastUpdated.year=2025;
		strcpy(player[0].sysInfo.remarks,"No");
		player[0].sysInfo.contactValue=10200;
		
		// Player 2
		player[1].id = 2;
		strcpy(player[1].name, "Rohit Sharma");
		player[1].age = 36;
		player[1].gender = 'M';
		player[1].dob.day = 30;
		player[1].dob.month = 4;
		player[1].dob.year = 1987;
		strcpy(player[1].mobile, "9876543210");
		strcpy(player[1].email, "rohit@gmail.com");
		player[1].jerseyNum = 45;
		player[1].teamInfo.teamId = 102;
		strcpy(player[1].teamInfo.name, "Mumbai");
		strcpy(player[1].teamInfo.role, "Batsman");
		player[1].teamInfo.captainStatus = 'Y';
		player[1].teamInfo.activeStatus = 'Y';
		player[1].performance.matchPlayed = 900;
		player[1].performance.score = 4800;
		player[1].performance.bestPerformance = 264;
		player[1].sysInfo.sysDate.day = 5;
		player[1].sysInfo.sysDate.month = 6;
		player[1].sysInfo.sysDate.year = 2025;
		player[1].sysInfo.lastUpdated.day = 10;
		player[1].sysInfo.lastUpdated.month = 6;
		player[1].sysInfo.lastUpdated.year = 2025;
		strcpy(player[1].sysInfo.remarks, "Active");
		player[1].sysInfo.contactValue = 15000;
		
		
		// Player 3
		player[2].id = 3;
		strcpy(player[2].name, "MS Dhoni");
		player[2].age = 42;
		player[2].gender = 'M';
		player[2].dob.day = 7;
		player[2].dob.month = 7;
		player[2].dob.year = 1981;
		strcpy(player[2].mobile, "9123456789");
		strcpy(player[2].email, "dhoni@gmail.com");
		player[2].jerseyNum = 7;
		player[2].teamInfo.teamId = 103;
		strcpy(player[2].teamInfo.name, "Chennai");
		strcpy(player[2].teamInfo.role, "Wicket Keeper");
		player[2].teamInfo.captainStatus = 'Y';
		player[2].teamInfo.activeStatus = 'N';
		player[2].performance.matchPlayed = 1200;
		player[2].performance.score = 5200;
		player[2].performance.bestPerformance = 183;
		player[2].sysInfo.sysDate.day = 1;
		player[2].sysInfo.sysDate.month = 5;
		player[2].sysInfo.sysDate.year = 2025;
		player[2].sysInfo.lastUpdated.day = 15;
		player[2].sysInfo.lastUpdated.month = 5;
		player[2].sysInfo.lastUpdated.year = 2025;
		strcpy(player[2].sysInfo.remarks, "Retired");
		player[2].sysInfo.contactValue = 20000;
		
		
		// Player 4
		player[3].id = 4;
		strcpy(player[3].name, "KL Rahul");
		player[3].age = 31;
		player[3].gender = 'M';
		player[3].dob.day = 18;
		player[3].dob.month = 4;
		player[3].dob.year = 1992;
		strcpy(player[3].mobile, "9988776655");
		strcpy(player[3].email, "klrahul@gmail.com");
		player[3].jerseyNum = 1;
		player[3].teamInfo.teamId = 104;
		strcpy(player[3].teamInfo.name, "Lucknow");
		strcpy(player[3].teamInfo.role, "Batsman");
		player[3].teamInfo.captainStatus = 'Y';
		player[3].teamInfo.activeStatus = 'Y';
		player[3].performance.matchPlayed = 450;
		player[3].performance.score = 3500;
		player[3].performance.bestPerformance = 199;
		player[3].sysInfo.sysDate.day = 12;
		player[3].sysInfo.sysDate.month = 4;
		player[3].sysInfo.sysDate.year = 2025;
		player[3].sysInfo.lastUpdated.day = 20;
		player[3].sysInfo.lastUpdated.month = 4;
		player[3].sysInfo.lastUpdated.year = 2025;
		strcpy(player[3].sysInfo.remarks, "Active");
		player[3].sysInfo.contactValue = 12000;
		
		
		// Player 5
		player[4].id = 5;
		strcpy(player[4].name, "Hardik Pandya");
		player[4].age = 30;
		player[4].gender = 'M';
		player[4].dob.day = 11;
		player[4].dob.month = 10;
		player[4].dob.year = 1993;
		strcpy(player[4].mobile, "9090909090");
		strcpy(player[4].email, "hardik@gmail.com");
		player[4].jerseyNum = 33;
		player[4].teamInfo.teamId = 105;
		strcpy(player[4].teamInfo.name, "Gujarat");
		strcpy(player[4].teamInfo.role, "All Rounder");
		player[4].teamInfo.captainStatus = 'Y';
		player[4].teamInfo.activeStatus = 'Y';
		player[4].performance.matchPlayed = 500;
		player[4].performance.score = 2800;
		player[4].performance.bestPerformance = 91;
		player[4].sysInfo.sysDate.day = 10;
		player[4].sysInfo.sysDate.month = 3;
		player[4].sysInfo.sysDate.year = 2025;
		player[4].sysInfo.lastUpdated.day = 18;
		player[4].sysInfo.lastUpdated.month = 3;
		player[4].sysInfo.lastUpdated.year = 2025;
		strcpy(player[4].sysInfo.remarks, "Fit");
		player[4].sysInfo.contactValue = 14000;
		
		
		// Player 6
		player[5].id = 6;
		strcpy(player[5].name, "Jasprit Bumrah");
		player[5].age = 30;
		player[5].gender = 'M';
		player[5].dob.day = 6;
		player[5].dob.month = 12;
		player[5].dob.year = 1993;
		strcpy(player[5].mobile, "8888888888");
		strcpy(player[5].email, "bumrah@gmail.com");
		player[5].jerseyNum = 93;
		player[5].teamInfo.teamId = 102;
		strcpy(player[5].teamInfo.name, "Mumbai");
		strcpy(player[5].teamInfo.role, "Bowler");
		player[5].teamInfo.captainStatus = 'N';
		player[5].teamInfo.activeStatus = 'Y';
		player[5].performance.matchPlayed = 400;
		player[5].performance.score = 300;
		player[5].performance.bestPerformance = 6;
		player[5].sysInfo.sysDate.day = 5;
		player[5].sysInfo.sysDate.month = 2;
		player[5].sysInfo.sysDate.year = 2025;
		player[5].sysInfo.lastUpdated.day = 9;
		player[5].sysInfo.lastUpdated.month = 2;
		player[5].sysInfo.lastUpdated.year = 2025;
		strcpy(player[5].sysInfo.remarks, "Active");
		player[5].sysInfo.contactValue = 13000;
		
		
		// Player 7
		player[6].id = 7;
		strcpy(player[6].name, "Ravindra Jadeja");
		player[6].age = 35;
		player[6].gender = 'M';
		player[6].dob.day = 6;
		player[6].dob.month = 12;
		player[6].dob.year = 1988;
		strcpy(player[6].mobile, "7777777777");
		strcpy(player[6].email, "jadeja@gmail.com");
		player[6].jerseyNum = 8;
		player[6].teamInfo.teamId = 103;
		strcpy(player[6].teamInfo.name, "Chennai");
		strcpy(player[6].teamInfo.role, "All Rounder");
		player[6].teamInfo.captainStatus = 'N';
		player[6].teamInfo.activeStatus = 'Y';
		player[6].performance.matchPlayed = 700;
		player[6].performance.score = 3200;
		player[6].performance.bestPerformance = 175;
		player[6].sysInfo.sysDate.day = 3;
		player[6].sysInfo.sysDate.month = 1;
		player[6].sysInfo.sysDate.year = 2025;
		player[6].sysInfo.lastUpdated.day = 10;
		player[6].sysInfo.lastUpdated.month = 1;
		player[6].sysInfo.lastUpdated.year = 2025;
		strcpy(player[6].sysInfo.remarks, "Active");
		player[6].sysInfo.contactValue = 14500;
		
		
		// Player 8
		player[7].id = 8;
		strcpy(player[7].name, "Shubman Gill");
		player[7].age = 24;
		player[7].gender = 'M';
		player[7].dob.day = 8;
		player[7].dob.month = 9;
		player[7].dob.year = 1999;
		strcpy(player[7].mobile, "6666666666");
		strcpy(player[7].email, "gill@gmail.com");
		player[7].jerseyNum = 77;
		player[7].teamInfo.teamId = 105;
		strcpy(player[7].teamInfo.name, "Gujarat");
		strcpy(player[7].teamInfo.role, "Batsman");
		player[7].teamInfo.captainStatus = 'N';
		player[7].teamInfo.activeStatus = 'Y';
		player[7].performance.matchPlayed = 250;
		player[7].performance.score = 2100;
		player[7].performance.bestPerformance = 208;
		player[7].sysInfo.sysDate.day = 2;
		player[7].sysInfo.sysDate.month = 2;
		player[7].sysInfo.sysDate.year = 2025;
		player[7].sysInfo.lastUpdated.day = 5;
		player[7].sysInfo.lastUpdated.month = 2;
		player[7].sysInfo.lastUpdated.year = 2025;
		strcpy(player[7].sysInfo.remarks, "Young Talent");
		player[7].sysInfo.contactValue = 9000;
		
		
		// Player 9
		player[8].id = 9;
		strcpy(player[8].name, "Surya Kumar");
		player[8].age = 33;
		player[8].gender = 'M';
		player[8].dob.day = 14;
		player[8].dob.month = 9;
		player[8].dob.year = 1990;
		strcpy(player[8].mobile, "5555555555");
		strcpy(player[8].email, "surya@gmail.com");
		player[8].jerseyNum = 63;
		player[8].teamInfo.teamId = 102;
		strcpy(player[8].teamInfo.name, "Mumbai");
		strcpy(player[8].teamInfo.role, "Batsman");
		player[8].teamInfo.captainStatus = 'N';
		player[8].teamInfo.activeStatus = 'Y';
		player[8].performance.matchPlayed = 350;
		player[8].performance.score = 2900;
		player[8].performance.bestPerformance = 117;
		player[8].sysInfo.sysDate.day = 15;
		player[8].sysInfo.sysDate.month = 3;
		player[8].sysInfo.sysDate.year = 2025;
		player[8].sysInfo.lastUpdated.day = 18;
		player[8].sysInfo.lastUpdated.month = 3;
		player[8].sysInfo.lastUpdated.year = 2025;
		strcpy(player[8].sysInfo.remarks, "T20 Specialist");
		player[8].sysInfo.contactValue = 11000;
		
		
		// Player 10
		player[9].id = 10;
		strcpy(player[9].name, "Rishabh Pant");
		player[9].age = 26;
		player[9].gender = 'M';
		player[9].dob.day = 4;
		player[9].dob.month = 10;
		player[9].dob.year = 1997;
		strcpy(player[9].mobile, "4444444444");
		strcpy(player[9].email, "pant@gmail.com");
		player[9].jerseyNum = 17;
		player[9].teamInfo.teamId = 104;
		strcpy(player[9].teamInfo.name, "Delhi");
		strcpy(player[9].teamInfo.role, "Wicket Keeper");
		player[9].teamInfo.captainStatus = 'Y';
		player[9].teamInfo.activeStatus = 'Y';
		player[9].performance.matchPlayed = 300;
		player[9].performance.score = 2600;
		player[9].performance.bestPerformance = 159;
		player[9].sysInfo.sysDate.day = 20;
		player[9].sysInfo.sysDate.month = 4;
		player[9].sysInfo.sysDate.year = 2025;
		player[9].sysInfo.lastUpdated.day = 25;
		player[9].sysInfo.lastUpdated.month = 4;
		player[9].sysInfo.lastUpdated.year = 2025;
		strcpy(player[9].sysInfo.remarks, "Captain");
		player[9].sysInfo.contactValue = 12500;

}

//All players data storing function
void addPlayers(Player* player, int size){
	for(int i=0; i<size; i++){
		printf("\n\n\t----------Enter details for Player number %d------------",i+1);
		
		printf("\n\n\t ------------Player Personal Information------------\n");
		
		player[i].id=i+1;
		
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
			if(strstr(player[i].name,searchName)==0)
				return i;
		}
		return -1;
	}else{
		printf("\nWrong choice -- not avilable\n");
		return -1;
	}
}

//function to add a single player record
Player* addSinglePlayer(Player* player, int* size, int* isDataEmpty){
	if(*isDataEmpty!=0)
		*size += 1;
		
	printf("\n\nsize %d\n\n",*size);
		
	player = (Player*)realloc(player,(*size)*sizeof(Player));
	

		
	addPlayerById(player, *size-1);
	
	for(int i=0; i<*size; i++){
		printf("\nid: %d",player[i].id);
	}
	                    
	*isDataEmpty=1;
	   
	printf("\n\n===================================================================");
	printf("\n\t---------Player Details successfully Added-----------");
	printf("\n====================================================================\n\n");
	
	return player;
}

//function to update a specific player information
void updatePlayer(Player* player,int size){
	printf("\nSelect Your choice how would you like to Update Data\n");
	int indexToUpdate = searchPlayer(player,size);
	if(indexToUpdate==-1){
		printf("\nPlayer Details Not Found\n");
		printf("======================================\n\n");
				
	}else{
		int isUpdate=0;
		
		printf("\nDetails found for player\n");
		printf("Player Id: %d\nPlayer Name: %s\n",player[indexToUpdate].id,player[indexToUpdate].name);
		printf("\nUpdation in Progress.....\n");
		updatePlayerById(player, indexToUpdate, &isUpdate);
		
		if(isUpdate==0){
			printf("\n\n===================================================================");
			printf("\n\t---------Details Updated successfully for player %d-----------",player[indexToUpdate].id);
			printf("\n====================================================================\n\n");
		}	
	}
	
}

//To sort a player information
void sortPlayer(Player* player, int size){
	int sortChoice;
	Player tempPlayer[1];
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
				for(int j=i+1; j<size; j++){
					if(sortedPlayer[i].performance.score>sortedPlayer[j].performance.score){
						tempPlayer[0]=sortedPlayer[i];
						sortedPlayer[i]=sortedPlayer[j];
						sortedPlayer[j]=tempPlayer[0];
					}
				}	
			}
			
			printf("\n\t1.Minimum to Maximum\n\t2.Maximum to Minimum");
			printf("\n\nEnter Your Choice: ");
			scanf("%d",&maxOrMinSort);
			
			printf("\nPlayer Name\t\t|\t\tScore\n");
			printf("----------------------------------------------------------\n");
			if(maxOrMinSort==1){
				for(int i=0;i<size;i++)
					printf("\n%s\t\t\t\t%d\n",sortedPlayer[i].name,sortedPlayer[i].performance.score);

			}else if(maxOrMinSort==2){
				for(int i=size-1;i>=0;i--)
					printf("\n%s\t\t\t\t%d\n",sortedPlayer[i].name,sortedPlayer[i].performance.score);
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
						tempPlayer[0]=sortedPlayer[i];
						sortedPlayer[i]=sortedPlayer[j];
						sortedPlayer[j]=tempPlayer[0];
					}
				}	
			}
			
			printf("\n\t1.Minimum to Maximum\n\t2.Maximum to Minimum");
			printf("\n\nEnter Your Choice: ");
			scanf("%d",&maxOrMinSort);
			
			printf("\nPlayer Name\t\t|\t\tMatch Played\n");
			printf("----------------------------------------------------------\n");
			if(maxOrMinSort==1){
				for(int i=0;i<size;i++)
					printf("\n%s\t\t\t\t%d\n",sortedPlayer[i].name,sortedPlayer[i].performance.matchPlayed);

			}else if(maxOrMinSort==2){
				for(int i=size-1;i>=0;i--)
					printf("\n%s\t\t\t\t%d\n",sortedPlayer[i].name,sortedPlayer[i].performance.matchPlayed);
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
						tempPlayer[0]=sortedPlayer[i];
						sortedPlayer[i]=sortedPlayer[j];
						sortedPlayer[j]=tempPlayer[0];
					}
				}	
			}
			
			printf("\n\t1.Minimum to Maximum\n\t2.Maximum to Minimum");
			printf("\n\nEnter Your Choice: ");
			scanf("%d",&maxOrMinSort);
			printf("\nPlayer Name\t\t|\tBest Performance Score\n");
			printf("----------------------------------------------------------\n");
			if(maxOrMinSort==1){
				for(int i=0;i<size;i++)
					printf("\n%s\t\t\t\t%d\n",sortedPlayer[i].name,sortedPlayer[i].performance.bestPerformance);

			}else if(maxOrMinSort==2){
				for(int i=size-1;i>=0;i--)
					printf("\n%s\t\t\t\t%d\n",sortedPlayer[i].name,sortedPlayer[i].performance.bestPerformance);
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

//function  to delete a player record
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
	Player* player = NULL;
	
	printf("\t\t===========================================================");
	printf("\n\t\t|              Player Management System                   |  \n");
	printf("\t\t===========================================================\n");
	
	
	do{
		if(isDataEmpty==0)
			printf("\n\t1.Add players");
			
		printf("\n\t2.Display Players\n\t3.Search Playern");
		
		if(isDataEmpty==1)
			printf("\n\t4.Add a Single Player");
			
		printf("\n\t5.Update Player\n\t6.Delete Player\n\t7.Sort Player Data\n\t8.Close Software\n");
		printf("\nEnter Your Choice: ");
		scanf("%d",&choice);
		
		switch(choice){
			case 1:{
				printf("\nHow many players details you want to store: ");
				scanf("%d",&size);
				player = (Player*)malloc(sizeof(Player)*size);
				//addPlayers(player,size);
				addPlayersHardcoded(player);
				isDataEmpty=1;
				break;
			}
			case 2:{
				if(isDataEmpty==1){
					printf("\nsize to disp %d \n",size);
					displayPlayer(player,size);	
				}
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
				player = addSinglePlayer(player, &size, &isDataEmpty);
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
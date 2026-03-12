package main;

import java.util.Scanner;
import source.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Player[] players = new Player[100];
    static int count = 0;

    static void addPlayer() {

        Player p = new Player();

        System.out.println("\n\t==========================================");
        System.out.println("\t        ENTER PLAYER INFORMATION");
        System.out.println("\t==========================================\n");

        System.out.print("Enter Player ID: ");
        p.setId(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter Name: ");
        p.setName(sc.nextLine());

        System.out.print("Enter Age: ");
        p.setAge(sc.nextInt());

        System.out.print("Enter Gender (M/F): ");
        p.setGender(sc.next().charAt(0));

        System.out.print("Enter Jersey Number: ");
        p.setJerseyNum(sc.nextInt());

        System.out.print("Enter Team ID: ");
        p.getTeamInfo().setTeamId(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter Team Name: ");
        p.getTeamInfo().setName(sc.nextLine());

        System.out.print("Enter Role: ");
        p.getTeamInfo().setRole(sc.nextLine());

        System.out.print("Captain (Y/N): ");
        p.getTeamInfo().setCaptainStatus(sc.next().charAt(0));

        System.out.print("Active (Y/N): ");
        p.getTeamInfo().setActiveStatus(sc.next().charAt(0));

        System.out.print("Matches Played: ");
        p.getPerformance().setMatchPlayed(sc.nextInt());

        System.out.print("Score: ");
        p.getPerformance().setScore(sc.nextInt());

        System.out.print("Best Performance: ");
        p.getPerformance().setBestPerformance(sc.nextInt());

        sc.nextLine();

        System.out.print("Remarks: ");
        p.getSysInfo().setRemarks(sc.nextLine());

        System.out.print("Contact Value: ");
        p.getSysInfo().setContactValue(sc.nextInt());

        players[count++] = p;

        System.out.println("\n\t==========================================");
        System.out.println("\t     PLAYER ADDED SUCCESSFULLY");
        System.out.println("\t==========================================\n");
    }

    static void displayPlayers() {

        if (count == 0) {
            System.out.println("\n\tNo Players Available\n");
            return;
        }

        System.out.println("\n\n\t================ PLAYER LIST =================");

        System.out.printf("\n%-5s %-15s %-5s %-12s %-12s %-10s",
                "ID","NAME","AGE","TEAM","ROLE","SCORE");

        System.out.println("\n--------------------------------------------------------------");

        for(int i=0;i<count;i++) {

            Player p = players[i];

            System.out.printf("\n%-5d %-15s %-5d %-12s %-12s %-10d",
                    p.getId(),
                    p.getName(),
                    p.getAge(),
                    p.getTeamInfo().getName(),
                    p.getTeamInfo().getRole(),
                    p.getPerformance().getScore());
        }

        System.out.println("\n--------------------------------------------------------------\n");
    }

    static void searchPlayer() {

        System.out.print("\nEnter Player ID: ");
        int id = sc.nextInt();

        for(int i=0;i<count;i++) {

            if(players[i].getId()==id) {

                Player p = players[i];

                System.out.println("\n\t=========== PLAYER FOUND ===========\n");

                System.out.println("Player ID   : " + p.getId());
                System.out.println("Name        : " + p.getName());
                System.out.println("Age         : " + p.getAge());
                System.out.println("Team        : " + p.getTeamInfo().getName());
                System.out.println("Role        : " + p.getTeamInfo().getRole());
                System.out.println("Score       : " + p.getPerformance().getScore());

                System.out.println("\n\t====================================\n");

                return;
            }
        }

        System.out.println("\nPlayer Not Found\n");
    }

    static void deletePlayer() {

        System.out.print("\nEnter Player ID to Delete: ");
        int id = sc.nextInt();

        for(int i=0;i<count;i++) {

            if(players[i].getId()==id) {

                for(int j=i;j<count-1;j++)
                    players[j] = players[j+1];

                count--;

                System.out.println("\n\t=================================");
                System.out.println("\t     PLAYER DELETED SUCCESSFULLY");
                System.out.println("\t=================================\n");

                return;
            }
        }

        System.out.println("\nPlayer Not Found\n");
    }

    static void sortPlayers() {

        for(int i=0;i<count-1;i++) {
            for(int j=i+1;j<count;j++) {

                if(players[i].getPerformance().getScore() >
                        players[j].getPerformance().getScore()) {

                    Player temp = players[i];
                    players[i] = players[j];
                    players[j] = temp;
                }
            }
        }

        System.out.println("\nPlayers Sorted By Score\n");
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n\t==================================================");
            System.out.println("\t|           PLAYER MANAGEMENT SYSTEM             |");
            System.out.println("\t==================================================");

            System.out.println("\n\t1. Add Player");
            System.out.println("\t2. Display Players");
            System.out.println("\t3. Search Player");
            System.out.println("\t4. Delete Player");
            System.out.println("\t5. Sort Players");
            System.out.println("\t6. Exit");

            System.out.print("\n\tEnter Your Choice : ");
            choice = sc.nextInt();

            switch(choice) {

                case 1: addPlayer(); break;
                case 2: displayPlayers(); break;
                case 3: searchPlayer(); break;
                case 4: deletePlayer(); break;
                case 5: sortPlayers(); break;

                case 6:
                    System.out.println("\n\t===========================================");
                    System.out.println("\t   THANK YOU FOR USING PLAYER SYSTEM");
                    System.out.println("\t===========================================\n");
                    break;

                default:
                    System.out.println("\nInvalid Choice\n");
            }

        } while(choice!=6);
    }
}
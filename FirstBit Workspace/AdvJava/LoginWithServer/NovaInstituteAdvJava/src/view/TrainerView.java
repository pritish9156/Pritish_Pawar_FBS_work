package view;

import java.util.Scanner;

public class TrainerView {

	Scanner sc = new Scanner(System.in);

	public void showTrainerView() {

		int choice;

		do {

			showHeader();
			showMenu();

			System.out.print("\n\t\t\t👉 Enter Your Choice : ");
			choice = sc.nextInt();

			switch(choice) {

				case 1:{
					addTrainer();
					break;
				}

				case 2:{
					viewAllTrainer();
					break;
				}

				case 3:{
					searchTrainer();
					break;
				}

				case 4:{
					updateTrainerSalary();
					break;
				}

				case 5:{
					removeTrainer();
					break;
				}

				case 0:{
					backToDashboard();
					break;
				}
			}

		}while(choice != 0);
	}

	void showHeader() {

		System.out.println("\n\n");

		System.out.println("\t\t\t╔══════════════════════════════════════════════════════════════════════╗");
		System.out.println("\t\t\t║                                                                      ║");
		System.out.println("\t\t\t║                👨‍🏫 TRAINER MANAGEMENT PANEL                          ║");
		System.out.println("\t\t\t║                                                                      ║");
		System.out.println("\t\t\t╠══════════════════════════════════════════════════════════════════════╣");
		System.out.println("\t\t\t║                                                                      ║");
		System.out.println("\t\t\t║                 🚀 MANAGE TRAINER OPERATIONS                         ║");
		System.out.println("\t\t\t║                                                                      ║");
		System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════════════╝");
	}

	void showMenu() {

		System.out.println("\n");

		System.out.println("\t\t\t┌──────────────────────────────────────────────────────────────┐");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [1] ➕ Add Trainer                                          │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [2] 📋 View All Trainers                                    │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [3] 🔍 Search Trainer                                       │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [4] 💰 Update Trainer Salary                                │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [5] ❌ Remove Trainer                                       │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [0] 🔙 Back To Dashboard                                    │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t└──────────────────────────────────────────────────────────────┘");
	}

	void addTrainer() {

		System.out.println("\n\n");

		System.out.println("\t\t\t╔══════════════════════════════════════════════════════════════╗");
		System.out.println("\t\t\t║                     ➕ ADD TRAINER                           ║");
		System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════╝");

		System.out.println();

		System.out.print("\t\t\t👤 Enter Trainer Name : ");
		sc.nextLine();

		showSuccessBox("TRAINER ADDED SUCCESSFULLY");

		pauseScreen();
	}

	void viewAllTrainer() {

		System.out.println("\n");

		System.out.println("\t╔════════════════════════════════════════════════════════════════════════════════════════════╗");
		System.out.println("\t║                                      👨‍🏫 TRAINER RECORDS                                  ║");
		System.out.println("\t╚════════════════════════════════════════════════════════════════════════════════════════════╝");

		System.out.println();

		System.out.println("======================================================================================================================");
		System.out.printf("%-10s %-20s %-25s %-15s %-15s\n",
				"ID",
				"NAME",
				"EMAIL",
				"SPECIALIZATION",
				"SALARY");

		System.out.println("======================================================================================================================");

		System.out.printf("%-10d %-20s %-25s %-15s %-15.2f\n",
				101,
				"Rahul Sharma",
				"rahul@gmail.com",
				"JAVA",
				45000.00);

		System.out.println("======================================================================================================================");

		pauseScreen();
	}

	void searchTrainer() {

		System.out.println("\n\n");

		System.out.println("\t\t\t╔══════════════════════════════════════════════════════════════╗");
		System.out.println("\t\t\t║                    🔍 SEARCH TRAINER                         ║");
		System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════╝");

		System.out.println();

		System.out.print("\t\t\t👉 Enter Trainer ID : ");
		sc.nextInt();

		showSuccessBox("TRAINER FOUND");

		pauseScreen();
	}

	void updateTrainerSalary() {

		System.out.println("\n\n");

		System.out.println("\t\t\t╔══════════════════════════════════════════════════════════════╗");
		System.out.println("\t\t\t║                 💰 UPDATE TRAINER SALARY                    ║");
		System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════╝");

		System.out.println();

		System.out.print("\t\t\t👉 Enter Trainer ID : ");
		sc.nextInt();

		System.out.print("\t\t\t👉 Enter New Salary : ");
		sc.nextDouble();

		showSuccessBox("SALARY UPDATED SUCCESSFULLY");

		pauseScreen();
	}

	void removeTrainer() {

		System.out.println("\n\n");

		System.out.println("\t\t\t╔══════════════════════════════════════════════════════════════╗");
		System.out.println("\t\t\t║                    ❌ REMOVE TRAINER                         ║");
		System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════╝");

		System.out.println();

		System.out.print("\t\t\t👉 Enter Trainer ID : ");
		sc.nextInt();

		showSuccessBox("TRAINER REMOVED SUCCESSFULLY");

		pauseScreen();
	}

	void backToDashboard() {

		System.out.println("\n\n");

		System.out.println("\t\t\t╔══════════════════════════════════════════════╗");
		System.out.println("\t\t\t║          🔙 RETURNING TO DASHBOARD           ║");
		System.out.println("\t\t\t╚══════════════════════════════════════════════╝");

		try {
			Thread.sleep(1500);
		}
		catch(Exception e) {

		}
	}

	void showSuccessBox(String msg) {

		System.out.println("\n");

		System.out.println("\t\t\t╔══════════════════════════════════════╗");
		System.out.println("\t\t\t║          ✅ SUCCESS                  ║");
		System.out.println("\t\t\t╠══════════════════════════════════════╣");
		System.out.printf("\t\t\t║ %-36s ║\n", msg);
		System.out.println("\t\t\t╚══════════════════════════════════════╝");
	}

	void pauseScreen() {

		System.out.println("\n");
		System.out.print("\t\t\tPress Enter To Continue...");
		sc.nextLine();
		sc.nextLine();
	}
}
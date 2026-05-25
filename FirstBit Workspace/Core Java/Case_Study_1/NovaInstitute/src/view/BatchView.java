package view;

import java.util.Scanner;

public class BatchView {

	Scanner sc = new Scanner(System.in);

	public void showBatchView() {

		int choice;

		do {

			showHeader();
			showMenu();

			System.out.print("\n\t\t\t👉 Enter Your Choice : ");
			choice = sc.nextInt();

			switch(choice) {

				case 1:{
					createBatch();
					break;
				}

				case 2:{
					viewAllBatch();
					break;
				}

				case 3:{
					searchBatch();
					break;
				}

				case 4:{
					assignTrainer();
					break;
				}

				case 5:{
					removeBatch();
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
		System.out.println("\t\t\t║                    🏫 BATCH MANAGEMENT PANEL                         ║");
		System.out.println("\t\t\t║                                                                      ║");
		System.out.println("\t\t\t╠══════════════════════════════════════════════════════════════════════╣");
		System.out.println("\t\t\t║                                                                      ║");
		System.out.println("\t\t\t║                    📅 MANAGE ALL BATCHES                             ║");
		System.out.println("\t\t\t║                                                                      ║");
		System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════════════╝");
	}

	void showMenu() {

		System.out.println("\n");

		System.out.println("\t\t\t┌──────────────────────────────────────────────────────────────┐");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [1] ➕ Create Batch                                         │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [2] 📋 View All Batches                                     │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [3] 🔍 Search Batch                                         │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [4] 👨‍🏫 Assign Trainer                                       │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [5] ❌ Remove Batch                                         │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [0] 🔙 Back To Dashboard                                    │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t└──────────────────────────────────────────────────────────────┘");
	}

	void createBatch() {

		System.out.println("\n\n");

		System.out.println("\t\t\t╔══════════════════════════════════════════════════════════════╗");
		System.out.println("\t\t\t║                     ➕ CREATE NEW BATCH                      ║");
		System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════╝");

		sc.nextLine();

		System.out.print("\n\t\t\t🏫 Enter Batch Name : ");
		sc.nextLine();

		showSuccessBox("BATCH CREATED SUCCESSFULLY");

		pauseScreen();
	}

	void viewAllBatch() {

		System.out.println("\n");

		System.out.println("\t╔════════════════════════════════════════════════════════════════════════════════════════════╗");
		System.out.println("\t║                                      📋 BATCH RECORDS                                     ║");
		System.out.println("\t╚════════════════════════════════════════════════════════════════════════════════════════════╝");

		System.out.println();

		System.out.println("====================================================================================================");
		System.out.printf("%-10s %-20s %-20s %-20s\n",
				"ID",
				"BATCH NAME",
				"TIMING",
				"TRAINER");

		System.out.println("====================================================================================================");

		System.out.printf("%-10d %-20s %-20s %-20s\n",
				101,
				"JAVA-FULLSTACK-A",
				"10AM-12PM",
				"Rahul Sharma");

		System.out.println("====================================================================================================");

		pauseScreen();
	}

	void searchBatch() {

		System.out.println("\n\n");

		System.out.println("\t\t\t╔══════════════════════════════════════════════════════════════╗");
		System.out.println("\t\t\t║                      🔍 SEARCH BATCH                         ║");
		System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════╝");

		System.out.println();

		System.out.print("\t\t\t👉 Enter Batch ID : ");
		sc.nextInt();

		showSuccessBox("BATCH FOUND");

		pauseScreen();
	}

	void assignTrainer() {

		System.out.println("\n\n");

		System.out.println("\t\t\t╔══════════════════════════════════════════════════════════════╗");
		System.out.println("\t\t\t║                    👨‍🏫 ASSIGN TRAINER                        ║");
		System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════╝");

		System.out.println();

		System.out.print("\t\t\t👉 Enter Batch ID : ");
		sc.nextInt();

		System.out.print("\t\t\t👉 Enter Trainer ID : ");
		sc.nextInt();

		showSuccessBox("TRAINER ASSIGNED SUCCESSFULLY");

		pauseScreen();
	}

	void removeBatch() {

		System.out.println("\n\n");

		System.out.println("\t\t\t╔══════════════════════════════════════════════════════════════╗");
		System.out.println("\t\t\t║                     ❌ REMOVE BATCH                          ║");
		System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════╝");

		System.out.println();

		System.out.print("\t\t\t👉 Enter Batch ID : ");
		sc.nextInt();

		showSuccessBox("BATCH REMOVED SUCCESSFULLY");

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
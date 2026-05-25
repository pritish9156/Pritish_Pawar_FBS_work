package view;

import java.util.Scanner;

public class FeesView {

	Scanner sc = new Scanner(System.in);

	public void showFeesView() {

		int choice;

		do {

			showHeader();
			showMenu();

			System.out.print("\n\t\t\t👉 Enter Your Choice : ");
			choice = sc.nextInt();

			switch(choice) {

				case 1:{
					payFees();
					break;
				}

				case 2:{
					viewPaymentHistory();
					break;
				}

				case 3:{
					searchFees();
					break;
				}

				case 4:{
					pendingFeesReport();
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
		System.out.println("\t\t\t║                    💰 FEES MANAGEMENT PANEL                          ║");
		System.out.println("\t\t\t║                                                                      ║");
		System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════════════╝");
	}

	void showMenu() {

		System.out.println("\n");

		System.out.println("\t\t\t┌──────────────────────────────────────────────────────────────┐");
		System.out.println("\t\t\t│   [1] 💵 Pay Fees                                             │");
		System.out.println("\t\t\t│   [2] 📋 View Payment History                                 │");
		System.out.println("\t\t\t│   [3] 🔍 Search Student Fees                                  │");
		System.out.println("\t\t\t│   [4] 📊 Pending Fees Report                                  │");
		System.out.println("\t\t\t│   [0] 🔙 Back To Dashboard                                    │");
		System.out.println("\t\t\t└──────────────────────────────────────────────────────────────┘");
	}

	void payFees() {

		showSuccessBox("FEES PAID SUCCESSFULLY");

		pauseScreen();
	}

	void viewPaymentHistory() {

		showSuccessBox("PAYMENT HISTORY LOADED");

		pauseScreen();
	}

	void searchFees() {

		showSuccessBox("FEES DETAILS FOUND");

		pauseScreen();
	}

	void pendingFeesReport() {

		showSuccessBox("PENDING FEES REPORT GENERATED");

		pauseScreen();
	}

	void backToDashboard() {

		showSuccessBox("RETURNING TO DASHBOARD");

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
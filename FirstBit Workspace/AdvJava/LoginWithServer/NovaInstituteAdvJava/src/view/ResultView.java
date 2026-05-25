package view;

import java.util.Scanner;

public class ResultView {

	Scanner sc = new Scanner(System.in);

	public void showResultView() {

		int choice;

		do {

			showHeader();
			showMenu();

			System.out.print("\n\t\t\t👉 Enter Your Choice : ");
			choice = sc.nextInt();

			switch(choice) {

				case 1:{
					addResult();
					break;
				}

				case 2:{
					updateResult();
					break;
				}

				case 3:{
					viewResults();
					break;
				}

				case 4:{
					generateResultReport();
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
		System.out.println("\t\t\t║                      📊 RESULT MANAGEMENT                            ║");
		System.out.println("\t\t\t║                                                                      ║");
		System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════════════╝");
	}

	void showMenu() {

		System.out.println("\n");

		System.out.println("\t\t\t┌──────────────────────────────────────────────────────────────┐");
		System.out.println("\t\t\t│   [1] ➕ Add Result                                          │");
		System.out.println("\t\t\t│   [2] 🔄 Update Result                                       │");
		System.out.println("\t\t\t│   [3] 📋 View Results                                        │");
		System.out.println("\t\t\t│   [4] 📊 Generate Result Report                              │");
		System.out.println("\t\t\t│   [0] 🔙 Back To Dashboard                                   │");
		System.out.println("\t\t\t└──────────────────────────────────────────────────────────────┘");
	}

	void addResult() {

		showSuccessBox("RESULT ADDED");

		pauseScreen();
	}

	void updateResult() {

		showSuccessBox("RESULT UPDATED");

		pauseScreen();
	}

	void viewResults() {

		showSuccessBox("RESULTS LOADED");

		pauseScreen();
	}

	void generateResultReport() {

		showSuccessBox("RESULT REPORT GENERATED");

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
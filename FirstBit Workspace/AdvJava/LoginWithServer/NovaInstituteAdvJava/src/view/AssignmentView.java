package view;

import java.util.Scanner;

public class AssignmentView {

	Scanner sc = new Scanner(System.in);

	public void showAssignmentView() {

		int choice;

		do {

			showHeader();
			showMenu();

			System.out.print("\n\t\t\t👉 Enter Your Choice : ");
			choice = sc.nextInt();

			switch(choice) {

				case 1:{
					createAssignment();
					break;
				}

				case 2:{
					viewAssignments();
					break;
				}

				case 3:{
					submitAssignment();
					break;
				}

				case 4:{
					updateAssignmentStatus();
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
		System.out.println("\t\t\t║                    📘 ASSIGNMENT MANAGEMENT                          ║");
		System.out.println("\t\t\t║                                                                      ║");
		System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════════════╝");
	}

	void showMenu() {

		System.out.println("\n");

		System.out.println("\t\t\t┌──────────────────────────────────────────────────────────────┐");
		System.out.println("\t\t\t│   [1] ➕ Create Assignment                                    │");
		System.out.println("\t\t\t│   [2] 📋 View Assignments                                     │");
		System.out.println("\t\t\t│   [3] 📤 Submit Assignment                                    │");
		System.out.println("\t\t\t│   [4] 🔄 Update Assignment Status                             │");
		System.out.println("\t\t\t│   [0] 🔙 Back To Dashboard                                    │");
		System.out.println("\t\t\t└──────────────────────────────────────────────────────────────┘");
	}

	void createAssignment() {

		showSuccessBox("ASSIGNMENT CREATED");

		pauseScreen();
	}

	void viewAssignments() {

		showSuccessBox("ASSIGNMENTS LOADED");

		pauseScreen();
	}

	void submitAssignment() {

		showSuccessBox("ASSIGNMENT SUBMITTED");

		pauseScreen();
	}

	void updateAssignmentStatus() {

		showSuccessBox("STATUS UPDATED");

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
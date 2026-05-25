package view;

import java.util.Scanner;

public class TimetableView {

	Scanner sc = new Scanner(System.in);

	public void showTimetableView() {

		int choice;

		do {

			showHeader();
			showMenu();

			System.out.print("\n\t\t\t👉 Enter Your Choice : ");
			choice = sc.nextInt();

			switch(choice) {

				case 1:{
					createTimetable();
					break;
				}

				case 2:{
					assignLecture();
					break;
				}

				case 3:{
					viewTimetable();
					break;
				}

				case 4:{
					updateTimetable();
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
		System.out.println("\t\t\t║                    📅 TIMETABLE MANAGEMENT                           ║");
		System.out.println("\t\t\t║                                                                      ║");
		System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════════════╝");
	}

	void showMenu() {

		System.out.println("\n");

		System.out.println("\t\t\t┌──────────────────────────────────────────────────────────────┐");
		System.out.println("\t\t\t│   [1] ➕ Create Timetable                                    │");
		System.out.println("\t\t\t│   [2] 👨‍🏫 Assign Lecture                                      │");
		System.out.println("\t\t\t│   [3] 📋 View Timetable                                      │");
		System.out.println("\t\t\t│   [4] 🔄 Update Timetable                                    │");
		System.out.println("\t\t\t│   [0] 🔙 Back To Dashboard                                   │");
		System.out.println("\t\t\t└──────────────────────────────────────────────────────────────┘");
	}

	void createTimetable() {

		showSuccessBox("TIMETABLE CREATED");

		pauseScreen();
	}

	void assignLecture() {

		showSuccessBox("LECTURE ASSIGNED");

		pauseScreen();
	}

	void viewTimetable() {

		showSuccessBox("TIMETABLE LOADED");

		pauseScreen();
	}

	void updateTimetable() {

		showSuccessBox("TIMETABLE UPDATED");

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
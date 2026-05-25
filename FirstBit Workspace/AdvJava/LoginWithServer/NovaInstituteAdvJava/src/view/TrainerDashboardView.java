package view;

import java.util.Scanner;

public class TrainerDashboardView {

	Scanner sc = new Scanner(System.in);

	public void showTrainerDashboard() {

		int choice;

		do {

			showHeader();
			showMenu();

			System.out.print("\n\t\t\t👉 Enter Your Choice : ");
			choice = sc.nextInt();

			switch(choice) {

				case 1:{
					viewAssignedBatches();
					break;
				}

				case 2:{
					viewStudents();
					break;
				}

				case 3:{
					markAttendance();
					break;
				}

				case 4:{
					createAssignment();
					break;
				}

				case 5:{
					updateResults();
					break;
				}

				case 6:{
					viewTimetable();
					break;
				}

				case 0:{
					logout();
					break;
				}
			}

		}while(choice != 0);
	}

	void showHeader() {

		System.out.println("\n\n");

		System.out.println("\t\t\t╔══════════════════════════════════════════════════════════════════════╗");
		System.out.println("\t\t\t║                                                                      ║");
		System.out.println("\t\t\t║                    👨‍🏫 TRAINER DASHBOARD                             ║");
		System.out.println("\t\t\t║                                                                      ║");
		System.out.println("\t\t\t╠══════════════════════════════════════════════════════════════════════╣");
		System.out.println("\t\t\t║                                                                      ║");
		System.out.println("\t\t\t║                📚 MANAGE TRAINING OPERATIONS                         ║");
		System.out.println("\t\t\t║                                                                      ║");
		System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════════════╝");
	}

	void showMenu() {

		System.out.println("\n");

		System.out.println("\t\t\t┌──────────────────────────────────────────────────────────────┐");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [1] 🏫 View Assigned Batches                               │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [2] 👨‍🎓 View Students                                       │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [3] 📝 Mark Attendance                                     │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [4] 📘 Create Assignment                                   │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [5] 📊 Update Results                                      │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [6] 📅 View Timetable                                      │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [0] 🚪 Logout                                              │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t└──────────────────────────────────────────────────────────────┘");
	}

	void viewAssignedBatches() {

		showSuccessBox("ASSIGNED BATCHES LOADED");

		pauseScreen();
	}

	void viewStudents() {

		showSuccessBox("STUDENT RECORDS LOADED");

		pauseScreen();
	}

	void markAttendance() {

		showSuccessBox("ATTENDANCE MARKED SUCCESSFULLY");

		pauseScreen();
	}

	void createAssignment() {

		showSuccessBox("ASSIGNMENT CREATED SUCCESSFULLY");

		pauseScreen();
	}

	void updateResults() {

		showSuccessBox("RESULTS UPDATED SUCCESSFULLY");

		pauseScreen();
	}

	void viewTimetable() {

		showSuccessBox("TIMETABLE LOADED");

		pauseScreen();
	}

	void logout() {

		System.out.println("\n");

		System.out.println("\t\t\t╔══════════════════════════════════════╗");
		System.out.println("\t\t\t║          🚪 LOGGING OUT              ║");
		System.out.println("\t\t\t╚══════════════════════════════════════╝");

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
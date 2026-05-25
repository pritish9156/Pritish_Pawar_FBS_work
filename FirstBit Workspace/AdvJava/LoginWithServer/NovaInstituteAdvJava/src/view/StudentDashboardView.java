package view;

import java.util.Scanner;

public class StudentDashboardView {

	Scanner sc = new Scanner(System.in);

	public void showStudentDashboard() {

		int choice;

		do {

			showHeader();
			showMenu();

			System.out.print("\n\t\t\t👉 Enter Your Choice : ");
			choice = sc.nextInt();

			switch(choice) {

				case 1:{
					viewProfile();
					break;
				}

				case 2:{
					viewCourses();
					break;
				}

				case 3:{
					viewAttendance();
					break;
				}

				case 4:{
					viewAssignments();
					break;
				}

				case 5:{
					viewResults();
					break;
				}

				case 6:{
					viewFeesStatus();
					break;
				}

				case 7:{
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
		System.out.println("\t\t\t║                    👨‍🎓 STUDENT DASHBOARD                             ║");
		System.out.println("\t\t\t║                                                                      ║");
		System.out.println("\t\t\t╠══════════════════════════════════════════════════════════════════════╣");
		System.out.println("\t\t\t║                                                                      ║");
		System.out.println("\t\t\t║                 📚 ACCESS STUDENT SERVICES                           ║");
		System.out.println("\t\t\t║                                                                      ║");
		System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════════════╝");
	}

	void showMenu() {

		System.out.println("\n");

		System.out.println("\t\t\t┌──────────────────────────────────────────────────────────────┐");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [1] 👤 View Profile                                        │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [2] 📚 View Courses                                        │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [3] 📝 View Attendance                                     │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [4] 📘 View Assignments                                    │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [5] 📊 View Results                                        │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [6] 💰 View Fees Status                                    │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [7] 📅 View Timetable                                      │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [0] 🚪 Logout                                              │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t└──────────────────────────────────────────────────────────────┘");
	}

	void viewProfile() {

		showSuccessBox("PROFILE LOADED");

		pauseScreen();
	}

	void viewCourses() {

		showSuccessBox("COURSE DETAILS LOADED");

		pauseScreen();
	}

	void viewAttendance() {

		showSuccessBox("ATTENDANCE DETAILS LOADED");

		pauseScreen();
	}

	void viewAssignments() {

		showSuccessBox("ASSIGNMENTS LOADED");

		pauseScreen();
	}

	void viewResults() {

		showSuccessBox("RESULTS LOADED");

		pauseScreen();
	}

	void viewFeesStatus() {

		showSuccessBox("FEES STATUS LOADED");

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
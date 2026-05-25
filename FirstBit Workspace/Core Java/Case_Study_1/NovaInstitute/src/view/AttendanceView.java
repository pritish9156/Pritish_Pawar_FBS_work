package view;

import java.util.Scanner;

public class AttendanceView {

	Scanner sc = new Scanner(System.in);

	public void showAttendanceView() {

		int choice;

		do {

			showHeader();
			showMenu();

			System.out.print("\n\t\t\t👉 Enter Your Choice : ");
			choice = sc.nextInt();

			switch(choice) {

				case 1:{
					markAttendance();
					break;
				}

				case 2:{
					viewAttendance();
					break;
				}

				case 3:{
					searchAttendance();
					break;
				}

				case 4:{
					attendanceReport();
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
		System.out.println("\t\t\t║                 📝 ATTENDANCE MANAGEMENT PANEL                       ║");
		System.out.println("\t\t\t║                                                                      ║");
		System.out.println("\t\t\t╠══════════════════════════════════════════════════════════════════════╣");
		System.out.println("\t\t\t║                                                                      ║");
		System.out.println("\t\t\t║                  📅 TRACK STUDENT ATTENDANCE                         ║");
		System.out.println("\t\t\t║                                                                      ║");
		System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════════════╝");
	}

	void showMenu() {

		System.out.println("\n");

		System.out.println("\t\t\t┌──────────────────────────────────────────────────────────────┐");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [1] ✅ Mark Attendance                                      │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [2] 📋 View Attendance Records                              │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [3] 🔍 Search Attendance                                    │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [4] 📊 Attendance Report                                    │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [0] 🔙 Back To Dashboard                                    │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t└──────────────────────────────────────────────────────────────┘");
	}

	void markAttendance() {

		System.out.println("\n\n");

		System.out.println("\t\t\t╔══════════════════════════════════════════════════════════════╗");
		System.out.println("\t\t\t║                    ✅ MARK ATTENDANCE                        ║");
		System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════╝");

		sc.nextLine();

		System.out.print("\n\t\t\t👨‍🎓 Enter Student ID : ");
		sc.nextInt();

		showSuccessBox("ATTENDANCE MARKED");

		pauseScreen();
	}

	void viewAttendance() {

		System.out.println("\n");

		System.out.println("\t╔════════════════════════════════════════════════════════════════════════════════════╗");
		System.out.println("\t║                              📋 ATTENDANCE RECORDS                                ║");
		System.out.println("\t╚════════════════════════════════════════════════════════════════════════════════════╝");

		System.out.println();

		System.out.println("=====================================================================================");
		System.out.printf("%-15s %-20s %-20s %-15s\n",
				"STUDENT ID",
				"NAME",
				"DATE",
				"STATUS");

		System.out.println("=====================================================================================");

		System.out.printf("%-15d %-20s %-20s %-15s\n",
				101,
				"Rahul Sharma",
				"22-05-2026",
				"PRESENT");

		System.out.println("=====================================================================================");

		pauseScreen();
	}

	void searchAttendance() {

		System.out.println("\n\n");

		System.out.println("\t\t\t╔══════════════════════════════════════════════════════════════╗");
		System.out.println("\t\t\t║                   🔍 SEARCH ATTENDANCE                       ║");
		System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════╝");

		System.out.println();

		System.out.print("\t\t\t👉 Enter Student ID : ");
		sc.nextInt();

		showSuccessBox("ATTENDANCE FOUND");

		pauseScreen();
	}

	void attendanceReport() {

		showSuccessBox("ATTENDANCE REPORT GENERATED");

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
package view;

import java.util.Scanner;

public class ReportView {

	Scanner sc = new Scanner(System.in);

	public void showReportView() {

		int choice;

		do {

			showHeader();
			showMenu();

			System.out.print("\n\t\t\t👉 Enter Your Choice : ");
			choice = sc.nextInt();

			switch(choice) {

				case 1:{
					studentReport();
					break;
				}

				case 2:{
					courseReport();
					break;
				}

				case 3:{
					trainerReport();
					break;
				}

				case 4:{
					feesReport();
					break;
				}

				case 5:{
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
		System.out.println("\t\t\t║                    📊 REPORTS & ANALYTICS PANEL                      ║");
		System.out.println("\t\t\t║                                                                      ║");
		System.out.println("\t\t\t╠══════════════════════════════════════════════════════════════════════╣");
		System.out.println("\t\t\t║                                                                      ║");
		System.out.println("\t\t\t║                     📈 GENERATE SYSTEM REPORTS                       ║");
		System.out.println("\t\t\t║                                                                      ║");
		System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════════════╝");
	}

	void showMenu() {

		System.out.println("\n");

		System.out.println("\t\t\t┌──────────────────────────────────────────────────────────────┐");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [1] 👨‍🎓 Student Report                                      │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [2] 📚 Course Report                                        │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [3] 👨‍🏫 Trainer Report                                      │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [4] 💰 Fees Collection Report                               │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [5] 📅 Attendance Report                                    │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t│   [0] 🔙 Back To Dashboard                                    │");
		System.out.println("\t\t\t│                                                              │");
		System.out.println("\t\t\t└──────────────────────────────────────────────────────────────┘");
	}

	void studentReport() {

		showSuccessBox("STUDENT REPORT GENERATED");

		pauseScreen();
	}

	void courseReport() {

		showSuccessBox("COURSE REPORT GENERATED");

		pauseScreen();
	}

	void trainerReport() {

		showSuccessBox("TRAINER REPORT GENERATED");

		pauseScreen();
	}

	void feesReport() {

		showSuccessBox("FEES REPORT GENERATED");

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
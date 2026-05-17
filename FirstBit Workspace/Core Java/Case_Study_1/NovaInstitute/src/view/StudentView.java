package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.StudentController;
import models.Student;

public class StudentView {

    StudentController studController;
    Scanner sc = new Scanner(System.in);

    public StudentView(StudentController studController) {
        this.studController = studController;
    }

    public void showStudentView() {

        int choice;

        do {

            showHeader();
            showMenu();

            System.out.print("\n\t\t\t👉 Enter Your Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    displayAllStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateFees();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 0:
                    exitApplication();
                    break;

                default:
                    System.out.println("\n\t\t\t❌ Invalid Choice! Please Try Again.");
            }

        } while (choice != 0);

    }

    private void showHeader() {

        System.out.println("\n\n");

        System.out.println("\t\t\t╔══════════════════════════════════════════════════════════════════════╗");
        System.out.println("\t\t\t║                                                                      ║");
        System.out.println("\t\t\t║             🎓 STUDENT MANAGEMENT CONTROL PANEL                      ║");
        System.out.println("\t\t\t║                                                                      ║");
        System.out.println("\t\t\t╠══════════════════════════════════════════════════════════════════════╣");
        System.out.println("\t\t\t║                                                                      ║");
        System.out.println("\t\t\t║               👨‍🎓 MANAGE ALL STUDENT OPERATIONS                       ║");
        System.out.println("\t\t\t║                                                                      ║");
        System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════════════╝");
    }

    private void showMenu() {

        System.out.println("\n");

        System.out.println("\t\t\t┌──────────────────────────────────────────────────────────────┐");
        System.out.println("\t\t\t│                                                              │");
        System.out.println("\t\t\t│   [1] ➕ Add Student                                          │");
        System.out.println("\t\t\t│                                                              │");
        System.out.println("\t\t\t│   [2] 📋 View All Students                                    │");
        System.out.println("\t\t\t│                                                              │");
        System.out.println("\t\t\t│   [3] 🔍 Search Student                                       │");
        System.out.println("\t\t\t│                                                              │");
        System.out.println("\t\t\t│   [4] 💰 Update Fees Paid                                     │");
        System.out.println("\t\t\t│                                                              │");
        System.out.println("\t\t\t│   [5] ❌ Remove Student                                       │");
        System.out.println("\t\t\t│                                                              │");
        System.out.println("\t\t\t│   [0] 🔙 Back To Dashboard                                    │");
        System.out.println("\t\t\t│                                                              │");
        System.out.println("\t\t\t└──────────────────────────────────────────────────────────────┘");
    }

    private void addStudent() {

        System.out.println("\n\n");

        System.out.println("\t\t\t╔══════════════════════════════════════════════════════════════╗");
        System.out.println("\t\t\t║                                                              ║");
        System.out.println("\t\t\t║                    ➕ ADD NEW STUDENT                        ║");
        System.out.println("\t\t\t║                                                              ║");
        System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════╝");

        System.out.println();

        System.out.print("\t\t\t👤 Enter Student ID     : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("\t\t\t👤 Enter Student Name   : ");
        String name = sc.nextLine();

        System.out.print("\t\t\t📧 Enter Email ID       : ");
        String email = sc.nextLine();

        System.out.print("\t\t\t🏙 Enter City           : ");
        String city = sc.nextLine();

        System.out.print("\t\t\t🎂 Enter Student Age    : ");
        int age = sc.nextInt();

        System.out.print("\t\t\t💰 Enter Fees Paid      : ");
        double feesPaid = sc.nextDouble();

        Student stud = new Student(id, name, email, city, age, feesPaid);

        boolean result = studController.insertStudent(stud);

        System.out.println();

        if (result) {

            System.out.println("\t\t\t╔══════════════════════════════════════╗");
            System.out.println("\t\t\t║                                      ║");
            System.out.println("\t\t\t║     ✅ STUDENT ADDED SUCCESSFULLY    ║");
            System.out.println("\t\t\t║                                      ║");
            System.out.println("\t\t\t╚══════════════════════════════════════╝");

        } else {

            System.out.println("\t\t\t╔══════════════════════════════════════╗");
            System.out.println("\t\t\t║                                      ║");
            System.out.println("\t\t\t║       ❌ FAILED TO ADD STUDENT       ║");
            System.out.println("\t\t\t║                                      ║");
            System.out.println("\t\t\t╚══════════════════════════════════════╝");
        }

        pause();
    }

    private void displayAllStudents() {

        System.out.println("\n");

        System.out.println("\t\t╔═════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("\t\t║                                    📋 STUDENT RECORDS                                       ║");
        System.out.println("\t\t╚═════════════════════════════════════════════════════════════════════════════════════════════╝");

        ArrayList<Student> studentList = studController.viewStudent();

        if (studentList == null || studentList.isEmpty()) {

            System.out.println("\n\t\t\t⚠ No Student Records Found!");

            pause();
            return;
        }

        System.out.println();

        System.out.println("========================================================================================================================================");
        System.out.printf("%-10s %-20s %-35s %-18s %-10s %-15s\n",
                "ID", "NAME", "EMAIL", "CITY", "AGE", "FEES");
        System.out.println("========================================================================================================================================");

        for (Student s : studentList) {

            System.out.printf("%-10d %-20s %-35s %-18s %-10d %-15.2f\n",
                    s.getStudentId(),
                    s.getStudName(),
                    s.getEmail(),
                    s.getCity(),
                    s.getAge(),
                    s.getFeesPaid());
        }

        System.out.println("========================================================================================================================================");

        pause();
    }

    private void searchStudent() {

        System.out.println("\n\n");

        System.out.println("\t\t\t╔══════════════════════════════════════════════════════════════╗");
        System.out.println("\t\t\t║                                                              ║");
        System.out.println("\t\t\t║                     🔍 SEARCH STUDENT                        ║");
        System.out.println("\t\t\t║                                                              ║");
        System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════╝");

        System.out.println();

        System.out.print("\t\t\t👉 Enter Student ID : ");
        int id = sc.nextInt();

        Student s = studController.searchStudent(id);

        System.out.println();

        if (s != null) {

            System.out.println("\t\t\t╔══════════════════════════════════════════════╗");
            System.out.println("\t\t\t║            🎓 STUDENT DETAILS                ║");
            System.out.println("\t\t\t╠══════════════════════════════════════════════╣");
            System.out.println("\t\t\t║                                              ║");
            System.out.println("\t\t\t║  👤 ID        : " + s.getStudentId());

            System.out.println("\t\t\t║  👤 Name      : " + s.getStudName());

            System.out.println("\t\t\t║  📧 Email     : " + s.getEmail());

            System.out.println("\t\t\t║  🏙 City      : " + s.getCity());

            System.out.println("\t\t\t║  🎂 Age       : " + s.getAge());

            System.out.println("\t\t\t║  💰 Fees Paid : " + s.getFeesPaid());

            System.out.println("\t\t\t║                                              ║");
            System.out.println("\t\t\t╚══════════════════════════════════════════════╝");

        } else {

            System.out.println("\t\t\t❌ Student Not Found!");
        }

        pause();
    }

    private void updateFees() {
    	
        System.out.println("\n\n");

        System.out.println("\t\t\t╔══════════════════════════════════════════════════════════════╗");
        System.out.println("\t\t\t║                                                              ║");
        System.out.println("\t\t\t║                     💰 UPDATE FEES                           ║");
        System.out.println("\t\t\t║                                                              ║");
        System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════╝");

        System.out.println();

        System.out.print("\t\t\t👉 Enter Student ID : ");
        int id = sc.nextInt();

        System.out.print("\t\t\t👉 Enter New Fees   : ");
        double fees = sc.nextDouble();

        boolean result = studController.updateFeesPaid(id, fees);

        System.out.println();

        if (result) {

            System.out.println("\t\t\t✅ Fees Updated Successfully!");

        } else {

            System.out.println("\t\t\t❌ Failed To Update Fees!");
        }

        pause();
    }

    private void deleteStudent() {

        System.out.println("\n\n");

        System.out.println("\t\t\t╔══════════════════════════════════════════════════════════════╗");
        System.out.println("\t\t\t║                                                              ║");
        System.out.println("\t\t\t║                    ❌ REMOVE STUDENT                          ║");
        System.out.println("\t\t\t║                                                              ║");
        System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════╝");

        System.out.println();

        System.out.print("\t\t\t👉 Enter Student ID : ");
        int id = sc.nextInt();

        boolean result = studController.removeStudent(id);

        System.out.println();

        if (result) {

            System.out.println("\t\t\t✅ Student Removed Successfully!");

        } else {

            System.out.println("\t\t\t❌ Failed To Remove Student!");
        }

        pause();
    }

    private void exitApplication() {

        System.out.println("\n\n\n");

        System.out.println("\t\t\t╔══════════════════════════════════════════════╗");
        System.out.println("\t\t\t║                                              ║");
        System.out.println("\t\t\t║          🔙 RETURNING TO DASHBOARD           ║");
        System.out.println("\t\t\t║                                              ║");
        System.out.println("\t\t\t╚══════════════════════════════════════════════╝");

        try {
            Thread.sleep(1500);
        }
        catch(Exception e) {

        }

        DashboardView dashView = new DashboardView();
        dashView.showDashboard();
    }

    private void pause() {

        System.out.println("\n");
        System.out.print("\t\t\tPress Enter To Continue...");
        sc.nextLine();
        sc.nextLine();
    }

}
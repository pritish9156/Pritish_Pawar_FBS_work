package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.CourseController;
import models.Course;

public class CourseView {

    CourseController courseController;
    Scanner sc = new Scanner(System.in);

    public CourseView(CourseController courseController) {
        this.courseController = courseController;
    }

    public void showCourseView() {

        int choice;

        do {

            showHeader();
            showMenu();

            System.out.print("\n\t\t\t👉 Enter Your Choice : ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    addCourse();
                    break;

                case 2:
                    displayAllCourses();
                    break;

                case 3:
                    searchCourse();
                    break;

                case 4:
                    updateCourseFees();
                    break;

                case 5:
                    deleteCourse();
                    break;

                case 0:
                    exitApplication();
                    break;

                default:
                    System.out.println("\n\t\t\t❌ Invalid Choice! Please Try Again.");
            }

        } while(choice != 0);
    }

    private void showHeader() {

        System.out.println("\n\n");

        System.out.println("\t\t\t╔══════════════════════════════════════════════════════════════════════╗");
        System.out.println("\t\t\t║                                                                      ║");
        System.out.println("\t\t\t║                 📚 COURSE MANAGEMENT PANEL                           ║");
        System.out.println("\t\t\t║                                                                      ║");
        System.out.println("\t\t\t╠══════════════════════════════════════════════════════════════════════╣");
        System.out.println("\t\t\t║                                                                      ║");
        System.out.println("\t\t\t║                   🚀 MANAGE ALL COURSES                              ║");
        System.out.println("\t\t\t║                                                                      ║");
        System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════════════╝");
    }

    private void showMenu() {

        System.out.println("\n");

        System.out.println("\t\t\t┌──────────────────────────────────────────────────────────────┐");
        System.out.println("\t\t\t│                                                              │");
        System.out.println("\t\t\t│   [1] ➕ Add Course                                           │");
        System.out.println("\t\t\t│                                                              │");
        System.out.println("\t\t\t│   [2] 📋 View All Courses                                     │");
        System.out.println("\t\t\t│                                                              │");
        System.out.println("\t\t\t│   [3] 🔍 Search Course                                        │");
        System.out.println("\t\t\t│                                                              │");
        System.out.println("\t\t\t│   [4] 💰 Update Course Fees                                   │");
        System.out.println("\t\t\t│                                                              │");
        System.out.println("\t\t\t│   [5] ❌ Delete Course                                        │");
        System.out.println("\t\t\t│                                                              │");
        System.out.println("\t\t\t│   [0] 🔙 Back To Dashboard                                    │");
        System.out.println("\t\t\t│                                                              │");
        System.out.println("\t\t\t└──────────────────────────────────────────────────────────────┘");
    }

    private void addCourse() {

        System.out.println("\n\n");

        System.out.println("\t\t\t╔══════════════════════════════════════════════════════════════╗");
        System.out.println("\t\t\t║                                                              ║");
        System.out.println("\t\t\t║                     ➕ ADD NEW COURSE                         ║");
        System.out.println("\t\t\t║                                                              ║");
        System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════╝");

        System.out.println();

        System.out.print("\t\t\t📘 Enter Course ID     : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("\t\t\t📚 Enter Course Name   : ");
        String name = sc.nextLine();

        System.out.print("\t\t\t⏳ Enter Duration      : ");
        String duration = sc.nextLine();

        System.out.print("\t\t\t💰 Enter Course Fees   : ");
        double fees = sc.nextDouble();

        Course course = new Course(id, name, duration, fees);

        courseController.InsertCourse(course);

        System.out.println();

        System.out.println("\t\t\t╔══════════════════════════════════════╗");
        System.out.println("\t\t\t║                                      ║");
        System.out.println("\t\t\t║      ✅ COURSE ADDED SUCCESSFULLY    ║");
        System.out.println("\t\t\t║                                      ║");
        System.out.println("\t\t\t╚══════════════════════════════════════╝");

        pause();
    }

    private void displayAllCourses() {

        System.out.println("\n");

        System.out.println("\t╔════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("\t║                                                📋 COURSE RECORDS                                                ║");
        System.out.println("\t╚════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");

        ArrayList<Course> courseList = courseController.showAllCourses();

        if(courseList == null || courseList.isEmpty()) {

            System.out.println("\n\t\t\t⚠ No Course Records Found!");

            pause();
            return;
        }

        System.out.println();

        System.out.println("========================================================================================================================================");
        System.out.printf("%-10s %-25s %-20s %-15s\n",
                "ID", "COURSE NAME", "DURATION", "FEES");
        System.out.println("========================================================================================================================================");

        for(Course c : courseList) {

            System.out.printf("%-10d %-25s %-20s %-15.2f\n",
                    c.getCourseId(),
                    c.getCourseName(),
                    c.getDuration(),
                    c.getFees()
                    );
        }

        System.out.println("========================================================================================================================================");

        pause();
    }

    private void searchCourse() {

        System.out.println("\n\n");

        System.out.println("\t\t\t╔══════════════════════════════════════════════════════════════╗");
        System.out.println("\t\t\t║                                                              ║");
        System.out.println("\t\t\t║                      🔍 SEARCH COURSE                        ║");
        System.out.println("\t\t\t║                                                              ║");
        System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════╝");

        System.out.println();

        System.out.print("\t\t\t👉 Enter Course ID : ");
        int id = sc.nextInt();

        Course c = courseController.showCourseById(id);

        System.out.println();

        if(c != null) {

            System.out.println("\t\t\t╔══════════════════════════════════════════════╗");
            System.out.println("\t\t\t║              📚 COURSE DETAILS               ║");
            System.out.println("\t\t\t╠══════════════════════════════════════════════╣");

            System.out.println("\t\t\t║  📘 Course ID     : " + c.getCourseId());

            System.out.println("\t\t\t║  📚 Course Name   : " + c.getCourseName());

            System.out.println("\t\t\t║  ⏳ Duration      : " + c.getDuration());

            System.out.println("\t\t\t║  💰 Course Fees   : " + c.getFees());

            System.out.println("\t\t\t║                                              ║");
            System.out.println("\t\t\t╚══════════════════════════════════════════════╝");

        }
        else {

            System.out.println("\t\t\t❌ Course Not Found!");
        }

        pause();
    }

    private void updateCourseFees() {

        System.out.println("\n\n");

        System.out.println("\t\t\t╔══════════════════════════════════════════════════════════════╗");
        System.out.println("\t\t\t║                                                              ║");
        System.out.println("\t\t\t║                   💰 UPDATE COURSE FEES                      ║");
        System.out.println("\t\t\t║                                                              ║");
        System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════╝");

        System.out.println();

        System.out.print("\t\t\t👉 Enter Course ID : ");
        int id = sc.nextInt();

        System.out.print("\t\t\t👉 Enter New Fees  : ");
        double fees = sc.nextDouble();

        courseController.updateCourseFees(id, fees);

        System.out.println();

        System.out.println("\t\t\t✅ Course Fees Updated Successfully!");

        pause();
    }

    private void deleteCourse() {

        System.out.println("\n\n");

        System.out.println("\t\t\t╔══════════════════════════════════════════════════════════════╗");
        System.out.println("\t\t\t║                                                              ║");
        System.out.println("\t\t\t║                     ❌ DELETE COURSE                          ║");
        System.out.println("\t\t\t║                                                              ║");
        System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════╝");

        System.out.println();

        System.out.print("\t\t\t👉 Enter Course ID : ");
        int id = sc.nextInt();

        courseController.deleteCourse(id);

        System.out.println();

        System.out.println("\t\t\t✅ Course Deleted Successfully!");

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
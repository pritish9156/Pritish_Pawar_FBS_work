package view;

import java.util.Scanner;

import controller.CourseController;
import controller.StudentController;

public class DashboardView {

    StudentController studentController;
    CourseController courseController;
    
    Scanner sc = new Scanner(System.in);

    public DashboardView() {

    }

    public DashboardView(StudentController studentController, CourseController courseController) {
        this.studentController = studentController;
        this.courseController = courseController;
    }

    public void showDashboard() {

        System.out.println("\n\n\n");

        System.out.println("\t\t\t╔══════════════════════════════════════════════════════════════════════╗");
        System.out.println("\t\t\t║                                                                      ║");
        System.out.println("\t\t\t║              ██████╗  █████╗ ███████╗██╗  ██╗                        ║");
        System.out.println("\t\t\t║              ██╔══██╗██╔══██╗██╔════╝██║  ██║                        ║");
        System.out.println("\t\t\t║              ██║  ██║███████║███████╗███████║                        ║");
        System.out.println("\t\t\t║              ██║  ██║██╔══██║╚════██║██╔══██║                        ║");
        System.out.println("\t\t\t║              ██████╔╝██║  ██║███████║██║  ██║                        ║");
        System.out.println("\t\t\t║              ╚═════╝ ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝                        ║");
        System.out.println("\t\t\t║                                                                      ║");
        System.out.println("\t\t\t║                 🎓 STUDENT MANAGEMENT DASHBOARD                      ║");
        System.out.println("\t\t\t║                                                                      ║");
        System.out.println("\t\t\t╠══════════════════════════════════════════════════════════════════════╣");
        System.out.println("\t\t\t║                                                                      ║");
        System.out.println("\t\t\t║                         📌 SELECT MODULE                             ║");
        System.out.println("\t\t\t║                                                                      ║");
        System.out.println("\t\t\t╠══════════════════════════════════════════════════════════════════════╣");
        System.out.println("\t\t\t║                                                                      ║");
        System.out.println("\t\t\t║    [1] 👨‍🎓 Student Management                                        ║");
        System.out.println("\t\t\t║                                                                      ║");
        System.out.println("\t\t\t║    [2] 📚 Course Management                                         ║");
        System.out.println("\t\t\t║                                                                      ║");
        System.out.println("\t\t\t║    [3] 📝 Attendance Management                                     ║");
        System.out.println("\t\t\t║                                                                      ║");
        System.out.println("\t\t\t║    [4] 📊 Reports & Analytics                                       ║");
        System.out.println("\t\t\t║                                                                      ║");
        System.out.println("\t\t\t║    [0] 🚪 Logout                                                    ║");
        System.out.println("\t\t\t║                                                                      ║");
        System.out.println("\t\t\t╠══════════════════════════════════════════════════════════════════════╣");
        System.out.println("\t\t\t║                                                                      ║");
        System.out.println("\t\t\t║              🚀 Choose Module To Continue                            ║");
        System.out.println("\t\t\t║                                                                      ║");
        System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════════════╝");

        System.out.print("\n\t\t\t👉 Enter Your Choice : ");

        int choice = sc.nextInt();

        do {

            switch(choice) {

                case 1: {

                    System.out.println("\n\n\n");

                    System.out.println("\t\t\t╔══════════════════════════════════════════════╗");
                    System.out.println("\t\t\t║                                              ║");
                    System.out.println("\t\t\t║        👨‍🎓 OPENING STUDENT MODULE            ║");
                    System.out.println("\t\t\t║                                              ║");
                    System.out.println("\t\t\t╚══════════════════════════════════════════════╝");

                    try {
                        Thread.sleep(1500);
                    }
                    catch(Exception e) {

                    }

                    StudentView studView = new StudentView(studentController);
                    studView.showStudentView();

                    break;
                }

                case 2: {

                    System.out.println("\n\n\n");

                    System.out.println("\t\t\t╔══════════════════════════════════════════════╗");
                    System.out.println("\t\t\t║                                              ║");
                    System.out.println("\t\t\t║        📚 OPENING COURSE MODULE              ║");
                    System.out.println("\t\t\t║                                              ║");
                    System.out.println("\t\t\t╚══════════════════════════════════════════════╝");

                    try {
                        Thread.sleep(1500);
                    }
                    catch(Exception e) {

                    }

                    CourseView courseView = new CourseView(courseController);
                    courseView.showCourseView();
                    
                    break;
                }

                case 3: {

                    System.out.println("\n\n\n");

                    System.out.println("\t\t\t╔══════════════════════════════════════════════╗");
                    System.out.println("\t\t\t║                                              ║");
                    System.out.println("\t\t\t║      📝 ATTENDANCE MODULE COMING SOON        ║");
                    System.out.println("\t\t\t║                                              ║");
                    System.out.println("\t\t\t╚══════════════════════════════════════════════╝");

                    break;
                }

                case 4: {

                    System.out.println("\n\n\n");

                    System.out.println("\t\t\t╔══════════════════════════════════════════════╗");
                    System.out.println("\t\t\t║                                              ║");
                    System.out.println("\t\t\t║       📊 REPORT MODULE COMING SOON           ║");
                    System.out.println("\t\t\t║                                              ║");
                    System.out.println("\t\t\t╚══════════════════════════════════════════════╝");

                    break;
                }

                case 0: {
                	
                    System.out.println("\n\n\n");

                    System.out.println("\t\t\t╔══════════════════════════════════════════════╗");
                    System.out.println("\t\t\t║                                              ║");
                    System.out.println("\t\t\t║             🔒 LOGGING OUT...                ║");
                    System.out.println("\t\t\t║                                              ║");
                    System.out.println("\t\t\t╚══════════════════════════════════════════════╝");

                    try {
                        Thread.sleep(1500);
                    }
                    catch(Exception e) {

                    }

                    LoginView loginView = new LoginView();
                    loginView.showLoginPage();

                    break;
                }

                default: {

                    System.out.println("\n");
                    System.out.println("\t\t\t❌ Invalid Choice...");
                    System.out.println("\t\t\tPlease Try Again...");
                    
                    System.out.print("\n\t\t\tRedirecting Back To Dashboard ");

                    for (int i = 0; i < 3; i++) {

                        try {
                            Thread.sleep(400);
                        }
                        catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.print(". ");
                    }
                    
                    showDashboard();
                }
            }

        } while(choice != 0);
    }
}
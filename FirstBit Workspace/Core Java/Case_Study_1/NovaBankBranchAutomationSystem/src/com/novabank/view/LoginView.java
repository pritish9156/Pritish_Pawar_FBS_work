package com.novabank.view;

import java.util.Scanner;

import com.novabank.controller.AccountController;

public class LoginView {

	AccountController accountController;
    Scanner sc = new Scanner(System.in);

    public LoginView() {

    }

    public LoginView(AccountController accountController) {
        this.accountController = accountController;
    }

    public void showLoginPage() {

    	System.out.println("\n\n\n");

    	System.out.println("\t\t\t╔══════════════════════════════════════════════════════════════════════╗");
    	System.out.println("\t\t\t║                                                                      ║");
    	System.out.println("\t\t\t║              ███╗   ██╗ ██████╗ ██╗   ██╗ █████╗                     ║");
    	System.out.println("\t\t\t║              ████╗  ██║██╔═══██╗██║   ██║██╔══██╗                    ║");
    	System.out.println("\t\t\t║              ██╔██╗ ██║██║   ██║██║   ██║███████║                    ║");
    	System.out.println("\t\t\t║              ██║╚██╗██║██║   ██║╚██╗ ██╔╝██╔══██║                    ║");
    	System.out.println("\t\t\t║              ██║ ╚████║╚██████╔╝ ╚████╔╝ ██║  ██║                    ║");
    	System.out.println("\t\t\t║              ╚═╝  ╚═══╝ ╚═════╝   ╚═══╝  ╚═╝  ╚═╝                    ║");
    	System.out.println("\t\t\t║                                                                      ║");
    	System.out.println("\t\t\t║                  🏦 NOVA BANK MANAGEMENT SYSTEM                      ║");
    	System.out.println("\t\t\t║                                                                      ║");
    	System.out.println("\t\t\t║                 Together We Can Grow Financially                     ║");
    	System.out.println("\t\t\t║                                                                      ║");
    	System.out.println("\t\t\t╠══════════════════════════════════════════════════════════════════════╣");
    	System.out.println("\t\t\t║                                                                      ║");
    	System.out.println("\t\t\t║                      🔐 SECURE LOGIN PORTAL                          ║");
    	System.out.println("\t\t\t║                                                                      ║");
    	System.out.println("\t\t\t╠══════════════════════════════════════════════════════════════════════╣");
    	System.out.println("\t\t\t║                                                                      ║");
    	System.out.println("\t\t\t║    [1] 🏦 Start Banking Services                                     ║");
    	System.out.println("\t\t\t║                                                                      ║");
    	System.out.println("\t\t\t╠══════════════════════════════════════════════════════════════════════╣");
    	System.out.println("\t\t\t║                                                                      ║");
    	System.out.print("\t\t\t║    👉 Enter Your Choice : ");
        int option = sc.nextInt();
        sc.nextLine();
        

        System.out.println("\t\t\t║                                                                      ║");

        if(option == 1) {

            System.out.println("\t\t\t╠══════════════════════════════════════════════════════════════════════╣");
            System.out.println("\t\t\t║                                                                      ║");

            System.out.print("\t\t\t║    👤 Username : ");
            String username = sc.nextLine();

            System.out.println("\t\t\t║                                                                      ║");

            System.out.print("\t\t\t║    🔒 Password : ");
            String password = sc.nextLine();

            System.out.println("\t\t\t║                                                                      ║");
            System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════════════╝");

            showLoading(username, password);

        }
        else if(option == 2) {

            System.out.println("\n\n\n");

            System.out.println("\t\t\t╔══════════════════════════════════════════════════════════════════════╗");
            System.out.println("\t\t\t║                                                                      ║");
            System.out.println("\t\t\t║                           📝 CREATE ACCOUNT                          ║");
            System.out.println("\t\t\t║                                                                      ║");
            System.out.println("\t\t\t╠══════════════════════════════════════════════════════════════════════╣");
            System.out.println("\t\t\t║                                                                      ║");

            System.out.print("\t\t\t║    👤 Enter Username : ");
            String signupUser = sc.nextLine();

            System.out.println("\t\t\t║                                                                      ║");

            System.out.print("\t\t\t║    📧 Enter Email    : ");
            String email = sc.nextLine();

            System.out.println("\t\t\t║                                                                      ║");

            System.out.print("\t\t\t║    🔒 Create Password : ");
            String signupPass = sc.nextLine();

            System.out.println("\t\t\t║                                                                      ║");
            System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════════════╝");

            System.out.println("\n");
            System.out.println("\t\t\t━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println("\t\t\t✅ ACCOUNT CREATED SUCCESSFULLY");
            System.out.println("\t\t\t━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

            System.out.println("\n");
            System.out.println("\t\t\tPress Enter To Continue To Login...");
            sc.nextLine();

            showLoginPage();
        }
        else {

            System.out.println("\n");
            System.out.println("\t\t\t❌ Invalid Choice...");
            System.out.println("\t\t\tPlease Try Again...");

            try {
                Thread.sleep(1500);
            }
            catch(Exception e) {

            }

            showLoginPage();
        }

    }

    private void showLoading(String username, String password) {

        System.out.println("\n\n\n\n");

        System.out.println("\t\t\t╔══════════════════════════════════════════════╗");
        System.out.println("\t\t\t║                                              ║");
        System.out.println("\t\t\t║             🔄 AUTHENTICATING                ║");
        System.out.println("\t\t\t║                                              ║");
        System.out.println("\t\t\t╚══════════════════════════════════════════════╝");

        System.out.print("\n\t\t\tConnecting ");

        for (int i = 0; i < 6; i++) {

            try {
                Thread.sleep(400);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.print("● ");
        }

        if(username.equals("admin") && password.equals("admin")) {


            System.out.println("\n\n\n\n");

            System.out.println("\t\t\t╔══════════════════════════════════════════════╗");
            System.out.println("\t\t\t║                                              ║");
            System.out.println("\t\t\t║              ✅ LOGIN SUCCESSFUL             ║");
            System.out.println("\t\t\t║                                              ║");
            System.out.println("\t\t\t║          Welcome Back Administrator          ║");
            System.out.println("\t\t\t║                                              ║");
            System.out.println("\t\t\t║         Redirecting To Dashboard...          ║");
            System.out.println("\t\t\t║                                              ║");
            System.out.println("\t\t\t╚══════════════════════════════════════════════╝");

            try {
                Thread.sleep(2000);
            }
            catch(Exception e) {

            }

            BankApplicationView bankApplicationView = new BankApplicationView(accountController);

            bankApplicationView.startApplication();

        }
        else {

            System.out.println("\n\n\n\n");

            System.out.println("\t\t\t╔══════════════════════════════════════════════╗");
            System.out.println("\t\t\t║                                              ║");
            System.out.println("\t\t\t║                ❌ LOGIN FAILED               ║");
            System.out.println("\t\t\t║                                              ║");
            System.out.println("\t\t\t║        Invalid Username Or Password          ║");
            System.out.println("\t\t\t║                                              ║");
            System.out.println("\t\t\t╚══════════════════════════════════════════════╝");

            System.out.println("\n");

            System.out.println("\t\t\t┌─────────────────────────────┐");
            System.out.println("\t\t\t│  [1] Retry Login            │");
            System.out.println("\t\t\t│  [2] Back To Main Menu      │");
            System.out.println("\t\t\t└─────────────────────────────┘");

            System.out.print("\n\t\t\tEnter Your Choice : ");

            int choice = sc.nextInt();
            sc.nextLine();

            if(choice == 1 || choice == 2) {
                showLoginPage();
            }
        }
    }
}
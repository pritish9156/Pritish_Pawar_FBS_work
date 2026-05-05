package tree.problemstatements.meetingbooking;

import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MeetingImplementation {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		
		
		do {
			
			System.out.println("1.Book Meeting\n2.Check All Bookings\n3.Exit");
			System.out.print("Enter Your Choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:{
					
					System.out.println();
					sc.nextLine();
					System.out.println("\nEnter your name: ");
					String customerName = sc.nextLine();
					System.out.println("Enter start time: ");
					String time1 = sc.nextLine();
					System.out.println("Enter end time: ");
					String time2 = sc.nextLine();
					
					System.out.println("\n\tBooking Information:-");
					System.out.println("Customer Name: " + customerName);
					System.out.println("\n\tTime Duration:-");
					System.out.println("Start Time: " + time1);
					System.out.println("End Time: " + time2);
					System.out.println("\n\tThankyou for choosing US....!\n");
					
					break;
				}
				case 2:{
					
					break;
				}
				case 3:{
					
					break;
				}
			}
			
		}while(choice!=3);
	}

}

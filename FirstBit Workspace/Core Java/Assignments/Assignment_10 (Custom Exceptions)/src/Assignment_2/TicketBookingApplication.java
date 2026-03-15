package Assignment_2;

import java.util.Scanner;

import InvalidTicketException.InvalidTicketNumberException;
import InvalidTicketException.TicketsSoldOutException;

public class TicketBookingApplication {

	public static void main(String[] args) {
		
		MovieBooking mb = new MovieBooking();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bollywood Movie Ticket Counter");
		System.out.println("===================================");
		
		do {
			System.out.println();
			System.out.println("\n"+mb);
		
			System.out.println("\nEnter the number of tickets: ");
			int numberOfTicket = sc.nextInt();
			
			try {
				if(MovieBooking.bookTickets(numberOfTicket)) {
					System.out.println("\n===================================");
					System.out.println("\nBooking Successful for \"3 Idiots\"!" + "\nTickets booked: " + numberOfTicket + "\nTotal amount: " + MovieBooking.getTicketPrice()*numberOfTicket +"\n");
					System.out.println("===================================");
				}
				
			} catch (InvalidTicketNumberException e) {
				System.err.printf(e.getMessage());
				
			} catch (TicketsSoldOutException e) {
				System.err.printf(e.getMessage());
			}
	
		}while(MovieBooking.getAvilableTickets() > 0);
		
		System.out.println("\nTickets Are Sold Out");

	}
}

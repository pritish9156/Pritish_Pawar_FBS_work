package Assignment_2;

import InvalidTicketExceptions.*;

public class MovieBooking {
	String movieName;
	private static double ticketPrice;
	private static int avilableTickets;
	
	static {
		ticketPrice = 200;
		avilableTickets = 50;
	}
	
	MovieBooking(){
		movieName = "3 Idiots";
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public static double getTicketPrice() {
		return ticketPrice;
	}

	public static int getAvilableTickets() {
		return avilableTickets;
	}

	@Override
	public String toString() {
		return "Movie name: " + movieName +"\nTicket Price: ₹" + ticketPrice +"\nTotal Tickets Available: " + avilableTickets;
	}
	
	public static boolean bookTickets(int numberOfTicket) throws InvalidTicketNumberException, TicketsSoldOutException {
		if(numberOfTicket <= 0) throw new InvalidTicketNumberException();
		if(avilableTickets == 0 || avilableTickets < numberOfTicket) throw new TicketsSoldOutException();
		
		avilableTickets = avilableTickets - numberOfTicket;
		
		return true;
	}
	
	
}

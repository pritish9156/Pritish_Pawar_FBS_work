package InvalidTicketException;

public class TicketsSoldOutException extends Exception{

	public TicketsSoldOutException(){
		super("Sorry! Tickets are sold out.");
	}
}

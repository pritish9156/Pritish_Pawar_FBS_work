package InvalidTicketExceptions;

public class TicketsSoldOutException extends Exception{

	public TicketsSoldOutException(){
		super("Sorry! Tickets are sold out.");
	}
}

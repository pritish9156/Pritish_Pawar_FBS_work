package InvalidTicketExceptions;

public class InvalidTicketNumberException extends Exception {

	public InvalidTicketNumberException(){
		super("Number of Tickets must be 1 or more then 1");
	}
}

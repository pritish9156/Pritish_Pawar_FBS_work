package InvalidateFormExceptions;

public class InsufficientFeesException extends Exception{

	public InsufficientFeesException(){
		super("Sufficient amount of admission fees is not paid");
	}
}

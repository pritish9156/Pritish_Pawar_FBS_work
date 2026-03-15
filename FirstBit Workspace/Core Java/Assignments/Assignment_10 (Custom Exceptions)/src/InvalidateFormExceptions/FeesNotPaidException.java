package InvalidateFormExceptions;

public class FeesNotPaidException extends Exception{

	public FeesNotPaidException(){
		super("Required Fees Not Paid For the admission form");
	}
	
}

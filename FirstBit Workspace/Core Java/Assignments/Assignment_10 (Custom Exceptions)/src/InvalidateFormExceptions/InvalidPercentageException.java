package InvalidateFormExceptions;

public class InvalidPercentageException extends Exception{
	
	public InvalidPercentageException(){
		super("Percentage must be between 0 to 100 for submitting admission form");
	}

}

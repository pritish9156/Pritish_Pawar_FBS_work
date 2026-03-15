package InvalidateFormExceptions;

public class UnderageException extends Exception{
	
	public UnderageException(){
		super("Age must be 17 or above for submitting admission form");
	}

}

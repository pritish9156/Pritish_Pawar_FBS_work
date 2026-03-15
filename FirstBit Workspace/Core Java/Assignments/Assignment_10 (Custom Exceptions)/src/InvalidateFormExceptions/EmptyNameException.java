package InvalidateFormExceptions;

public class EmptyNameException extends Exception{
	
	public EmptyNameException(){
		super("name cannot be empty or contains only spaces");
	}

}

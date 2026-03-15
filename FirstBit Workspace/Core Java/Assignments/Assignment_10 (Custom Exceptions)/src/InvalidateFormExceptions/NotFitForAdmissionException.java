package InvalidateFormExceptions;

public class NotFitForAdmissionException extends Exception{
	
	public NotFitForAdmissionException(){
		super("Student Percentage must be above 35%% for submitting admission form");
	}
}

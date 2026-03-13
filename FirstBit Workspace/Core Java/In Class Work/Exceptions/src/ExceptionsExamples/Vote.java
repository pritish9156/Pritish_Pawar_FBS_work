package ExceptionsExamples;

public class Vote {
	
	int age;

	public Vote(int age){
		this.age = age;
	}
	
	public void validate() throws InvalidAgeException{
		if(age < 18) {
			throw new InvalidAgeException();
		}else {
			System.out.println("You are eligible to vote");
		}
	}
}

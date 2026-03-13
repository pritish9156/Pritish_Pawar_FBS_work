package ExceptionsExamples;

public class TestUserDefinedException {

	public static void main(String[] args) {
		
		Vote v1 = new Vote(15);
		
		try {
			v1.validate();
		}catch(Exception e) {
			System.out.println("Exception: " + e);
		}

	}

}

package oldway;

public class CalImplementation implements Calculator{

	@Override
	public int add(int a, int b) {
		
		System.out.println("Addition is : "+ (a+b));
		return b;
		
	}

}

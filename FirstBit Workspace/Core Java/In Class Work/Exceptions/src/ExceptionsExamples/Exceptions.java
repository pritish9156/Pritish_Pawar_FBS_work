package ExceptionsExamples;

public class Exceptions{
	public static void main(String[] args){
		
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
	
			System.out.println(a/b);
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}catch(NumberFormatException nfe) {
			System.out.println(nfe.getMessage());
		}catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println(ai.getMessage());
		}catch(Exception e) {
			System.out.println("OOPs something wents wrong");
		}
	}
}
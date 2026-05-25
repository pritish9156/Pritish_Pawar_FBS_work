package HackerRankQue;

import CalculatorExceptions.CheckNegativeException;
import CalculatorExceptions.CheckZeroException;

public class CalculatorMain {

	public static void main(String[] args) {
		
		MyCalculator mycal = new MyCalculator();
		
		try {
			
			System.out.println(mycal.power(-1, 3));
			
		} catch (CheckNegativeException e) {
			System.out.println(e.getMessage());
			
		} catch (CheckZeroException e) {
			
			System.out.println(e.getMessage());
		}

	}

}

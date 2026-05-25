package HackerRankQue;

import CalculatorExceptions.CheckNegativeException;
import CalculatorExceptions.CheckZeroException;

public class MyCalculator {
	
	public long power(int n, int p) throws CheckNegativeException, CheckZeroException {
		
		if(n < 0 || p < 0) {
			throw new CheckNegativeException("n and p should not be negative");
		}
		
		if(n == 0 && p == 0) {
			throw new CheckZeroException("n and p should not be zero");
		}
		
		long result = 1;

	    for (int i = 1; i <= p; i++) {
	        result = result * n;
	    }

	    return result;
	}

}

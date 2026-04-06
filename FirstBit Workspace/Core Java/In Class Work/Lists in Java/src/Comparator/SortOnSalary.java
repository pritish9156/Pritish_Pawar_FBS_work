package Comparator;

import java.util.Comparator;

public class SortOnSalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return (int) (o1.basicSal - o2.basicSal);
	}

}

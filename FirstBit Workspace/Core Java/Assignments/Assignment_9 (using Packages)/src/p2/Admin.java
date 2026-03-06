package p2;

import p1.Employee;

public class Admin extends Employee{
	
	double allowance;

	public Admin(int id, String name, double salary, double allowance) {
		super(id, name, salary);
		this.allowance = allowance;
		
	}

	double getAllowance() {
		return allowance;
	}

	void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	@Override
	public String toString() {
		return super.toString()+"\nallowance: " + allowance;
	}

	@Override
	public double calSal() {
		return getSalary()+allowance;
	}

}

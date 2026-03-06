package p2;

import p1.Employee;

public class HR extends Employee{
	
	double commission;

	public HR(int id, String name, double salary, double commission) {
		super(id, name, salary);
		this.commission = commission;
		
	}

	double getCommission() {
		return commission;
	}

	void setCommission(double commission) {
		this.commission = commission;
	}


	@Override
	public String toString() {
		return super.toString()+"\ncommission: " + commission;
	}

	@Override
	public double calSal() {
		return getSalary()+commission;
	}

}

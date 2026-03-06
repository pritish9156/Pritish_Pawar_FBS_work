package p2;

import p1.Employee;

public class SalesManager extends Employee{
	
	double incentive;
	int target;
	
	public SalesManager(int id, String name, double salary, double incentive, int target) {
		super(id, name, salary);
		this.incentive = incentive;
		this.target = target;
	}
	
	double getIncentive() {
		return incentive;
	}

	void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	int getTarget() {
		return target;
	}

	void setTarget(int target) {
		this.target = target;
	}

	@Override
	public String toString() {
		return super.toString()+"\nincentive: " + incentive + "\ntarget: " + target;
	}

	@Override
	public double calSal() {
		if(target < 10000) {
			incentive = 0;
			return getSalary();
		}
		else return getSalary()+incentive;
	}
	
}

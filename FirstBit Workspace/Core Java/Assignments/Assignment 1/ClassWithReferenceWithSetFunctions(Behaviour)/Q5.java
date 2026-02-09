class HR{

	//Attributes

	int id;
	String hrName;
	double salary;
	int commission;

	void setId(int i){
		this.id = i;
	}

	void setEmpName(String name){
		this.hrName = name;
	}

	void setSalary(double sal){
		this.salary = sal;
	}

	void setCommission(int com){
		this.commission = com;
	}

}//HR class Ends here

class Test5{

	public static void main(String args[]){

		HR hr1 = new HR(); //reference

		//HashCode
		System.out.println("HashCode: " + hr1);

		hr1.setId(102);
		hr1.setEmpName("Raghav");
		hr1.setSalary(10000);
		hr1.setCommission(10);

		//displaying
		System.out.println("\nHR id: " + hr1.id);
		System.out.println("HR Name: " + hr1.hrName);
		System.out.println("HR salary: " + hr1.salary + "rs");
		System.out.println("HR id: " + hr1.commission + "%");

	}//main ends here

}
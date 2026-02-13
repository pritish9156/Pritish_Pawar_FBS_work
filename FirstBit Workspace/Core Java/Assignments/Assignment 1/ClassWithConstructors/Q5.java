class HR{

	//Attributes

	int id;
	String hrName;
	double salary;
	int commission;

	//constructor
	//default

	HR(){
		this.id = -1;
		this.hrName = "Not avilable";
		this.salary = 5000;
		this.commission = 5;
	}


	//parametarised

	HR(int i, String name, double sal, int com){
		this.id = i;
		this.hrName = name;
		this.salary = sal;
		this.commission = com;
	}

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

	//getters

	int getId(){
		return this.id;
	}

	String getEmpName(){
		return this.hrName;
	}

	double getSalary(){
		return this.salary;
	}

	int getCommission(){
		return this.commission;
	}

	void display(){
		System.out.println("\nHR id: " + id);
		System.out.println("HR Name: " + hrName);
		System.out.println("HR salary: " + salary + "rs");
		System.out.println("HR id: " + commission + "%");
	}


}//HR class Ends here

class Test5{

	public static void main(String args[]){

		HR hr1 = new HR(); //reference

		//displaying
		System.out.println("\nHR id: " + hr1.getId());
		System.out.println("HR Name: " + hr1.getEmpName());
		System.out.println("HR salary: " + hr1.getSalary() + "rs");
		System.out.println("HR id: " + hr1.getCommission() + "%");

		hr1.setId(102);
		hr1.setEmpName("Raghav");
		hr1.setSalary(10000);
		hr1.setCommission(10);

		hr1.display();

	}//main ends here

}
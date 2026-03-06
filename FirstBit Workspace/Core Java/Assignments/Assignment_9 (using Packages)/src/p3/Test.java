package p3;

import p1.Employee;
import p2.Admin;
import p2.HR;
import p2.SalesManager;

public class Test {

	public static void main(String[] args) {
		
		Employee[] e1 = new Employee[100];
		
		e1[0] = new Admin(101, "Ramesh", 20000, 10000);
		e1[1] = new HR(102, "Suresh", 15000, 2000);
		e1[2] = new SalesManager(103, "Rajesh", 15000, 50000, 10000);
		
		for(int i=0; i<e1.length; i++) {
			if(e1[i]!=null) {
				System.out.println(e1[i].toString());
				System.out.println("Total cost to company: " + e1[i].calSal());
				System.out.println();
			}
		}

	}

}

package problem_4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class EmployeeView {
	
	EmployeeController empController;
	
	EmployeeView(EmployeeController empController){
		this.empController = empController;
	}

	public void startApplication() {
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("\n\t1.Add Employee\n\t2.View Next Employee\n\t3.View Previous Employee\n\t4.Display All Employees\n\t5.Exit");
			System.out.println("\nEnter your choice: ");
			choice = sc.nextInt();
		
			switch(choice) {
			
				case 1: {
					System.out.println("\nEnter Employee id: ");
					int empId = sc.nextInt();
					
					sc.nextLine();
					System.out.println("\nEnter Employee name: ");
					String empName = sc.nextLine();
					
					System.out.println("\nEnter employee salary: ");
					double empSalary = sc.nextDouble();
					
					Employee employee = new Employee(empId, empName, empSalary);
					
					if(empController.addEmployee(employee)) {
						System.out.println("\n\tEmployee Added Successfully\n");
						empController.initIterator();
					}
					
					break;	
				}
				
				case 2: {
					if(empController.nextEmployee() == null)
						System.out.println("No more employees ahead");
					else
					System.out.println("\n" + empController.nextEmployee() + "\n");
					
					break;
				}
	
				case 3: {
					if(empController.previousEmployee() == null)
						System.out.println("No more employees before");
					else
					System.out.println("\n" + empController.previousEmployee() + "\n");
					break;
				}
	
				case 4: {

					LinkedList emp = empController.displayAllEmployee();
					
					for(int i=0; i<emp.size(); i++) {
						System.out.println(emp.get(i) + "\n");
					}
					
					break;
				}
				
				case 5: {
					break;
				}
			}
		
		}while(choice!=5);
		
	}

}

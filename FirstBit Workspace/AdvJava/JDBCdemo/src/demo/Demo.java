package demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

	public static void main(String args[]) throws IOException {

		
		Scanner sc = new Scanner(System.in);
		EmployeeController ec = new EmployeeController();

		int choice;

		do {
			System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
			System.out.println("1. Add Employee");
			System.out.println("2. Display Employees");
			System.out.println("3. Search Employee");
			System.out.println("4. Update Employee");
			System.out.println("5. Delete Employee");
			System.out.println("6. Sort Employees");
			System.out.println("7. Exit");
			System.out.print("Enter your choice: ");

			choice = sc.nextInt();

			switch (choice) {

			case 1:{

				System.out.println("\nEnter id: ");
				int id = sc.nextInt();
				System.out.println("Enter name: ");
				String name = sc.next();
				System.out.println("Enter salary: ");
				double salary = sc.nextDouble();
				
				Employee emp = new Employee(id, name, salary);

				int res = ec.addEmployee(emp);
				if (res != 0)
					System.out.println("\n\tEmployee added successfully");
				else
					System.out.println("\nfailed");

				break;
			}
			case 2:
			{
				ArrayList<Employee> emplist = ec.displayAllEmployees();
				System.out.println();
				for (Employee e : emplist)
					System.out.println(e);

				break;
			}
			case 3:{
				// SEARCH
				System.out.println("\nSearch Employee");
				int searchChoice;
				do {
				System.out.println("\n\t----Select your choice---\n");
				System.out.println("1.by name");
				System.out.println("2.by employee id");
				System.out.println("3.exit to main menu");
				System.out.println("Enter your choice: ");
				searchChoice = sc.nextInt();
				
				switch(searchChoice) {
					case 1:
					{
						System.out.println("\nEnter employee name: ");
						sc.nextLine();
						String empName = sc.nextLine();
						ArrayList<Employee> result = ec.searchByEmpName(empName);
						System.out.println();
						if(result!=null) {
							for(Employee e:result) {
								System.out.println(e);
							}
						}
						else {
							System.out.println("\n\tEmployee not found...!");
						}
						
						break;
						
					}
					case 2: 
					{

						System.out.println("\nEnter employee Id: ");
						int empId = sc.nextInt();
						Employee result = ec.searchByEmpId(empId);
						System.out.println();
						if(result!=null)
							System.out.println(result);
						else {
							System.out.println("\n\tEmployee not found...!");
						}
						
						break;

					}
					case 3:
						break;
				}
				}while(searchChoice!=3);
				break;
			}
			case 4:{
				// UPDATE
				System.out.println("Update Employee");
				Employee empToUpdate = searchEmployeeDML();
				
				if(empToUpdate==null) {
					System.out.println("\n\tEmployee Not Found...!");
					break;
				}
				System.out.println();
				int searchChoice;
				do {
				System.out.println("\n\t----Select your choice---\n");
				System.out.println("1.update name");
				System.out.println("2.update salary");
				System.out.println("3.exit to main menu");
				System.out.println("Enter your choice: ");
				
				searchChoice = sc.nextInt();
				
				switch(searchChoice) {
					case 1:
					{
						System.out.println("\nEnter employee name: ");
						sc.nextLine();
						String empName = sc.nextLine();
						Boolean result = ec.updateEmployeeName(empToUpdate, empName);
						System.out.println();
						if(result) {
							System.out.println("\n\tEmployee Updated...!");
						}
						else {
							System.out.println("\n\tEmployee not found...!");
						}
						
						break;
						
					}
					case 2: 
					{

						System.out.println("\nEnter admin credentials ");
						System.out.println("username: ");
						sc.nextLine();
						String username = sc.nextLine();
						
						System.out.println("password: ");
						String password = sc.nextLine();
						
						if(username.equals("root") && password.equals("root123"))
						{
							System.out.println("\nEnter employee Salary: ");
							double empSal = sc.nextDouble();
							Boolean result = ec.updateEmpSalary(empToUpdate, empSal);
							System.out.println();
							if(result)
								System.out.println("\n\tEmployee Updated...!");
							else {
								System.out.println("\n\tEmployee not found...!");
							}
						}
						else {
							System.out.println("\n\tWrong Credentials..! Try again");
						}
						
						break;

					}
					case 3:
						break;
				}
				}while(searchChoice!=3);
				
				break;
			}
			case 5:
				// DELETE
				System.out.println("Delete Employee");
				Employee empToDelete = searchEmployeeDML();
				
				if(empToDelete==null) {
					
					System.out.println("\n\tEmployee Not Found..!");
					break;
				}
				
				System.out.println("\nare your sure(yes/no):");
				sc.nextLine();
				String cinform = sc.next();
				
				if(cinform.equalsIgnoreCase("yes")) {
				
					boolean res = ec.deleteEmployee(empToDelete.getId());
					
					if(res)
						System.out.println("\nEmployee Deleted..!");
					else
						System.out.println("\nEmployee Not Found..!");
					}
				break;

			case 6:{
				// SORT
				System.out.println("\nSort Employees");
				int choiceForSort;
				
				do {
					System.out.println("\nEnter Your choice");
					System.out.println("1.Sort by salary");
					System.out.println("2.Exit to main menu");
					System.out.println("Enter your choice: ");
					choiceForSort = sc.nextInt();
					
					switch(choiceForSort) {
						case 1:{
							System.out.println("\nSelecting sorting order");
							System.out.println("1. asscending \n2.descending");
							System.out.println("Enter your choice: ");
							int subChoice = sc.nextInt();
							
							if(subChoice==1 || subChoice==2) {
								ArrayList<Employee> ascEmp = ec.sortEmployeeBySal(subChoice);
								
								if(ascEmp==null) {
									System.out.println("\n\tEmployees Data not aviliable...!");
									break;
								}
								
								System.out.println();
								for(Employee emp : ascEmp) {
									System.out.println(emp.toString());
								}
							}
							else {
								System.out.println("\n\tWrong Choice...!");
							}
							
							break;
						}
						case 2:{
							
							break;
						}
					}
				}while(choiceForSort!=2);
				
				
				break;
			}
			case 7:
				System.out.println("Exiting...");
				for(int i=0; i<1000; i++) {
					System.out.print(".");
				}
				System.out.println("\n\nexited");
				break;

			default:
				System.out.println("\n\tInvalid choice! Please try again");
			}

		} while (choice != 7);

		sc.close();

	}
	
	static Employee searchEmployeeDML() {
		Scanner sc = new Scanner(System.in);
		EmployeeController ec = new EmployeeController();
		
		int searchChoice;
		do {
		System.out.println("\n\t----Select your choice---\n");
		System.out.println("1.by name");
		System.out.println("2.by employee id");
		System.out.println("3.exit to main menu");
		System.out.println("Enter your choice: ");
		searchChoice = sc.nextInt();
		
		switch(searchChoice) {
			case 1:
			{
				System.out.println("\nEnter employee name: ");
				sc.nextLine();
				String empName = sc.nextLine();
				ArrayList<Employee> result = ec.searchByEmpName(empName);
				
				if(result==null) {
					return null;
				}
				System.out.println();
				if(result!=null) {
					for(Employee e:result) {
						System.out.println(e);
					}
				}
				
				if(result.size()>1) {
					System.out.println("\nEnter your employee id to update: ");
					int empIdToUpdate = sc.nextInt();
					
					for(Employee e:result) {
						if(e.getId()==empIdToUpdate)
							return e;
					}
				}
				else {
					return result.get(0);
				}
				
				
				break;
				
			}
			case 2: 
			{

				System.out.println("\nEnter employee Id: ");
				int empId = sc.nextInt();
				Employee result = ec.searchByEmpId(empId);
				System.out.println();
				if(result!=null) {
					System.out.println(result);
					return result;
				}
				else {
					System.out.println("\n\tEmployee not found...!");
				}
				
				break;

			}
			case 3:
				break;
		}
		}while(searchChoice!=3);
		
		return null;
	}
}

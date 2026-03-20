package problem_2;

import java.time.LocalDateTime;
import java.util.*;

public class EmployeeApplication {

	public static void main(String[] args) {
		
		LinkedList empRequests = new LinkedList();

		empRequests.addLast(new EmployeeServiceRequest(101, EmployeeRequest.salaryUpdate, new Employee(101, "Sham", 10000), LocalDateTime.now()));
		empRequests.addLast(new EmployeeServiceRequest(102, EmployeeRequest.salaryUpdate, new Employee(102, "Ramesh", 20000), LocalDateTime.now()));
		empRequests.addLast(new EmployeeServiceRequest(103, EmployeeRequest.salaryUpdate, new Employee(102, "Ramesh", 20000), LocalDateTime.now()));
		empRequests.addLast(new EmployeeServiceRequest(104, EmployeeRequest.salaryUpdate, new Employee(103, "Suresh", 10000), LocalDateTime.now()));
		empRequests.addLast(new EmployeeServiceRequest(105, EmployeeRequest.salaryUpdate, new Employee(104, "Shravni", 20000), LocalDateTime.now()));
		empRequests.addLast(new EmployeeServiceRequest(106, EmployeeRequest.salaryUpdate, new Employee(105, "Sanjay", 10000), LocalDateTime.now()));
		empRequests.addLast(new EmployeeServiceRequest(107, EmployeeRequest.salaryUpdate, new Employee(106, "Arjun", 20000), LocalDateTime.now()));
	
		System.out.println("Current Employee Request: " + empRequests.peekFirst());
		System.out.println("\nRemoving...");
//		for(int i=0; i<empRequests.size(); i++) {
//			empRequests.removeFirst();
//			System.out.println(empRequests.peekFirst());
//		}
		
		empRequests.removeFirst();
		System.out.println(empRequests.peekFirst());
		
		empRequests.removeFirst();
		System.out.println(empRequests.peekFirst());
		
		empRequests.removeFirst();
		System.out.println(empRequests.peekFirst());
		
		empRequests.removeFirst();
		System.out.println(empRequests.peekFirst());
		
		empRequests.removeFirst();
		System.out.println(empRequests.peekFirst());
		
		empRequests.removeFirst();
		System.out.println(empRequests.peekFirst());
		
		empRequests.removeFirst();
		
	}

}

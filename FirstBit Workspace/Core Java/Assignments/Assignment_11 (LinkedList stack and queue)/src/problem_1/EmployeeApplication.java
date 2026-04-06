package problem_1;

import java.time.LocalDateTime;
import java.util.*;

public class EmployeeApplication {

	public static void main(String[] args) {
		
		LinkedList empAction = new LinkedList();
		
		empAction.addFirst(new EmployeeActions(101, ActionPerformed.LOGIN, new Employee(101, "Sham", 10000), LocalDateTime.now()));
		empAction.addFirst(new EmployeeActions(102, ActionPerformed.LOGIN, new Employee(102, "Ramesh", 20000), LocalDateTime.now()));
		empAction.addFirst(new EmployeeActions(103, ActionPerformed.LOGIN, new Employee(102, "Ramesh", 20000), LocalDateTime.now()));
		empAction.addFirst(new EmployeeActions(104, ActionPerformed.LOGIN, new Employee(103, "Suresh", 10000), LocalDateTime.now()));
		empAction.addFirst(new EmployeeActions(105, ActionPerformed.LOGIN, new Employee(104, "Shravni", 20000), LocalDateTime.now()));
		empAction.addFirst(new EmployeeActions(106, ActionPerformed.LOGIN, new Employee(105, "Sanjay", 10000), LocalDateTime.now()));
		empAction.addFirst(new EmployeeActions(107, ActionPerformed.LOGIN, new Employee(106, "Arjun", 20000), LocalDateTime.now()));
		
//		for(int i=0; i<empAction.size(); i++) {
//			System.out.println(empAction.get(i));
//		}
		
		System.out.println("Recent Action Performed by: " + empAction.peekFirst());
		
		System.out.println("\nRemoving..");
		
//		for(int i=0; i<empAction.size(); i++) {
//			
//			empAction.removeFirst();
//			System.out.println(empAction.peekFirst());
//			System.out.println();
//		}
//		
		empAction.removeFirst();
		System.out.println(empAction.peekFirst());
		
		empAction.removeFirst();
		System.out.println(empAction.peekFirst());
		
		empAction.removeFirst();
		System.out.println(empAction.peekFirst());
		
		empAction.removeFirst();
		System.out.println(empAction.peekFirst());
		
		empAction.removeFirst();
		System.out.println(empAction.peekFirst());
		
		empAction.removeFirst();
		System.out.println(empAction.peekFirst());
		
		empAction.removeFirst();
		System.out.println(empAction.peekFirst());
		
	}
}

package problem_1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EmployeeActions {

	int actionId;
	ActionPerformed actionPerformed;
	Employee employee;
	LocalDateTime performedAt;
	DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	public EmployeeActions(int actionId, ActionPerformed actionPerformed, Employee employee,
			LocalDateTime performedAt) {
		
		this.actionId = actionId;
		this.actionPerformed = actionPerformed;
		this.employee = employee;
		this.performedAt = performedAt;
	}

	public int getActionId() {
		return actionId;
	}

	public void setActionId(int actionId) {
		this.actionId = actionId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public LocalDateTime getPerformedAt() {
		return performedAt;
	}

	public void setPerformedAt(LocalDateTime performedAt) {
		this.performedAt = performedAt;
	}
	
	
	public ActionPerformed getActionPerformed() {
		return actionPerformed;
	}

	public void setActionPerformed(ActionPerformed actionPerformed) {
		this.actionPerformed = actionPerformed;
	}


	@Override
	public String toString() {
		return "\nactionId: " + actionId + "\naction: " + actionPerformed +"\nemployee: " + employee.id + "\nperformedAt: " + dateFormatter.format(performedAt);
	}
	
	
}

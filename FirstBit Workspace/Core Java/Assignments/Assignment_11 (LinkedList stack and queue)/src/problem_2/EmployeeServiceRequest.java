package problem_2;

import java.time.LocalDateTime;

public class EmployeeServiceRequest {

	int requestId;
	EmployeeRequest employeeRequest;
	Employee employee;
	LocalDateTime requestedAt;
	
	public EmployeeServiceRequest(int requestId, EmployeeRequest employeeRequest, Employee employee,
			LocalDateTime requestedAt) {
		
		this.requestId = requestId;
		this.employeeRequest = employeeRequest;
		this.employee = employee;
		this.requestedAt = requestedAt;
	}

	@Override
	public String toString() {
		return "\nrequestId: " + requestId + "\nemployeeRequest: " + employeeRequest + "\nemployee Id: "
				+ employee.id + "\nrequestedAt: " + requestedAt;
	}
	
	
	
}

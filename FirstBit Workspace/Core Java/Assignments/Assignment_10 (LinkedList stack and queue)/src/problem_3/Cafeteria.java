package problem_3;

import java.time.LocalDateTime;

public class Cafeteria {
	
	int orderId;
	Employee employee;
	LocalDateTime orderDateTime;
	String orderStatus;
	
	public Cafeteria(int orderId, Employee employee) {
		
		this.orderId = orderId;
		this.employee = employee;
		this.orderDateTime = LocalDateTime.now();
		this.orderStatus = "Order Processing..!";
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public LocalDateTime getOrderDateTime() {
		return orderDateTime;
	}

	public void setOrderDateTime(LocalDateTime orderDateTime) {
		this.orderDateTime = orderDateTime;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Override
	public String toString() {
		return "\norderId: " + orderId + "\nempId: " + employee.id + "\nempName: " + employee.name + "\norderDateTime: "
				+ orderDateTime + "\norderStatus: " + orderStatus;
	}

}

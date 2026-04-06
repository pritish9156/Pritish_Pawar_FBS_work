package problem_3;

import java.util.LinkedList;

public class CafeteriaService {

	static LinkedList ordersList = new LinkedList();
	
	void order(Cafeteria c) {
		
		ordersList.addLast(c);
		
		System.out.println("\nOrder Placed Successfully\n");
		System.out.println("Order information: ");
		System.out.println(c);
		
	}
	
	void serveOrder() {
		if(ordersList.isEmpty()) {
			System.out.println("No order to serve...!");
		}
		
		Cafeteria servedOrder = (Cafeteria) ordersList.poll();
		System.out.println("\nServed Successfuly\n");
		servedOrder.setOrderStatus("Order Served..!");
		System.out.println(servedOrder);
	}
}

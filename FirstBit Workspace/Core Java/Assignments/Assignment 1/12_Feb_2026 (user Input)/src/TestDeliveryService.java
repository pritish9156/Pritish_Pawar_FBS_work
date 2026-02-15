import java.util.Scanner;

class DeliveryService{
	
	int serviceId;
	String deliveryStatus;
	String sourceLocation;
	String destinationLocation;

	//constructors
	//default

	DeliveryService(){
		this.serviceId = -1;
		this.deliveryStatus = "NO data avilable";
		this.sourceLocation = "NO data avilable";
		this.destinationLocation = "NO data avilable";
	}

	//parametarised
	
	DeliveryService(int id, String ds, String sl, String dl){
		this.serviceId = id;
		this.deliveryStatus = ds;
		this.sourceLocation = sl;
		this.destinationLocation = dl;
	}

	void setServiceId(int s){
		this.serviceId = s;
	}

	void setDeliveryStatus(String ds){
		this.deliveryStatus = ds;
	}

	void setSourceLocation(String sl){
		this.sourceLocation = sl;
	}

	void setDestinationLocation(String i){
		this.destinationLocation = i;
	}

	//getters
	int getServiceId(){
		return this.serviceId;
	}

	String getDeliveryStatus(){
		return this.deliveryStatus;
	}

	String getSourceLocation(){
		return this.sourceLocation;
	}

	String getDestinationLocation(){
		return this.destinationLocation;
	}

	//display
	void display(){
		System.out.println("\nService Id: " + serviceId);
		System.out.println("Delivery Status: " + deliveryStatus);
		System.out.println("Source Location: " + sourceLocation);
		System.out.println("Destination Location: " + destinationLocation);
	}

}// DeliveryService ends here

class TestDeliveryService{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter service id: ");
		int packageId = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Watch Delivery Status: ");
		String status = sc.nextLine();
		
		System.out.println("Enter Source Location: ");
		String srcLoc = sc.nextLine();
		
		System.out.println("Enter destination Location: ");
		String destiLoc = sc.nextLine();

		DeliveryService ds1 = new DeliveryService(packageId, status, srcLoc, destiLoc);
				
		ds1.display();
		
		sc.close();

	}//main ends here
}
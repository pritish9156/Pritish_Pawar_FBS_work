class DeliveryService{
	
	int serviceId;
	String deliveryStatus;
	String sourceLocation;
	String destinationLocation;

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

class Test10{

	public static void main(String args[]){

		DeliveryService ds1 = new DeliveryService(); //reference
		
		//HashCode
		System.out.println("\nHashCode: " + ds1);

		//initialization
		ds1.setServiceId(1411);
		ds1.setDeliveryStatus("In Transite");
		ds1.setSourceLocation("Mumbai");
		ds1.setDestinationLocation("Pune");

		//displaying Values
		System.out.println("\nService Id: " + ds1.getServiceId());
		System.out.println("Delivery Status: " + ds1.getDeliveryStatus());
		System.out.println("Source Location: " + ds1.getSourceLocation());
		System.out.println("Destination Location: " + ds1.getDestinationLocation());

		ds1.display();

	}//main ends here
}
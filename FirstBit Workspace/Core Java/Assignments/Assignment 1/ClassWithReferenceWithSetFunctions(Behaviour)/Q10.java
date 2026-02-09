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
		System.out.println("\nService Id: " + ds1.serviceId);
		System.out.println("Delivery Status: " + ds1.deliveryStatus);
		System.out.println("Source Location: " + ds1.sourceLocation);
		System.out.println("Destination Location: " + ds1.destinationLocation);

	}//main ends here
}
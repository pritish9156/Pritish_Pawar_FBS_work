class DeliveryService{
	
	int serviceId;
	String deliveryStatus;
	String sourceLocation;
	String destinationLocation;

}// DeliveryService ends here

class Test10{

	public static void main(String args[]){

		DeliveryService ds1 = new DeliveryService(); //reference
		
		//HashCode
		System.out.println("\nHashCode: " + ds1);

		//initialization
		ds1.serviceId = 1411;
		ds1.deliveryStatus = "In Transite";
		ds1.sourceLocation = "Mumbai";
		ds1.destinationLocation = "Pune";

		//displaying Values
		System.out.println("\nService Id: " + ds1.serviceId);
		System.out.println("Delivery Status: " + ds1.deliveryStatus);
		System.out.println("Source Location: " + ds1.sourceLocation);
		System.out.println("Destination Location: " + ds1.destinationLocation);

	}//main ends here
}
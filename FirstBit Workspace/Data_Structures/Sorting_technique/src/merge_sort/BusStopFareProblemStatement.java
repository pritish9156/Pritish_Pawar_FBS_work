package merge_sort;

public class BusStopFareProblemStatement {

	public static void main(String[] args) {
		
		String[] busStops = {"kothrud Depo", "warje", "karve nagar", 
							"swargate", "deccan", "shivaji nagar"};
		
		int[] fare = {25,20, 10, 15, 12, 7};
		
		String source = "deccan", destination = "warje";
		
		int sourceIndex=-1, destinationIndex=-1;
		
		for(int i=0; i<busStops.length; i++) {
			if(busStops[i].equals(source))
				sourceIndex = i+1;
			
			if(busStops[i].equals(destination))
				destinationIndex = i;
		}
		
		if(sourceIndex != -1 && destinationIndex != -1) {
			System.out.println("Bus Available from " + source +"["+sourceIndex+"]" + " to " + destination +"["+destinationIndex+"]");
		}
		else {
			System.out.println("Bus for the route Not Available for now");
		}
		
		System.out.println("\nPlease Wait calculating fare.........");
		
		int totalFarePrice=0;
		
		for(int i=0; i<fare.length; i++) {
			
			totalFarePrice += fare[sourceIndex];
			sourceIndex++;

			if(destinationIndex+1 == sourceIndex) {
				break;
			}
			
			if(sourceIndex == fare.length)
				sourceIndex = 0;
		}
		
		System.out.println("\nTotal Cost to customer: " + totalFarePrice + "rs");
	}

}

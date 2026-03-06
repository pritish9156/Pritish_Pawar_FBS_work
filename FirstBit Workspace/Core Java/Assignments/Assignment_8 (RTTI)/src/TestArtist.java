import java.util.Scanner;

abstract class Artist extends Object{
	
	String name;
	
	Artist() {
		this.name = "Not Aviliable";
	}
	

	Artist(String name) {
		this.name = name;
	}


	final Artist checkMusicEventEligibility(Artist artist){
		
		System.out.println("\n----------------Please Show Your Identity--------------\n");
		
		if(artist instanceof Musician) {
			Musician m1 = (Musician)artist;
			System.out.println("Welcome Musician Please Pick Your Instrument");
			System.out.println("Musician " + this.name + " is allowed for the Music Event and is playing " + m1.getInstrument());
		}else if(artist instanceof Painter) 
			System.out.println("Sorry Painter "+ this.name + " Entry Not Allowed Please Visit Next Time..!");
		else if(artist instanceof Actor) 
			System.out.println("Sorry Actor "+ this.name + " Entry Not Allowed Please Visit Next Time..!");
		
		return artist;
	}
	
}//class artist ends here

class Painter extends Artist{
	
	Painter() {
		super();
	}
	
	Painter(String name) {
		super(name);
	}

	String getEquipments() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n1.Brush\n2.Paper\n3.Colors");
		System.out.println("Pick Your Instrument: ");
		int choice = sc.nextInt();
		
		switch(choice) {
			case 1:
				System.out.println("\nBrush Picked up...!");
				return "Brush";
			case 2:
				System.out.println("\nPaper Picked up...!");
				return "Paper";
			case 3:
				System.out.println("\nColors picked up...!");
				return "Colors";
			default:
				System.out.println("\nWrong choice...!");
				return "Instrument Not Selected";
		}
	}
	
}//class painter ends here

class Musician extends Artist{
	
	Musician() {
		super();
	}
	
	Musician(String name) {
		super(name);
	}

	String getInstrument() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n1.Guitar\n2.Flute\n3.Drum Set");
		System.out.println("Pick Your Instrument: ");
		int choice = sc.nextInt();
		
		switch(choice) {
			case 1:
				System.out.println("\nGuitar Picked up...!");
				return "Guitar";
			case 2:
				System.out.println("\nFlute Picked up...!");
				return "Flute";
			case 3:
				System.out.println("\nDrum Set picked up...!");
				return "Drum Set";
			default:
				System.out.println("\nWrong choice...!");
				return "Instrument Not Selected";
		}
	}
}//class musician ends here

class Actor extends Artist{
	
	Actor() {
		super();
	}
	
	Actor(String name) {
		super(name);
	}

	String getProps() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n1.Guitar\n2.Flowers\n3.Goggles");
		System.out.println("Pick Your Instrument: ");
		int choice = sc.nextInt();
		
		switch(choice) {
			case 1:
				System.out.println("\nGuitar Picked up...!");
				return "Guitar";
			case 2:
				System.out.println("\nFlowers Picked up...!");
				return "Flowers";
			case 3:
				System.out.println("\nGoggles picked up...!");
				return "Goggles";
			default:
				System.out.println("\nWrong choice...!");
				return "Instrument Not Selected";
		}
	}
}//class actor ends here


public class TestArtist {

	public static void main(String[] args) {
		
		Artist[] artist1 = new Artist[100];
		
		artist1[0] = new Painter("Ramesh");
		artist1[1] = new Musician("Suresh");
		artist1[2] = new Actor("Rajesh");
		artist1[3] = new Musician("Mahesh");
		
		
		for(int i=0; i<artist1.length; i++) {
			if(artist1[i] != null) artist1[i].checkMusicEventEligibility(artist1[i]);
		}
	}

}

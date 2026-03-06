class Player{
	String name;
	int age;
	String country;
	int matchesPlayed;
	int jerseyNumber;
	
	public Player() {
		// TODO Auto-generated constructor stub
		this.name = "Not Given";
		this.age = 0;
		this.country = "Not Given";
		this.matchesPlayed = 0;
		this.jerseyNumber = 0;
	}

	Player(String name, int age, String country, int matchesPlayed, int jerseyNumber) {
		this.name = name;
		this.age = age;
		this.country = country;
		this.matchesPlayed = matchesPlayed;
		this.jerseyNumber = jerseyNumber;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	String getCountry() {
		return country;
	}

	void setCountry(String country) {
		this.country = country;
	}

	int getMatchesPlayed() {
		return matchesPlayed;
	}

	void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}

	int getJerseyNumber() {
		return jerseyNumber;
	}

	void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	@Override
	public String toString() {
		return "name= " + name + "\nage= " + age + "\ncountry= " + country + "\nmatchesPlayed= " + matchesPlayed
				+ "\njerseyNumber= " + jerseyNumber;
	}
	
	void getBall(){
		System.out.println("Getting Ball..!");
	}
	
}

class CricketPlayer extends Player{
	int totalRuns;
	int totalWickets;
	String battingStyle;
	String bowlingStyle;
	
	public CricketPlayer() {
		// TODO Auto-generated constructor stub
		super();
		this.totalRuns = 0;
		this.totalWickets = 0;
		this.battingStyle = "Not Given";
		this.bowlingStyle = "Not Given";
	}

	CricketPlayer(String name, int age, String country, int matchesPlayed, int jerseyNumber, int totalRuns, int totalWickets, String battingStyle, String bowlingStyle) {
		super(name, age, country, matchesPlayed, jerseyNumber);
		this.totalRuns = totalRuns;
		this.totalWickets = totalWickets;
		this.battingStyle = battingStyle;
		this.bowlingStyle = bowlingStyle;
	}

	int getTotalRuns() {
		return totalRuns;
	}

	void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}

	int getTotalWickets() {
		return totalWickets;
	}

	void setTotalWickets(int totalWickets) {
		this.totalWickets = totalWickets;
	}

	String getBattingStyle() {
		return battingStyle;
	}

	void setBattingStyle(String battingStyle) {
		this.battingStyle = battingStyle;
	}

	String getBowlingStyle() {
		return bowlingStyle;
	}

	void setBowlingStyle(String bowlingStyle) {
		this.bowlingStyle = bowlingStyle;
	}

	@Override
	public String toString() {
		return super.toString()+"\ntotalRuns= " + totalRuns + "\ntotalWickets= " + totalWickets + ", \nbattingStyle= "
				+ battingStyle + ", \nbowlingStyle= " + bowlingStyle;
	}
	
	void getBall(){
		System.out.println("Getting Cork-and-twine ball Covered in stitched leather..!");
	}
}

class FootballPlayer extends Player{
	int totalGoals;
	String playingPosition;
	
	public FootballPlayer() {
		// TODO Auto-generated constructor stub
		super();
		this.totalGoals = 0;
		this.playingPosition = "Not Given";
	}

	FootballPlayer(String name, int age, String country, int matchesPlayed, int jerseyNumber, int totalGoals, String playingPosition) {
		super(name, age, country, matchesPlayed, jerseyNumber);
		this.totalGoals = totalGoals;
		this.playingPosition = playingPosition;
	}

	int getTotalGoals() {
		return totalGoals;
	}

	void setTotalGoals(int totalGoals) {
		this.totalGoals = totalGoals;
	}

	String getPlayingPosition() {
		return playingPosition;
	}

	void setPlayingPosition(String playingPosition) {
		this.playingPosition = playingPosition;
	}

	@Override
	public String toString() {
		return super.toString()+"\ntotalGoals= " + totalGoals + "\nplayingPosition= " + playingPosition;
	}
	
	void getBall(){
		System.out.println("Getting Soccer Ball cowhide leather..!");
	}
	
	
}//football class ends here

public class TestPlayer {

	public static void main(String[] args) {
		
		Player[] p = new Player[100];
		
		p[0] = new CricketPlayer("Pritish Pawar", 22, "India", 100, 91, 1000, 500, "As Usual", "Cant Predict");
		p[1] = new FootballPlayer("Ramesh", 25, "India", 40, 30, 10, "Goal keeper");
		
		for(int i=0; p[i]!=null&&i<p.length; i++) {
			System.out.println(p[i]);
			p[i].getBall();
			System.out.println();
		}
		

	}

}
